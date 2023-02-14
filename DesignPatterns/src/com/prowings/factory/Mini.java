package com.prowings.factory;

public class Mini extends Car {

	protected Mini(CarType type) {
		super(type);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Mini car constructed");
		
	}

}
