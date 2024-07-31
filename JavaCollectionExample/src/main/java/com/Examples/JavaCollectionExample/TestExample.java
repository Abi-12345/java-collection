package com.Examples.JavaCollectionExample;


import java.util.*;
import java.util.List;

public class TestExample {
	//create an object of list using ArrayList
	static List<String> places = new ArrayList<>();
	
	//preparong our data
	public static List getPlaces() {
		//add places and country to the list
		places.add("napel, kathmadu");
		places.add("napel, Pokhara");
		places.add("India, kathmadu");
		places.add("USA, kathmadu");
		
		return places;
	}
public static void main(String[]args) {
	List<String> myPlaces = getPlaces();
	System.out.println("Place from napel:");
	
	//find places from nepal
	myPlaces.stream().filter((p) ->p.startsWith("napel"))
	.map((p) -> p.toUpperCase())
	.sorted().forEach((p)-> System.out.println(p));
	
}
}