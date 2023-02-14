package com.prowings.factory;

public class Premium extends Car {

	protected Premium(CarType type) {
		super(type);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Premium car is constructed");
		
	}

}
