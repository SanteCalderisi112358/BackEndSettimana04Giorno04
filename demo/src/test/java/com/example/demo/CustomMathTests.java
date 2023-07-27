package com.example.demo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demoEntities.Ham;
import com.example.demoEntities.Lemonade;
import com.example.demoEntities.Margherita;
import com.example.demoEntities.Ordering;
import com.example.demoEntities.Water;
import com.example.demoEntities.Wine;
import com.example.demoTools.CustomMath;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomMathTests {
	@Value("${application.coperto}")
	private double coperto;
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);

	Ordering order01 = (Ordering) ctx.getBean("getOrdering01");
	int numberPeople = order01.getNumberPeople();

	Margherita pizza = (Margherita) ctx.getBean("getSalamiPizzaFamily");
	int quantityPizza = 1;
	double pizzaPrice = quantityPizza * pizza.getPrice();
	double pizzaCalories = quantityPizza * pizza.getCalories();
	int quantityHam = 2;
	Ham ham = (Ham) ctx.getBean("getHam");
	double hamPrice = quantityHam * ham.getPriceTopping();
	double hamCalories = quantityHam * ham.getCaloriesTopping();
	Water water = (Water) ctx.getBean("getWater");
	int quantityWater = 2;
	double waterPrice = quantityWater * water.getPriceDrink();
	double waterCalories = quantityWater * water.getCaloriesDrink();
	Lemonade lemonade = (Lemonade) ctx.getBean("getLemonade");
	int quantityLemonade = 2;
	double lemonadePrice = quantityLemonade * lemonade.getPriceDrink();
	double lemonadeCalories = quantityLemonade * lemonade.getCaloriesDrink();
	Wine wine = (Wine) ctx.getBean("getWine");
	int quantityWine = 1;
	double winePrice = quantityWine * wine.getPriceDrink();
	double wineCalories = quantityWine * wine.getCaloriesDrink();
	double totalPrice = pizzaPrice + lemonadePrice + waterPrice + winePrice + hamPrice;
	double totalCalories = pizzaCalories + lemonadeCalories + waterCalories + wineCalories + hamCalories;
	double totalCoperto = numberPeople * coperto;



	@Test
	void testPositive() {
		CustomMath cm = new CustomMath();
		double result = cm.sum(totalCoperto, totalPrice);
		assertTrue(result > 0);

	}

	@Test
	void testPizzaNotNull() {
		CustomMath cm = new CustomMath();
		Margherita pizzaNotNull = cm.pizzaNotNull(pizza);
		assertNotNull(pizzaNotNull);
	}

	@Test
	void testWaterNotCalories() {
		CustomMath cm = new CustomMath();
		int resultWaterCalories = cm.waterNotCalories(water.getCaloriesDrink());
		assertTrue(resultWaterCalories == 0);
	}

	@Test
	void testAlcoolWine() {
		CustomMath cm = new CustomMath();
		int resulAlcool = cm.alcoolWine(wine.getAlcool());
		assertFalse(resulAlcool < 0);
	}
}
