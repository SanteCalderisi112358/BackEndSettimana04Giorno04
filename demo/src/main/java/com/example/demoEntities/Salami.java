package com.example.demoEntities;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Salami extends AbTopping implements ITopping {

	@Override
	public String getNameTopping() {
		return "Salami";
	}

	@Override
	public int getCaloriesTopping() {
		return 86;
	}

	@Override
	public double getPriceTopping() {
		return 0.99;
	}

	@Override
	public String toString() {
		return this.getNameTopping() + ", Calories: " + this.getCaloriesTopping() + " kcal" + ", Price: "
				+ this.getPriceTopping() + " $";
	}

}
