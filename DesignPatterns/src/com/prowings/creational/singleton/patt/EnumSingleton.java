package com.prowings.creational.singleton.patt;

/**
 * @author Shree
 *we can instanciated java enum value only once java enum values are globally accessible
 */
public enum EnumSingleton {
INSTANCE;
	
	 EnumSingleton()
	{
		System.out.println("Object initialized");
	}
}
