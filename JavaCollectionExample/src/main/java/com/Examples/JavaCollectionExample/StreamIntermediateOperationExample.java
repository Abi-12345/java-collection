package com.Examples.JavaCollectionExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



public class StreamIntermediateOperationExample {
	public static void main(String args[]) {
		//List of lists names
		List<List<String>> listOfLists =Arrays.asList(
				Arrays.asList("Reflection","Collection","Stream"),
				Arrays.asList("Structure","State","Flow"),
				
				Arrays.asList("Sorting","Mapping","Stream"));
		//Create set to hold intermediate results
		Set<String> IntermediateResults = new HashSet<>();
		//stream pipeline demostrating various intermediate operations
		List<String> result =listOfLists.stream()
				.flatMap(List::stream) //FLATTEN THE LIST OF LISTS INTO A SINGLE STREAM
				.filter(s -> s.startsWith("S"))//FILTER ELEMENTS START WITH S
				.map(String::toUpperCase)//TRANSFORM EACH ELEMENT TO UPPERCASE
				.distinct()//REMOVE DUPLICATE ELEMENTS
				.sorted()//SORT ELEMENTS
				.peek(s -> IntermediateResults.add(s))//PERFORM ALL ACTION (ADD TO SET)ON EACH ELEMENT
				.collect(Collectors.toList());//COLLECT THE FINAL RESULT INTO A LISTSS
		//print the intermediate results
		System.out.println("Intermediate Results:");
		IntermediateResults.forEach(System.out::println);
		
		//print the final result
		System.out.println("Final Result:");
		result.forEach(System.out::println);
				
	}

}
