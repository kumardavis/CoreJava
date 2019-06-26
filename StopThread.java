package com.Thread;

public class StopThread extends Thread {
	
	boolean flag=false;

//	public boolean isFlag() {
//		return flag;
//	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		while(!flag)
		{
			for(int i=0;i<50;i++)
			{
				 try {
						Thread.sleep(1);
			System.out.println(i);
				 } catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}
		System.out.println("Thread terminated manually");
	}
	
	

}
