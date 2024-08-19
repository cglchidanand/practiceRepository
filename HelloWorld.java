package com.example.demo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class HelloWorld {
 
 
 
 public static void main(String[] args) {

	        String input = "gainjavaknowledge";

	        Map<String, Long> output = Arrays.stream(input.split(""))
	        		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        System.out.println("Output : "+output);

	    
 }
}