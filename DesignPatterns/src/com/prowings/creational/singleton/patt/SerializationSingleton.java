package com.prowings.creational.singleton.patt;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationSingleton implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -3302449978033408183L;

private SerializationSingleton() {
	super();
	// TODO Auto-generated constructor stub
}
private static class SingletonHelper{
	private static final SerializationSingleton d=new SerializationSingleton();
	
}
public static SerializationSingleton deserializationSingleton() {
	return SingletonHelper.d;	
}
	public Object readResolve() {
		System.out.println("excuting read resolve...");
		return SerializationSingleton.deserializationSingleton();
	}
	public static void main(String[] args) {
		SerializationSingleton d1=SerializationSingleton.deserializationSingleton();
		SerializationSingleton d2=SerializationSingleton.deserializationSingleton();
		System.out.println(d1==d2);
		
	}



}
