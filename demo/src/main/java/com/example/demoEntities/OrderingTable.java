package com.example.demoEntities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.DemoApplication;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Order(2)
@NoArgsConstructor
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class OrderingTable implements CommandLineRunner {
	@Value("${application.coperto}")
	private double coperto;
	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);

		// ORDINAZIONE 01//
		Ordering ordering01 = (Ordering) ctx.getBean("getOrdering01");
		System.out.println(ordering01.toString());
		totalPrice(ordering01);

		// ORDINAZIONE 02//
		Ordering ordering02 = (Ordering) ctx.getBean("getOrdering02");
		Table table02 = (Table) ctx.getBean("getTable");
		table02.setMaxOccupancy(5);
		table02.setNumberTable(7);
		table02.setStateTable(StateTable.LIBERO);
		ordering02.setTable(table02);
		System.out.println(ordering02.toString());
		totalPrice(ordering02);

		// ORDINAZIONE03//
		Ordering ordering03 = (Ordering) ctx.getBean("getOrdering");
		ordering03.setNumberPeople(4);
		List<AbDrink> drinksList = new ArrayList<AbDrink>();
		drinksList.add(new Water());
		drinksList.add(new Wine());
		drinksList.add(new Lemonade());
		ordering03.setDrinksOrdered(drinksList);
		List<AbPizza> pizzasList = new ArrayList<AbPizza>();
		pizzasList.add(new Margherita(Size.STANDARD));
		pizzasList.add(new SalamiPizza(Size.FAMILY));
		pizzasList.add(new HawaianPizza(Size.STANDARD));
		ordering03.setPizzasOrdered(pizzasList);
		List<AbTopping> toppingsList = new ArrayList<AbTopping>();
		toppingsList.add(new Onions());
		toppingsList.add(new Ham());
		toppingsList.add(new Pineapple());
		ordering03.setToppingsOrdered(toppingsList);
		ordering03.setNote("No TOMATO");
		ordering03.setNumberOrder(3);
		ordering03.setTable(new Table(StateTable.LIBERO, 3, 6));
		ordering03.setTime(LocalTime.of(21, 05));
		ordering03.setCover(coperto);
		System.out.println(ordering03.toString());
		totalPrice(ordering03);
		ctx.close();
	}

	static void totalPrice(Ordering ordered) {

		double cover = ordered.getCover();
		double totalPrice = ordered.getTotalPrice();
		double totalCalories = ordered.getTotalCalories();
		int people = ordered.getNumberPeople();
		double totaleCover = people * cover;
		double total = totaleCover + totalPrice;
		System.out.println("Cover: " + totaleCover + " $");
		System.out.printf("Price Food And Beverage: %.2f $\n", totalPrice);
		System.out.printf("Total Price: %.2f $\n", total);
		System.out.printf("Total Calories: %.2f kcal\n", totalCalories);
		System.out.println("**********");

	}

}
