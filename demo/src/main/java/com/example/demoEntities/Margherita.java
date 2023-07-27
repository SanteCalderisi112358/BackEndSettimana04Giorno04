package com.example.demoEntities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Margherita extends AbPizza implements IPizza {



	public Margherita(Size size) {
		super(size);


	}

	@Override
	public String getNamePizza() {
		String name = "Margherita";
		this.name = name;
		return name;
	}

	@Override
	public double getCalories() {
		double calories;
		if (this.size == Size.STANDARD) {
			calories = 1104;
		} else {
			calories = 1104 * 1.94;
		}

		calories = Math.round(calories * 100.0) / 100.0;
		this.calories = calories;
		return calories;
	}


	@Override
	public double getPrice() {
		if (this.size == Size.STANDARD) {
			double priceStandard = 4.99;
			this.price = priceStandard;
			return price;
		} else {
			double priceFamily = 4.99 + 4.15;
			this.price = priceFamily;
			return priceFamily;
		}

	}

	@Override
	public Size getSize() {
		if (this.size == Size.FAMILY) {
			this.size = Size.FAMILY;
			return Size.FAMILY;
		} else {
			this.size = Size.STANDARD;
			return Size.STANDARD;
		}

	}

	@Override
	public String toString() {

		return "Margherita Pizza (" + this.ingredientsBase + "), Size: " + this.size + ", Calories: "
				+ this.getCalories()
				+ " kcal"
				+ ", Price: " + getPrice() + " $";
	}




}
