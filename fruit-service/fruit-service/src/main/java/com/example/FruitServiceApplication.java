package com.example;

import com.example.domain.Fruit;
import com.example.repository.FruitRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class FruitServiceApplication implements CommandLineRunner {

	@Autowired
	FruitRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(FruitServiceApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Fruit fruit1 = new Fruit("pomme-9090", "Maroc", 45);
		Fruit fruit2 = new Fruit("poire-9090", "France", 75);
		Fruit fruit3 = new Fruit("orange-9090", "Maroc", 66);
		Fruit fruit4 = new Fruit("raisin-9090", "Maroc", 105);
		Fruit fruit5 = new Fruit("mangue-9090", "Italie", 105);
		repository.save(fruit1);
		repository.save(fruit2);
		repository.save(fruit3);
		repository.save(fruit4);
		repository.save(fruit5);
	}
}

