package com.prowings.creational.singleton.patt;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UsingReflectionApi {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	

	
	EagerInitialization e=EagerInitialization.eagerInitialization();
	EagerInitialization e1=null;
	
	
	Constructor[] constructer=e.getClass().getDeclaredConstructors();
	for (Constructor constructer2 : constructer) {
		constructer2.setAccessible(true);
		
		e1=(EagerInitialization)constructer2.newInstance();
	}
	
	System.out.println(e.hashCode());
	System.out.println(e1.hashCode());
	System.out.println(e==e1);
}	
}
