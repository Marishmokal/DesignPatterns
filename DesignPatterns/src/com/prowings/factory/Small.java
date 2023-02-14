package com.prowings.factory;

public class Small extends Car {

	protected Small(CarType type) {
		super(type);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("small car is constructed");
		
	}

}
