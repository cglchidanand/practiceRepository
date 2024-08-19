package com.example.demo;

public class SingleTon {

	private static SingleTon single;
	
	private SingleTon()
	{}
	
	public static SingleTon getistance(SingleTon single1)
	
	{
		if(single1==null)
			
		{
		return new SingleTon();
		}
		else
		
		{
			return single;
		}
		
	}
	
}
