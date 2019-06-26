package com.Thread;

public class TestSharedResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedResource resource=new SharedResource();
		
		Thread t1=new Thread(()->{
			resource.setTableFor(7);
			resource.printTable();
		});

		Thread t2=new Thread(()->{
			resource.setTableFor(9);
			resource.printTable();
		});
		
		t1.start();
		t2.start();
	}

}
