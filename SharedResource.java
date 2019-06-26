package com.Thread;

public class SharedResource {
	
	private ThreadLocal<Integer> tableFor=new ThreadLocal<Integer>();

	public int getTableFor() {
		return tableFor.get();
	}

	public void setTableFor(int tableFor) {
		this.tableFor.set(tableFor);;
	}
	
	public void printTable()
	{
		for(int i=0;i<11;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+tableFor.get()
					+"X"+i+"="+tableFor.get()*i);
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
