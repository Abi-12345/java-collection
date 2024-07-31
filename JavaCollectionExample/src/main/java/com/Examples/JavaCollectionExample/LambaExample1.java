package com.Examples.JavaCollectionExample;

import java.util.Arrays;
import java.util.List;

public class LambaExample1 {
	public static void main(String args[]) {
		List<String> li=Arrays.asList("karur","chennai","cbe");
		//old wayb to retrive data
		//
		/*
		*for(String s: li) { System.out.println(s);}
		*/
		//new way
		//li.forEach(System.out::println);
		li.stream()
	    .filter(s -> s.startsWith("c"))
	    .map(String::toUpperCase)
	    .forEach(System.out::println);

	}

}
