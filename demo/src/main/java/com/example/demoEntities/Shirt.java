package com.example.demoEntities;

public class Shirt implements Franchise {

	@Override
	public String getNameFranchise() {
		return "Shirt";
	}

	@Override
	public double getPriceFranchise() {
		return 21.99;
	}

	@Override
	public String toString() {
		return this.getNameFranchise() + ", Price:" + this.getPriceFranchise() + " $";
	}

}
