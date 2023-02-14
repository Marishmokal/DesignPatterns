package com.prowings.factory;

public class Micro extends Car {

	protected Micro(CarType type) {
		super(type);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Micro car is constructed");
		
	}

}
