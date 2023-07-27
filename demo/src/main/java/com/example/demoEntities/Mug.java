package com.example.demoEntities;

public class Mug implements Franchise {

	@Override
	public String getNameFranchise() {
		return "Mug";
	}

	@Override
	public double getPriceFranchise() {
		return 4.99;
	}

	@Override
	public String toString() {
		return this.getNameFranchise() + ", Price:" + this.getPriceFranchise() + " $";
	}
}
