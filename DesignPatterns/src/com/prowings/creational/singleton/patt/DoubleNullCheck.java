package com.prowings.creational.singleton.patt;

public class DoubleNullCheck {

	private static DoubleNullCheck obj;

	private DoubleNullCheck() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public static synchronized DoubleNullCheck doubleNullCheck()
	{
		if(obj==null)
		{
		synchronized(DoubleNullCheck.class)
		{
			if(obj==null)
			{
				obj=new DoubleNullCheck();
			}
		}
		}
		return obj;
		
	}
}
