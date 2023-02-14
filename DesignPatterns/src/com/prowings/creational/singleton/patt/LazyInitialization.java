package com.prowings.creational.singleton.patt;

/**
 * @author Shree
 *we can handle exception
 *we can use in single threaded environment not in multithreaded
 *peformance low
 */
public class LazyInitialization {

	private static LazyInitialization obj;

	private LazyInitialization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public static LazyInitialization lazyInitialization()
	{
		if(obj==null)
		{
			obj=new LazyInitialization();
		}
		return obj;
	}
}
