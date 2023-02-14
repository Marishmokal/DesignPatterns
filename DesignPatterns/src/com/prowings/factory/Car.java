package com.prowings.factory;

public abstract class Car {
private CarType type;


protected Car(CarType type) {
	super();
	this.type = type;
	arrangeParts();
}

private void arrangeParts() {
	
	System.out.println(this.type);
}

protected abstract void construct();

public CarType getType() {
	return type;
}

public void setType(CarType type) {
	this.type = type;
}

}
