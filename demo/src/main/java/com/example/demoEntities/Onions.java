package com.example.demoEntities;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity

public class Onions extends AbTopping implements ITopping {

	@Override
	public String getNameTopping() {
		String name = "Onions";
		this.name = name;
		return name;
	}

	@Override
	public int getCaloriesTopping() {
		int calories = 22;
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
