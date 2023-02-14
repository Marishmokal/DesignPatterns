package com.prowings.factory;

public class CarFactory {

	public static Car buildCar(CarType type)
	
	{
	Car car=null;
	
	switch(type)
	{
	case LUXURY:
		car=new Luxury(type);
		break;
		
	case SMALL:
		car=new Small(type);
		break;
	case PREMIUM:
		car=new Premium(type);
		break;
	case MINI:
		car=new Mini(type);
		break;
	case MICRO:
		car=new Micro(type);
		break;
		
	default:
			System.out.println("Invalid car type");
	}
	return car;
	}
}
