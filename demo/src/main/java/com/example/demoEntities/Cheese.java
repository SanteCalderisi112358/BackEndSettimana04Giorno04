package com.example.demoEntities;

import jakarta.persistence.Entity;

@Entity
public class Cheese extends AbTopping implements ITopping {

	@Override
	public String getNameTopping() {
		String name = "Cheese";
		this.name = name;
		return name;
	}

	@Override
	public int getCaloriesTopping() {
		int calories = 92;
		this.calories = calories;
		return calories;
	}

	@Override
	public double getPriceTopping() {
		double price = 0.69;
		this.price = price;
		return price;
	}

	@Override
	public String toString() {
		return this.getNameTopping() + ", Calories: " + this.getCaloriesTopping() + " kcal" + ", Price: "
				+ this.getPriceTopping() + " $";
	}
}
