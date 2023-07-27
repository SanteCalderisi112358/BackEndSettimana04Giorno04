package com.example.demoEntities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TableService {
	@Autowired
	TableRepository tableRepo;

	public void create(Table table) {
		tableRepo.save(table);
		log.info("La pizza è stata salvata");
	}
}
