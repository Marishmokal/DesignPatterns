package com.prowings.abstractfactory;

public class BmwCar extends Car {

	
	public BmwCar(Location location) {
		super(CarType.BMW,location);
		construct(location);
	}

	@Override
	protected void construct(Location location) {
	
		if(Location.INDIA==location)
			System.out.println("bmw car is constructed for  india right drive");
		
		else if(Location.PAK==location)
			System.out.println("audi car is constructed for  india left drive");
		
		else if(Location.SHRILANKA==location)
			System.out.println("RANGEROVER  car is constructed for  india right drive");
		
	}

	

	

	
	

	

	
	

}
