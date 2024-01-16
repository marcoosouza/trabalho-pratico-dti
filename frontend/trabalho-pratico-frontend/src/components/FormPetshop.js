import { useState } from 'react';
import '../App.css';

function PetShopForm() {
    const [date, setDate] = useState("");
    const [numSmallDog, setNumSmallDog] = useState("");
    const [numBigDog, setNumBigDog] = useState("");
    const [bestChoice, setBestChoice] = useState("")
    const [valueBestChoice, setValueBestChoice] = useState("");

    const handleClick = (e) => {
        e.preventDefault()
        const petShop = { date, numSmallDog, numBigDog }
        console.log(petShop)
        fetch("http://localhost:8080/bestchoice", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(petShop),

        })
            .then((response) => {
                if (!response.ok) {
                    throw new Error(`Error response: ${response.status}`);
                }
                return response.json();
            })
            .then((data) => {
                console.log(data);
                setBestChoice(data.bestchoice)
                setValueBestChoice(data.value)
            })
            .catch((error) => {
                console.log("Erro na requisição:", error);
            });
    }

    return (
        <div className='form-container'>
            <form className='form'>
                <p>Descubra o Melhor Pet Shop</p>
                <label>
                    Selecione a data:
                </label>
                <input
                    type='date'
                    value={date}
                    onChange={(e) => setDate(e.target.value)}
                />
                <label>
                    Selecione a quantidade de cachorros pequenos:
                </label>
                <input
                    type='number'
                    min={0}
                    value={numSmallDog}
                    onChange={(e) => setNumSmallDog(e.target.value)}
                />
                <label>
                    Selecione a quantidade de cachorros grandes:

                </label>
                <input
                    type='number'
                    min={0}
                    value={numBigDog}
                    onChange={(e) => setNumBigDog(e.target.value)}
                />
                <button onClick={handleClick}>Enter</button>
            </form>

            <p>A melhor opção é: {bestChoice}</p>
            <p>O valor total é: {valueBestChoice}R$</p>
        </div>
    )
}

export default PetShopForm