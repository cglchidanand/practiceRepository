package com.example.demo;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 class Inheritance
{
	public void show()
	{
		System.out.println("hiiiiiiii");
		
	}

}

 class Demo2 extends Inheritance
{
		public void show()
		{
			System.out.println("hello");
			
		}

public static void main(String[] args) {
	String st="hi hello welcome to the java world";
	
	Inheritance d1=new Inheritance();
	Demo2  d2= new Demo2();
	
	d1.show();
	d2.show();

	
	
	
}
}

