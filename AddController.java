package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddController 
{
	
public static void main(String[] args) {

	//second highest in array of int
	
	int[] numberss = {5, 13, 41, 88, 99, 77};

    Integer SecondHighestElement = Arrays.stream(numberss)
            .boxed().sorted(Comparator.reverseOrder())
            .skip(1).findFirst().get();

    System.out.println(SecondHighestElement);
	
	//second hihest in list of int
    
    List<Integer> numbersss = Arrays.asList(1, 3, 4, 5, 6, 6, 7, 2);

    
    // Finding the second largest number using Stream API
    Optional<Integer> secondLargest = numbersss.stream()
            .distinct() // Remove duplicates
            .sorted(Comparator.reverseOrder()) // Sort the stream in descending order
            .skip(1) // Skip the largest number
            .findFirst(); // Find the second largest number

    
    
    // Displaying the second largest number
    secondLargest.ifPresent(number -> System.out.println("Second Largest Number: " + number));
	
	//highest no in list of int
	
	 List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);

     // Find the maximum element in the list
     Optional<Integer> maxNumber = numbers.stream()
                                          .max(Integer::compareTo);

     if (maxNumber.isPresent()) {
         System.out.println("Maximum number: " + maxNumber.get());
     } else {
         System.out.println("The list is empty.");
     }
	
	
	
	
	
	//highest number in int of array
	
	 int arr[] = {10, 324, 45, 90, 9808}; 
     
     // Java Stream and max to find the max element
     // in array
     int max = Arrays.stream(arr).max().getAsInt(); 
	
	
	Arrays.stream
	
	
	
	
	
	String st="abc";
	System.out.println(Stream.of("abc").map(String->new StringBuffer(String).reverse()).collect(Collectors.joining()));

	String s=Arrays.stream(st.split("")).map(String->new StringBuilder(String).reverse()).collect(Collectors.joining());

	System.out.println(s);
	
	String input = "ginjavaknowledge";
	 
	
	//remove duplicate sin string
	Arrays.stream("aabbc".split("")).collect(Collectors.toSet()).forEach(System.out::println);
	//ystem.out.println("======"+Stream.of("abbc").map(n->n).distinct().collect(Collectors.toList()));

	
	//
	
	 List<String> output =
Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
	
	.entrySet().stream().filter(n->n.getValue()>1)
	.map(n->n.getKey()).collect(Collectors.toList());
	 System.out.println(output);
	 
	 
	 

}
}