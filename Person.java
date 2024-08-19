package com.example.demo;

public class Person {
	
	private String name;
	private int age;
	public Person(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		City = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String City;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}

}
