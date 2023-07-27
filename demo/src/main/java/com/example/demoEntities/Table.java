package com.example.demoEntities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Setter
@Getter
@Entity
public class Table {
	@Id
	@GeneratedValue
	private UUID id;
	@Enumerated(EnumType.STRING)
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
