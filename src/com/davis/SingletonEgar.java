package com.davis;

public class SingletonEgar {
	
	static SingletonEgar egar=new SingletonEgar();
	
	private SingletonEgar() {
		System.out.println("Object created....");
	}
	
	public static SingletonEgar getObject() {
		return egar;
	}

}
