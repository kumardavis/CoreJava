package com.Thread.Interrupt;

public class Interrupt extends Thread {
	
	public void run() {
		try {
			Thread.sleep(2000); 
            System.out.println("Geeksforgeeks");
		}catch (InterruptedException e) {
			throw new RuntimeException("Thread"+"Interrupted");
		}
	}

	public static void main(String[] args) {
		Interrupt i=new Interrupt();
		i.start();
		try {
			i.interrupt();
		}catch(Exception e) {
			System.out.println("Exception Handelled..");
		}
	}
}
