package com.prowings.creational.singleton.patt;

public class TestSingletonClasses {
public static void main(String[] args) {
	
	SigletonClass obj1=SigletonClass.singleTonClass();
	SigletonClass obj2=SigletonClass.singleTonClass();
	System.out.println(obj1==obj2);
	
	//Eager initialization
	
	EagerInitialization er=EagerInitialization.eagerInitialization();
	EagerInitialization er1=EagerInitialization.eagerInitialization();
	System.out.println(er==er1);
	
	
	//static block initialization
	
	StaticBlockIntialization s=StaticBlockIntialization.staticBlockIntialization();
	StaticBlockIntialization s1=StaticBlockIntialization.staticBlockIntialization();
	System.out.println(s==s1);
	
	
	//Lazy Initialization
	
	LazyInitialization l=LazyInitialization.lazyInitialization();
	LazyInitialization l1=LazyInitialization.lazyInitialization();
	System.out.println(l==l1);
	
	//simple thread safe initialization
	
	ThreadSafeIntialization t=ThreadSafeIntialization.threadSafeIntialization();
	ThreadSafeIntialization t1=ThreadSafeIntialization.threadSafeIntialization();
	System.out.println(t==t1);
	
	//double null checking
	DoubleNullCheck d=DoubleNullCheck.doubleNullCheck();
	DoubleNullCheck d1=DoubleNullCheck.doubleNullCheck();
	System.out.println(d==d1);
	
	//BillPughSingleton
	BillPughSinglton b=BillPughSinglton.billPughSinglton();
	BillPughSinglton b1=BillPughSinglton.billPughSinglton();
	System.out.println(b==b1);
	
	
	//Singleton enum
	EnumSingleton e=EnumSingleton.INSTANCE;
	EnumSingleton e1=EnumSingleton.INSTANCE;
	System.out.println(e==e1);
	
	
	
	
}
}
