package com.prowings.abstractfactory;

public class CarFactory {

	public static Car buildCar(CarType type,Location location)
	{
		Car car=null;
		switch(location)
		{
		case INDIA:
			car=IndiaCarFactory.buildCar(type);
			break;
		}
		return car;
		
	}
}
