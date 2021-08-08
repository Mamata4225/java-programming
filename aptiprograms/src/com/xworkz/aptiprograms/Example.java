package com.xworkz.aptiprograms;

import java.util.ArrayList;
import java.util.List;

public class Example{
	
	public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("mamata");
	list.add("3565");
	list.add("5656");
		System.out.println(list);
		list.remove("3565");
		System.out.println(list);
	}
}
