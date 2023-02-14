package com.prowings.creational.singleton.patt;
//simple null checking mechanism
public class ThreadSafeIntialization {

	private static ThreadSafeIntialization obj;

	private ThreadSafeIntialization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	synchronized static ThreadSafeIntialization threadSafeIntialization()
	{
		if(obj==null)
		{
			obj=new ThreadSafeIntialization();
		}
		return obj;
	}
}
