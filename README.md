# Trabalho Pratico DTI
Este projeto foi concebido para oferecer uma solução eficiente na escolha do melhor pet shop para o Senhor Eduardo, proprietário de um canil em Belo Horizonte.

# Premissas Assumidas
No desenvolvimento deste projeto, algumas suposições foram necessárias para viabilizar a implementação e orientar as escolhas durante o processo. Abaixo, destacam-se as principais suposições adotadas:

1. **Estabilidade na Precificação e Distâncias**:
Supõe-se que as informações de preços fornecidas pelos pet shops - "Meu Canino Feliz", "Vai Rex" e "ChowChawgas" - permaneçam constantes durante a execução do programa.. Da mesma forma, a distância entre o canil de Eduardo e os pet shops é considerada estática e precisa.

2. **Correto Fornecimento de Dados de Entrada**:
Assume-se que o usuário fornecerá corretamente as informações necessárias no formato esperado, incluindo o tamanho dos cães (pequenos ou grandes) e a data desejada para o agendamento do banho.

3. **Foco Exclusivo na Eficiência de Custo**:
O principal critério para determinar o melhor pet shop é o custo total do banho, considerando a distância até o canil de Eduardo apenas em caso de empate entre os valores dos pet shops. 


# Decisões do projeto
Este projeto foi moldado por escolhas estratégicas que orientam o seu desenvolvimento e aprimoramento contínuo. As principais decisões tomadas durante o processo, seguem abaixo:

1. **Tecnologias Utilizadas**:
Optou-se por utilizar tecnologias modernas e mercadologicas para cumprir aos requisitos do projeto. O backend foi desenvolvido em Java em conjunto com a framework Spring Boot. Já o frontend foi construído com React, uma biblioteca JavaScript.

2. **Integração de Informações via Banco de Dados**:
Reconhecendo a necessidade de integrar informações sobre os pet shops, optou-se por simular a interação com um banco de dados. Foi escolhido o banco de dados H2, um sistema relacional em Java. Nessa simulação, o banco de dados é manualmente preenchido com as informações específicas de cada pet shop ao iniciar o servidor e é removido ao encerrar o mesmo. Essa abordagem foi escolhida para aproximar o teste da realidade do desenvolvimento de software, proporcionando uma experiência mais próxima do ambiente prático.

3. **Foco na Eficiência e Facilidade de Manutenção**:
A escolha de Spring Boot e React como pilares tecnológicos teve como objetivo não apenas atender às exigências do projeto, mas também garantir uma arquitetura moderna, eficiente e de fácil manutenção. A utilização dessas tecnologias reflete o compromisso com a eficiência no backend e a experiência dinâmica no frontend, contribuindo para uma solução robusta e adaptável.

4. **Aprimoramento Contínuo**:
Devido ao tempo disponibilizado, é necessário aprimorar o projeto. Assim, é interessante fazer melhorias no futuro para adicionar mais funcionalidades, acompanhando as mudanças nas necessidades e tecnologias. A estrutura do projeto foi organizada de forma modular para facilitar a inclusão novas funcionalidades. Essa abordagem visa garantir que o projeto permaneça relevante e útil em um ambiente e em constante evolução.

# Instruções para executar o sistema
Para a execusão do sistema siga as seguintes etapas:
1. Clone o repositório para a sua máquina local: 
```https://github.com/marcoosouza/trabalho-pratico-dti.git```

2. Navegue até o diretório do projeto:
```cd trabalho-pratico-dti```

3. Dentro do diretório, você encontrará duas subpastas, "backend" e "frontend". Para iniciar o servidor, vá até o diretório "backend" e, em seguida, para "teste_pratico_backend":
```cd backend/teste_pratico_backend/```

4. No diretório acima, execute o seguinte comando: ```./mvnw spring-boot:run```. Se tudo estiver correto, o servidor iniciará em http://localhost:8080/.

5. Em seguida, no terminal, execute: ```cd ../../frontend/trabalho-pratico-frontend/```, Este comando levará você de volta ao diretório do frontend.

6. Seguido o passo anterior execute ```npm install``` e em seguida ```npm start```. O aplicativo estará disponível em http://localhost:3000.
