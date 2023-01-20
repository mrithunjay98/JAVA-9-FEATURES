package com.java9featuesImpl;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {

//java 9 features for collection 
 public static void main(String[] args) {
		
	List<String> a=List.of("new york","japan","parish","mumbai","delhi","chennai","banglore");
		
	List<Integer> a1=List.of(23,34,43,56,67);
	
	List<Double> a5=List.of(23.1,34.1,43.1,56.1,67.1);
		
	Set<Integer> a3=Set.of(23,34,43,56,67);
		
	Set<String> a4=Set.of("new york","japan","parish","mumbai","delhi","chennai","banglore");
		
	Map<Integer,String> a2 =Map.of(1, "ajay", 2,"vijay" , 3, "sohan", 4, "rohan", 5, "sanjay");
		
		
		System.out.println(a);
		
		System.out.println(a1);
		
		System.out.println(a3);
		
		System.out.println(a4);
		
		System.out.println(a2);
		
		System.out.println(a5);
		
		
		
	}
	
	
	
	
	
	
	
	
}
