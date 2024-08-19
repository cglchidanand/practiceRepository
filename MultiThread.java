package com.example.demo;


 
public class MultiThread
{
public static void main(String[] args) throws InterruptedException {
	
	Thread t1=new Thread(()->
	{

	for(int i=0;i<5;i++)
	{
	System.out.println("hii");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	});
	Thread t2=new Thread(()->
	{
	for(int i=0;i<5;i++)
	{
	System.out.println("hello");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	});

	
t1.start();
Thread.sleep(10);
t2.start();
}	
}
