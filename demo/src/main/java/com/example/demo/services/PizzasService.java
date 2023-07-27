package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoEntities.AbPizza;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class PizzasService {
	@Autowired
	private PizzasRepository pizzaRepo;

	public void create(AbPizza pizza) {
		pizzaRepo.save(pizza);
		log.info("La pizza è stata salvata");
	}
}
