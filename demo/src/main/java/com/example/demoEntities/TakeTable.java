package com.example.demoEntities;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.DemoApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Order(1)
public class TakeTable implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);
		System.out.println("**********");
		System.out.println("TABLE LIST");

		// TAVOLO 01//
		Table table01 = (Table) ctx.getBean("getTable01");
		System.out.println(table01.toString());
		table01.checkTable();

		// TAVOLO 02//
		Table table02 = (Table) ctx.getBean("getTable02");
		System.out.println(table02.toString());
		table02.checkTable();

		// TAVOLO 03//
		Table table03 = (Table) ctx.getBean("getTable03");
		System.out.println(table03.toString());
		table03.checkTable();

		// TAVOLO 04//
		Table table04 = (Table) ctx.getBean("getTable04");
		System.out.println(table04.toString());
		table04.checkTable();

		// TAVOLO 05//
		Table table05 = (Table) ctx.getBean("getTable05");
		System.out.println(table05.toString());
		table05.checkTable();

		// TAVOLO 06//
		Table table06 = (Table) ctx.getBean("getTable");
		table06.setMaxOccupancy(4);
		table06.setNumberTable(6);
		table06.setStateTable(StateTable.LIBERO);
		System.out.println(table06.toString());
		table06.checkTable();

		// TAVOLO 07//
		Table table07 = (Table) ctx.getBean("getTable");
		table07.setMaxOccupancy(5);
		table07.setNumberTable(7);
		table07.setStateTable(StateTable.LIBERO);
		System.out.println(table07.toString());
		table07.checkTable();

		// TAVOLO 08//
		Table table08 = (Table) ctx.getBean("getTable");
		table08.setMaxOccupancy(10);
		table08.setNumberTable(8);
		table08.setStateTable(StateTable.OCCUPATO);
		System.out.println(table08.toString());
		table08.checkTable();

		// TAVOLO 09//
		Table table09 = (Table) ctx.getBean("getTable");
		table09.setMaxOccupancy(8);
		table09.setNumberTable(9);
		table09.setStateTable(StateTable.LIBERO);
		System.out.println(table09.toString());
		table09.checkTable();

		// TAVOLO 10//
		Table table10 = (Table) ctx.getBean("getTable");
		table10.setMaxOccupancy(10);
		table10.setNumberTable(10);
		table10.setStateTable(StateTable.OCCUPATO);
		System.out.println(table10.toString());
		table10.checkTable();
		System.out.println("**********");

		ctx.close();
	}

}
