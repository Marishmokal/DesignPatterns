package com.prowings.creational.singleton.patt;



/**
 * @author Shree
 *step 1:we cant handle exception in eager initialization
 *
 *Overhead of creating extra object in memory
 *
 */
public class EagerInitialization {

	private static EagerInitialization obj=new EagerInitialization();

	private EagerInitialization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static EagerInitialization eagerInitialization()
	{
		return obj;
	}
	
	
	
	
	
}
