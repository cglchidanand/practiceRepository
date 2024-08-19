package com.example.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEach {
	
	public static void main(String[] args) {
        //count special character
	String str = "one$two$three$four!five@six$";
    int count = str.length() - str.replaceAll("\\$","").length();
    System.out.println("Done:"+ count);
	
    String input = "gainjavaknowledge";
List<String> str1=Arrays.asList("abc","abc","bcs");
    Map<String, Long> output = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println("Output : "+output);
        
    String lis=str.join("", str1);
    
    Map<String, Long> output1 = str1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println("Output : "+lis);
    
    
    List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);

    // Find the maximum element in the list
    Optional<Integer> maxNumber = numbers.stream()
                                         .max(Integer::compareTo);

    if (maxNumber.isPresent()) {
        System.out.println("Maximum number: " + maxNumber.get());
    } else {
        System.out.println("The list is empty.");
    }
    //count repaeted charcter
    String input1 = "gainjavaknowledge";

    List<String> duplicateElements = Arrays.stream(input1.split(""))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream()
            .filter(ele -> ele.getValue() > 1)
            .map(Map.Entry :: getKey)
            .collect(Collectors.toList());

            System.out.println("duplicateElements : "+duplicateElements);
	
	
//remove duplicates in string

	String test="abccc";
	
	System.out.println(Arrays.stream(test.split("")).collect(Collectors.joining()));

	String t=Arrays.asList(test.split(""))
    .stream()
    .distinct()
    .collect(Collectors.joining());	
	System.out.println(t);
	
	}


	
}
