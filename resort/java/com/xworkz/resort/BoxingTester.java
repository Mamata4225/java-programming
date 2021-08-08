package com.xworkz.resort;

import java.util.ArrayList;
import java.util.List;

public class BoxingTester {
 
	public static void main(String[] args) {
		
		Integer age = 24;  //auto boxing
		
		Double salary = new Double(450) ;
		double convertedSal = salary;
		
		List<Integer>ageList = new ArrayList<Integer>();
		int manishAge = 24;
		int mamataAge = 24;
		int amitAge = 26;
		
		ageList.add(manishAge);
		ageList.add(mamataAge);
		ageList.add(amitAge);
		List<Integer>copyOfAgeList = new ArrayList<Integer>();
		copyOfAgeList.addAll(ageList);
		copyOfAgeList.add(25);
		copyOfAgeList.add(24);
		copyOfAgeList.add(22);
	    copyOfAgeList.add(24);
	
	System.out.println("copyOfAgeList"+copyOfAgeList.size());
	
	List<Integer>removeAgeList = new ArrayList<Integer>();
	
	
	removeAgeList.add(24);
    removeAgeList.add(22);
    
    boolean containall = copyOfAgeList.containsAll(removeAgeList);
    System.out.println("containall"+containall);
    copyOfAgeList.removeAll(removeAgeList);
    System.out.println("copyOfAgeList after removeall"+copyOfAgeList.size());
    System.out.println(copyOfAgeList.size());
    System.out.println(copyOfAgeList);
	}
	
	
}
