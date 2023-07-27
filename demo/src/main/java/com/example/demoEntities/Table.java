package com.example.demoEntities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Setter
@Getter

public class Table {
	private StateTable stateTable;
	private int numberTable;
	private int maxOccupancy;

	public Table(StateTable stateTable, int numberTable, int maxOccupancy) {

		this.stateTable = stateTable;
		this.numberTable = numberTable;
		this.maxOccupancy = maxOccupancy;
	}

	public void checkTable() {
		if (this.stateTable == StateTable.OCCUPATO) {
			System.out.println("Tavolo occupato! Scegliere un altro tavolo");
		} else {
			System.out.println("Tavolo libero. Prego,accomodarsi.");
		}
	}
	@Override
	public String toString() {
		return "Table [State=" + stateTable + ", number =" + numberTable + ", maximum occupancy=" + maxOccupancy + "]";
	}

}
