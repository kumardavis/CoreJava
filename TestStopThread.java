package com.Thread;

public class TestStopThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StopThread stopThread=new StopThread();
		stopThread.start();
//        try {
//			Thread.sleep(1);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		stopThread.setFlag(true);

	}

}
