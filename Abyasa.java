package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class Abyasa {
	public static void main(String[] args) {
		
		
		List<Person> list=new ArrayList<Person>();
		
		list.add(new Person("chidananda", 30, "Bangalore"));
		list.add(new Person("cgl", 35, "Bangalore"));

		
		list.add(new Person("mtg", 33, "Bangalore"));

		list.add(new Person("Vinay", 31, "mumbai"));
		list.add(new Person("rocky", 30, "pune"));
		

		
List<Person>ls=list.stream().filter(n->n.getAge()>18 && n.getCity()
		.equalsIgnoreCase("bangalore"))
		.sorted(Comparator.comparing(Person::getAge).reversed())
		.collect(Collectors.toList());


ls.forEach(n->System.out.println(n.getName()));
		
		
		
		
		 
		  
		 
	
	}
}
