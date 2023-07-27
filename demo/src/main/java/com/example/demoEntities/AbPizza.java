package com.example.demoEntities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pizzas")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class AbPizza {
	@Id
	@GeneratedValue
	public UUID id;
	protected String ingredientsBase = "tomato,cheese";
	@Enumerated(EnumType.STRING)
	protected Size size;

	public double price;
	public double calories;
	public String name;
	public AbPizza(Size size) {
		

		this.size = size;
	}

}
