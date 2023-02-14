package com.prowings.abstractfactory;

public class IndiaCarFactory {

	public static Car buildCar(CarType type)
	{
		Car car=null;
		switch(type)
		{
		case BMW:
			car=new BmwCar(Location.PAK);
			break;
		
		}
		return car;
	}
}
