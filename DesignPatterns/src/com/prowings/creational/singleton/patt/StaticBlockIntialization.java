package com.prowings.creational.singleton.patt;

/**
 * @author Shree
 *
 *it helps us for exception handling
 *but better than eagar as its handle exception
 */
public class StaticBlockIntialization {

	private static StaticBlockIntialization obj;

	private StaticBlockIntialization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static StaticBlockIntialization staticBlockIntialization()
	{
		return obj;
		
	}
	static {
		try {
			obj=new StaticBlockIntialization();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
