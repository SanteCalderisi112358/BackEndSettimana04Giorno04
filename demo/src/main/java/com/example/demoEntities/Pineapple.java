package com.example.demoEntities;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Pineapple extends AbTopping implements ITopping {

	@Override
	public String getNameTopping() {
		return "Pineaplle";
	}

	@Override
	public int getCaloriesTopping() {
		return 24;
	}

	@Override
	public double getPriceTopping() {
		return 0.79;
	}

	@Override
	public String toString() {
		return this.getNameTopping() + ", Calories: " + this.getCaloriesTopping() + " kcal" + ", Price: "
				+ this.getPriceTopping() + " $";
	}
}
