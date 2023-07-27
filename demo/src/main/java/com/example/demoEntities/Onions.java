package com.example.demoEntities;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Onions extends AbTopping implements ITopping {

	@Override
	public String getNameTopping() {
		return "Onions";
	}

	@Override
	public int getCaloriesTopping() {
		return 22;
	}

	@Override
	public double getPriceTopping() {
		return 0.69;
	}

	@Override
	public String toString() {
		return this.getNameTopping() + ", Calories: " + this.getCaloriesTopping() + " kcal" + ", Price: "
				+ this.getPriceTopping() + " $";
	}
}
