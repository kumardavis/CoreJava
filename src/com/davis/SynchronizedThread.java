package com.davis;

public class SynchronizedThread {
	
	static SynchronizedThread obj;
	
private SynchronizedThread()
{
	System.out.println("Hie");
}

public static SynchronizedThread getObject()
{
	if(obj==null)
	{
		synchronized(SynchronizedThread.class)
		{
			if(obj==null)
		obj= new SynchronizedThread();
		}
	}
	return obj;
}
}
