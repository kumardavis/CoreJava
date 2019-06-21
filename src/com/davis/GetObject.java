package com.davis;

public class GetObject {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for SoingletonEger
		
//		SingletonEgar object1=SingletonEgar.getObject();
//		SingletonEgar object2=SingletonEgar.getObject();
		
		//for SingletonLazy
		
//		SingletonLazy object1=SingletonLazy.getObject();
//		SingletonLazy object2=SingletonLazy.getObject();
		
		//for SynchronizedThread
		
		Thread t1=new Thread(new Runnable() {
			public void run()
			{
				SynchronizedThread s1=SynchronizedThread.getObject();
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			public void run()
			{
				SynchronizedThread s2=SynchronizedThread.getObject();
			}
		});
		
		t1.start();
		t2.start();
		
		
		
		
	}

}
