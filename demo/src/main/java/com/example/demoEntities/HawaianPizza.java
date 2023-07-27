package com.example.demoEntities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class HawaianPizza extends AbPizza implements IPizza {


	private String ingredientHawaian = ingredientsBase + ", ham, pineapple";

	public HawaianPizza(Size size) {
		super(size);
	}


	@Override
	public String getNamePizza() {
		String name = "Hawaian Pizza";
		this.name = name;
		return name;
	}

	@Override
	public double getCalories() {
		double calories;
		if (this.size == Size.STANDARD) {
			calories = 1024;
		} else {
			calories = 1024 * 1.94;
		}

		calories = Math.round(calories * 100.0) / 100.0;
		this.calories = calories;
		return calories;
	}

	@Override
	public double getPrice() {
		if (this.size == Size.STANDARD) {
			double priceStandard = 6.49;
			this.price = priceStandard;
			return price;
		} else {
			double priceFamily = 6.49 + 4.15;
			this.price = priceFamily;
			return priceFamily;
		}

	}

	@Override
	public Size getSize() {
		if (this.size == Size.FAMILY) {
			return Size.FAMILY;
		} else {
			return Size.STANDARD;
		}

	}

	@Override
	public String toString() {
		return "Hawaian Pizza (" + this.ingredientHawaian + "), Size: " + this.getSize() + ", Calories: "
				+ this.getCalories() + " kcal" + ", Price: " + this.getPrice() + " $";
	}



}
