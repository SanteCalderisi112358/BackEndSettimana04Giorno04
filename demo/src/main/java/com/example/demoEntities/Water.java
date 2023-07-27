package com.example.demoEntities;

public class Water extends AbDrink implements IDrink {

	@Override
	public String getNameDrink() {
		return "Water";
	}

	@Override
	public double getSizeDrink() {
		return 0.5;
	}

	@Override
	public int getCaloriesDrink() {
		return 0;
	}

	@Override
	public double getPriceDrink() {
		return 1.29;
	}

	@Override
	public String toString() {
		return this.getNameDrink() + "(" + this.getSizeDrink() + "L)" + ", Calories: " + this.getCaloriesDrink()
				+ " kcal"
				+ ", Price: " + this.getPriceDrink() + " $";
	}

}
