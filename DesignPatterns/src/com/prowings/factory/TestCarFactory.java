package com.prowings.factory;

public class TestCarFactory {
public static void main(String[] args) {
	
	Car luxury=CarFactory.buildCar(CarType.LUXURY);
	Car small=CarFactory.buildCar(CarType.SMALL);
	Car premium=CarFactory.buildCar(CarType.PREMIUM);
	Car Mini=CarFactory.buildCar(CarType.MINI);
	Car Micro=CarFactory.buildCar(CarType.MICRO);
}
	
}
