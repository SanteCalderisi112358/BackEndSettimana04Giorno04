package com.example.demoEntities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToppingService {
	@Autowired
	ToppingRepository toppingRepo;

	public void create(AbTopping topping) {
		toppingRepo.save(topping);
	}
}
