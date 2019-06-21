package com.davis.Factory;

public class OsFactory {
	public OperatingSystem getObject(String str) {
		
		if(str.equals("Best"))
			return new Android();
		else if (str.equals("Innovative"))
			return new Apple();
		else 
			return new Windows();
		
	}

}
