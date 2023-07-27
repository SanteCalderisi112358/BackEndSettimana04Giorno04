package com.example.demoEntities;

public class Cheese extends AbTopping implements ITopping {

	@Override
	public String getNameTopping() {

		return "Cheese";
	}

	@Override
	public int getCaloriesTopping() {
		return 92;
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
