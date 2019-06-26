package com.Thread.Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTaskPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Callable<String> task1=new Callable<String>() {
			
			@Override
			public String call()throws Exception {
				return "Task1 is executed..";
			}
			
		};
		
		ExecutorService execute=Executors.newSingleThreadExecutor();
		Future<String> f=execute.submit(task1);
		if(f.isDone())
		{
			try {
				System.out.println(f.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
