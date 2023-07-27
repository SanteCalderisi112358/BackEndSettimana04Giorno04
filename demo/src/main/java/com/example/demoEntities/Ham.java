package com.example.demoEntities;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Ham extends AbTopping implements ITopping {

	@Override
	public String getNameTopping() {
		return "Ham";
	}

	@Override
	public int getCaloriesTopping() {
		return 35;
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
