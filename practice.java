package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class practice {
	public static void main(String[] args) 
	{
		
	String[] s=new String[] {"a","b","b"};
		
	
		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("vdhfd");
		String str="advfhsfvasjbdjsd";
		
		Map<String, Long> st=Arrays.stream(String.join("", s).split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(st);
	}

}
