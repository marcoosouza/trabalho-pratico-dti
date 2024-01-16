package com.marco.TestePratico;

import com.marco.TestePratico.model.PetShop;
import com.marco.TestePratico.repository.PetShopRepository;
import com.marco.TestePratico.service.PetShopService;
import com.marco.TestePratico.service.PetShopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import java.util.Arrays;

@SpringBootApplication
public class TestePraticoApplication implements CommandLineRunner{
	@Autowired
	private PetShopRepository petShopRepository;
	@Autowired
	private PetShopServiceImpl petShopService;

	public static void main(String[] args) {
		SpringApplication.run(TestePraticoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PetShop meuCaninoFeliz = new PetShop("Meu Canino Feliz", 20, 24,40, 48,2000);
		PetShop vaiRex = new PetShop("Vai Rex", 15, 20,50, 55,1700);
		PetShop chowChawgas = new PetShop("ChowChawgas", 30, 30, 45, 45, 800);

		petShopRepository.save(meuCaninoFeliz);
		petShopRepository.save(vaiRex);
		petShopRepository.save(chowChawgas);

	}
}
