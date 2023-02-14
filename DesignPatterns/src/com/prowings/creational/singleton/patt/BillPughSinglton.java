package com.prowings.creational.singleton.patt;

/**
 * @author Shree
 *Because of java 5 change there are changes in singleton classes to avoid
 *this he came with solution static inner class to improve performance
 *
 */
public class BillPughSinglton {

	private static BillPughSinglton obj;

	private BillPughSinglton() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static class SingletonHelper
	{
		private static final BillPughSinglton b=new BillPughSinglton();
	}
	public static BillPughSinglton billPughSinglton()
	{
		return SingletonHelper.b;
		
	}
}
