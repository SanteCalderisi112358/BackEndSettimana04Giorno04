package com.example.demoEntities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.DemoApplication;
import com.example.demo.services.PizzasService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Order(0)
@ComponentScan(basePackages = "com.example.demo.services")
public class Menu implements CommandLineRunner {
	@Autowired
	PizzasService pizzaSrv;
	@Autowired
	DrinkService drinkSrv;
	@Autowired
	ToppingService toppingSrv;
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);

		// SALVATAGGIO NEL DB DI MARGHERITA FAMILY//
		Margherita margheritaFamily = (Margherita) ctx.getBean("getMargheritaFamily");
		margheritaFamily.getCalories();
		margheritaFamily.getNamePizza();
		margheritaFamily.getPrice();
		margheritaFamily.getSize();
		// pizzaSrv.create(margheritaFamily);
		// SALVATAGGIO NEL DB DI MARGHERITA STANDARD//
		Margherita margheritaStandard = (Margherita) ctx.getBean("getMargheritaStandard");
		margheritaStandard.getCalories();
		margheritaStandard.getNamePizza();
		margheritaStandard.getPrice();
		margheritaStandard.getSize();
		// pizzaSrv.create(margheritaStandard);
		// SALVATAGGIO NEL DB DI HAWAIAN FAMILY//
		HawaianPizza hawaianFamily = (HawaianPizza) ctx.getBean("getHawaianPizzaFamily");
		hawaianFamily.getCalories();
		hawaianFamily.getNamePizza();
		hawaianFamily.getPrice();
		hawaianFamily.getSize();
		// pizzaSrv.create(hawaianFamily);
		// SALVATAGGIO NEL DB DI HAWAIAN STANDARD//
		HawaianPizza hawaianStandard = (HawaianPizza) ctx.getBean("getHawaianPizzaStandard");
		hawaianStandard.getCalories();
		hawaianStandard.getNamePizza();
		hawaianStandard.getPrice();
		hawaianStandard.getSize();
		// pizzaSrv.create(hawaianStandard);
		// SALVATAGGIO NEL DB DI SALAMI FAMILY//
		SalamiPizza salamifamily = (SalamiPizza) ctx.getBean("getSalamiPizzaFamily");
		salamifamily.getCalories();
		salamifamily.getNamePizza();
		salamifamily.getPrice();
		salamifamily.getSize();
		// pizzaSrv.create(salamifamily);
		// SALVATAGGIO NEL DB DI SALAMI STANDARD//
		SalamiPizza salamiStandard = (SalamiPizza) ctx.getBean("getSalamiPizzaStandard");
		salamiStandard.getCalories();
		salamiStandard.getNamePizza();
		salamiStandard.getPrice();
		salamiStandard.getSize();
		// pizzaSrv.create(salamiStandard);

		/* SALVATAGGIO NEL DB DI LEMONADE */
		Lemonade lemonade = (Lemonade) ctx.getBean("getLemonade");
		lemonade.getCaloriesDrink();
		lemonade.getNameDrink();
		lemonade.getPriceDrink();
		lemonade.getSizeDrink();
		// drinkSrv.create(lemonade);
		/* SALVATAGGIO NEL DB DI WATER */
		Water water = (Water) ctx.getBean("getWater");
		water.getCaloriesDrink();
		water.getNameDrink();
		water.getPriceDrink();
		water.getSizeDrink();
		// drinkSrv.create(water);

		/* SALVATAGGIO NEL DB DI WINE */
		Wine wine = (Wine) ctx.getBean("getWine");
		wine.getCaloriesDrink();
		wine.getNameDrink();
		wine.getPriceDrink();
		wine.getSizeDrink();
		wine.getAlcool();
		// drinkSrv.create(wine);

		/* SALVATAGGIO NEL DB DI CHEESE */
		Cheese cheese = (Cheese) ctx.getBean("getCheese");
		cheese.getCaloriesTopping();
		cheese.getNameTopping();
		cheese.getPriceTopping();
		// toppingSrv.create(cheese);
		/* SALVATAGGIO NEL DB DI HAM */
		Ham ham = (Ham) ctx.getBean("getHam");
		ham.getCaloriesTopping();
		ham.getNameTopping();
		ham.getPriceTopping();
		// toppingSrv.create(ham);
		/* SALVATAGGIO NEL DB DI PINEAPPLE */
		Pineapple pineapple = (Pineapple) ctx.getBean("getPineapple");
		pineapple.getCaloriesTopping();
		pineapple.getNameTopping();
		pineapple.getPriceTopping();
		// toppingSrv.create(pineapple);
		/* SALVATAGGIO NEL DB DI ONIONS */
		Onions onion = (Onions) ctx.getBean("getOnion");
		onion.getCaloriesTopping();
		onion.getNameTopping();
		onion.getPriceTopping();
		// toppingSrv.create(onion);

		/* STAMPA MENU PIZZE */
		System.out.println(margheritaFamily.toString());
		System.out.println("MENU'");
		System.out.println("\n");
		System.out.println("Pizzas:");

		System.out.println(ctx.getBean("getMargheritaFamily").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getMargheritaStandard").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getHawaianPizzaFamily").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getHawaianPizzaStandard").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getSalamiPizzaFamily").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getSalamiPizzaStandard").toString());
		System.out.println("**********");
		System.out.println("Toppings");
		System.out.println(ctx.getBean("getCheese").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getHam").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getOnion").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getSalami").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getPineapple").toString());
		System.out.println("**********\n");

		System.out.println("Drinks:");
		System.out.println(ctx.getBean("getLemonade").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getWater").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getWine").toString());
		System.out.println("**********\n");
		System.out.println("Franchise:");
		System.out.println(ctx.getBean("getShirt").toString());
		System.out.println("**********");
		System.out.println(ctx.getBean("getMug").toString());
		System.out.println("**********");
		ctx.close();
	}

}
