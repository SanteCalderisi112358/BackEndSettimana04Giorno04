package com.example.demoEntities;

import jakarta.persistence.Entity;

@Entity
public class Lemonade extends AbDrink implements IDrink {

	@Override
	public String getNameDrink() {
		String name = "Lemonade";
		this.name = name;
		return name;
	}

	@Override
	public double getSizeDrink() {
		double sizeDrink = 0.33;
		this.sizeDrink = sizeDrink;
		return sizeDrink;
	}

	@Override
	public int getCaloriesDrink() {
		int calories = 128;
		this.calories = calories;
		return calories;
	}

	@Override
	public double getPriceDrink() {
		double price = 1.29;
		this.price = price;

		return price;
	}

	@Override
	public String toString() {
		return this.getNameDrink() + "(" + this.getSizeDrink() + "L)" + ", Calories: " + this.getCaloriesDrink()
				+ " kcal"
				+ ", Price: " + this.getPriceDrink() + " $";
	}
}
