package com.prowings.factory;

public class Luxury extends Car {

	Luxury(CarType type) {
		super(type);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Luxury Car is constructing");
		
	}

	
}
