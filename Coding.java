package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Coding {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
    	empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
    	empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
    	empList.add(new Employee(3, "efg", 30, 10000, "M", "HR", "Chennai", 2014));
    	empList.add(new Employee(4, "def", 32, 10001, "F", "HR", "Chennai", 2013));

    	
    System.out.println("gender=="+empList.stream().collect(Collectors.groupingBy(Employee::getGender)));
    	
    	
    	
    	System.out.println("Employee details whose age is greater than 28");
    	List<String> emp= empList.stream().filter(empLis->empLis.getSalary()>10000).map(empLis->empLis.getName())
    			
    			
    			
    			
    			.collect(Collectors.toList());

    	System.out.println(emp);
    	
    	//Map<Integer,Employee> mp=empList.stream().map(Employee::getId).collect(Collectors.toList());
    
    	Map<Integer, Employee> result1 = empList.stream()
    		    .collect(Collectors.toMap(Employee::getId, Function.identity()));


	System.out.println(result1);
	}
}
