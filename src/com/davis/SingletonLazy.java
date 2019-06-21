package com.davis;

public class SingletonLazy {

	static SingletonLazy lazy;
	
	private SingletonLazy() {
		
    System.out.println("Lazy initilization Object");
	}
	
	public static SingletonLazy getObject()
	{
		if(lazy==null)
		{
			lazy= new SingletonLazy();
		}
		return lazy;
	}
}
