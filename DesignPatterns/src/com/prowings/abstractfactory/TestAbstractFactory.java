package com.prowings.abstractfactory;

public class TestAbstractFactory {
public static void main(String[] args) {
	Car bmw=CarFactory.buildCar(CarType.BMW, Location.INDIA);
	
}
}
