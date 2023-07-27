package com.example.demoEntities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansConfiguration {
	
	

	@Bean
	Margherita getMargheritaFamily() {
		return new Margherita(Size.FAMILY);
	}

	@Bean
	Margherita getMargheritaStandard() {
		return new Margherita(Size.STANDARD);
	}

	@Bean
	HawaianPizza getHawaianPizzaFamily() {
		return new HawaianPizza(Size.FAMILY);
	}

	@Bean
	HawaianPizza getHawaianPizzaStandard() {
		return new HawaianPizza(Size.STANDARD);
	}

	@Bean
	SalamiPizza getSalamiPizzaFamily() {
		return new SalamiPizza(Size.FAMILY);
	}

	@Bean
	SalamiPizza getSalamiPizzaStandard() {
		return new SalamiPizza(Size.STANDARD);
	}

	@Bean
	Cheese getCheese() {
		return new Cheese();
	}

	@Bean
	Ham getHam() {
		return new Ham();
	}

	@Bean
	Onions getOnion() {
		return new Onions();
	}

	@Bean
	Salami getSalami() {
		return new Salami();
	}

	@Bean
	Pineapple getPineapple() {
		return new Pineapple();
	}

	@Bean
	Water getWater() {
		return new Water();
	}

	@Bean
	Lemonade getLemonade() {
		return new Lemonade();
	}

	@Bean
	Wine getWine() {
		return new Wine();
	}

	@Bean
	Shirt getShirt() {
		return new Shirt();
	}

	@Bean
	Mug getMug() {
		return new Mug();
	}

	@Bean
	Table getTable01() {
		return new Table(StateTable.LIBERO, 1, 4);
	}

	@Bean
	Table getTable02() {
		return new Table(StateTable.OCCUPATO, 2, 5);
	}

	@Bean
	Table getTable03() {
		return new Table(StateTable.LIBERO, 3, 6);
	}

	@Bean
	Table getTable04() {
		return new Table(StateTable.OCCUPATO, 4, 10);
	}

	@Bean
	Table getTable05() {
		return new Table(StateTable.LIBERO, 5, 15);
	}

	@Bean
	@Scope("prototype")
	Table getTable() {
		return new Table();
	}

	@Bean
	List<AbPizza> getPizzasOrdering01() {
		List<AbPizza> pizzasOrdering01list = new ArrayList<AbPizza>();
		pizzasOrdering01list.add(getHawaianPizzaFamily());
		pizzasOrdering01list.add(getMargheritaStandard());
		pizzasOrdering01list.add(getSalamiPizzaStandard());
		return pizzasOrdering01list;
	}

	@Bean
	List<AbDrink> getDrinksOrdering01() {
		List<AbDrink> drinksOrdering01List = new ArrayList<AbDrink>();
		drinksOrdering01List.add(getLemonade());
		drinksOrdering01List.add(getWater());
		drinksOrdering01List.add(getWater());
		drinksOrdering01List.add(getWine());
		return drinksOrdering01List;

	}

	@Bean
	List<AbTopping> getToppingsOrdering01() {
		List<AbTopping> toppingsOrdering01 = new ArrayList<AbTopping>();
		toppingsOrdering01.add(getCheese());
		toppingsOrdering01.add(getCheese());
		toppingsOrdering01.add(getOnion());
		return toppingsOrdering01;

	}

	@Bean
	Ordering getOrdering01() {
		return new Ordering(1, "sparkling water", getTable01(), 4, LocalTime.of(20, 32), getPizzasOrdering01(),
				getDrinksOrdering01(), getToppingsOrdering01());
	}

	@Bean
	List<AbPizza> getPizzasOrdering02() {
		List<AbPizza> pizzasOrdering01list = new ArrayList<AbPizza>();
		pizzasOrdering01list.add(getMargheritaFamily());
		pizzasOrdering01list.add(getMargheritaFamily());

		return pizzasOrdering01list;
	}

	@Bean
	List<AbDrink> getDrinksOrdering02() {
		List<AbDrink> drinksOrdering01List = new ArrayList<AbDrink>();
		drinksOrdering01List.add(getWater());
		drinksOrdering01List.add(getWater());
		drinksOrdering01List.add(getWater());
		drinksOrdering01List.add(getWater());

		return drinksOrdering01List;

	}

	@Bean
	List<AbTopping> getToppingsOrdering02() {
		List<AbTopping> toppingsOrdering01 = new ArrayList<AbTopping>();
		toppingsOrdering01.add(getHam());
		toppingsOrdering01.add(getHam());
		toppingsOrdering01.add(getOnion());
		toppingsOrdering01.add(getCheese());
		return toppingsOrdering01;

	}

	@Bean
	Ordering getOrdering02() {
		return new Ordering(2, "Sparkling Water", getTable(), 5, LocalTime.of(21, 02), getPizzasOrdering02(),
				getDrinksOrdering02(), getToppingsOrdering02());
	}

	@Bean
	@Scope("prototype")
	Ordering getOrdering() {
		return new Ordering();
	}
}
