package com.example.demoEntities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinkService {
	@Autowired
	DrinkRepository drinkRepo;

	public void create(AbDrink drink) {
		drinkRepo.save(drink);
	}
}
