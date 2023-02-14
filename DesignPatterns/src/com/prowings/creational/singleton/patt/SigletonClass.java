package com.prowings.creational.singleton.patt;

/**
 * @author Shree
 * decleare class as final
 * First step:- decleare the field as private static and initialized with null
 * Second step:-create private constructer
 * Third step:-create the static factory method
 * Fourth step:-null check
 */
public final class SigletonClass {

	
	private static SigletonClass obj=null;

	private SigletonClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static SigletonClass singleTonClass()
	{
		if(obj==null)
		{
			obj=new SigletonClass();
		}
		return obj;
		
	}
	
}
