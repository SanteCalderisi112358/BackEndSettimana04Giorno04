package com.example.demoEntities;

import jakarta.persistence.Entity;

@Entity
public class Wine extends AbDrink implements IDrink {
	private int alcool;
	@Override
	public String getNameDrink() {
		String name = "Wine";
		this.name = name;
		return name;
	}

	@Override
	public double getSizeDrink() {
		double sizeDrink = 0.75;
		this.sizeDrink = sizeDrink;
		return sizeDrink;
	}

	@Override
	public int getCaloriesDrink() {
		int calories = 607;
		this.calories = calories;
		return calories;
	}

	@Override
	public double getPriceDrink() {
		double price = 7.49;
		this.price = price;

		return price;
	}

	public int getAlcool() {
		int alcool = 13;
		this.alcool = alcool;
		return alcool;
	}

	@Override
	public String toString() {
		return this.getNameDrink() + "(" + this.getSizeDrink() + "L," + this.getAlcool() + "%)" + ", Calories: "
				+ this.getCaloriesDrink()
				+ " kcal" + ", Price: " + this.getPriceDrink() + " $";
	}
}
