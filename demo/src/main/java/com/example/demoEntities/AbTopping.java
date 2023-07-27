package com.example.demoEntities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "toppings")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class AbTopping {
	@Id
	@GeneratedValue
	public UUID id;
	public String name;
	public int calories;
	public double price;
	

}
