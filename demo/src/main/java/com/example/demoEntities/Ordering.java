package com.example.demoEntities;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@PropertySource("classpath:application.properties")

public class Ordering {
	private int numberOrder;
	private String note;
	private Table table;
	private int numberPeople;
	private LocalTime time;
	@Value("${application.coperto}")
	private double cover;
	private List<AbPizza> pizzasOrdered;
	private List<AbDrink> drinksOrdered;
	private List<AbTopping> toppingsOrdered;

	public Ordering(int numberOrder, String note, Table table, int numberPeople, LocalTime time,
			List<AbPizza> pizzasOrdered, List<AbDrink> drinksOrdered, List<AbTopping> toppingsOrdered) {

		this.numberOrder = numberOrder;
		this.note = note;
		this.table = table;
		this.numberPeople = numberPeople;
		this.time = time;
		this.pizzasOrdered = pizzasOrdered;
		this.drinksOrdered = drinksOrdered;
		this.toppingsOrdered = toppingsOrdered;
	}

	


	public double getTotalPrice() {
		double totalPrice = 0;


		for (AbPizza pizza : pizzasOrdered) {
			if (pizza instanceof Margherita) {
				Margherita margheritaPizza = (Margherita) pizza;
				totalPrice += margheritaPizza.getPrice();
			} else if (pizza instanceof SalamiPizza) {
				SalamiPizza salamiPizza = (SalamiPizza) pizza;
				totalPrice += salamiPizza.getPrice();
			} else if (pizza instanceof HawaianPizza) {
				HawaianPizza hawaianPizza = (HawaianPizza) pizza;
				totalPrice += hawaianPizza.getPrice();
			}
		}


		for (AbDrink drink : drinksOrdered) {
			if (drink instanceof Water) {
				Water water = (Water) drink;
				totalPrice += water.getPriceDrink();
			} else if (drink instanceof Wine) {
				Wine wine = (Wine) drink;
				totalPrice += wine.getPriceDrink();
			} else if (drink instanceof Lemonade) {
				Lemonade lemonade = (Lemonade) drink;
				totalPrice += lemonade.getPriceDrink();
			}
		}


		for (AbTopping topping : toppingsOrdered) {
			if (topping instanceof Onions) {
				Onions onion = (Onions) topping;
				totalPrice += onion.getPriceTopping();
			} else if (topping instanceof Ham) {
				Ham ham = (Ham) topping;
				totalPrice += ham.getPriceTopping();
			} else if (topping instanceof Pineapple) {
				Pineapple pineapple = (Pineapple) topping;
				totalPrice += pineapple.getPriceTopping();
			} else if (topping instanceof Cheese) {
				Cheese cheese = (Cheese) topping;
				totalPrice += cheese.getPriceTopping();
			}
		}

		return totalPrice;
	}

	public double getTotalCalories() {
		double totalCalories = 0;

		for (AbPizza pizza : pizzasOrdered) {
			if (pizza instanceof Margherita) {
				Margherita margheritaPizza = (Margherita) pizza;
				totalCalories += margheritaPizza.getCalories();
			} else if (pizza instanceof SalamiPizza) {
				SalamiPizza salamiPizza = (SalamiPizza) pizza;
				totalCalories += salamiPizza.getCalories();
			} else if (pizza instanceof HawaianPizza) {
				HawaianPizza hawaianPizza = (HawaianPizza) pizza;
				totalCalories += hawaianPizza.getCalories();
			}
		}

		for (AbDrink drink : drinksOrdered) {
			if (drink instanceof Water) {
				Water water = (Water) drink;
				totalCalories += water.getCaloriesDrink();
			} else if (drink instanceof Wine) {
				Wine wine = (Wine) drink;
				totalCalories += wine.getCaloriesDrink();
			} else if (drink instanceof Lemonade) {
				Lemonade lemonade = (Lemonade) drink;
				totalCalories += lemonade.getCaloriesDrink();
			}
		}

		for (AbTopping topping : toppingsOrdered) {
			if (topping instanceof Onions) {
				Onions onion = (Onions) topping;
				totalCalories += onion.getCaloriesTopping();
			} else if (topping instanceof Ham) {
				Ham ham = (Ham) topping;
				totalCalories += ham.getCaloriesTopping();
			} else if (topping instanceof Pineapple) {
				Pineapple pineapple = (Pineapple) topping;
				totalCalories += pineapple.getCaloriesTopping();
			} else if (topping instanceof Cheese) {
				Cheese cheese = (Cheese) topping;
				totalCalories += cheese.getCaloriesTopping();
			}
		}

		return totalCalories;
	}
	@Override
	public String toString() {
		return "Ordering number = " + numberOrder + "\nNote = " + note + "\nTable = " + table + "\nNumber People = "
				+ numberPeople + "\nTime = " + time + "\nPizzas Ordered= " + pizzasOrdered + "\nDrinks Ordered= "
				+ drinksOrdered + "\nToppings Ordered = " + toppingsOrdered + "]";
	}
}
