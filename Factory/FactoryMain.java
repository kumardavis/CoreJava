package com.davis.Factory;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OsFactory osf=new OsFactory();
		OperatingSystem op=osf.getObject("Best");
		
		op.specification();
		

	}

}
