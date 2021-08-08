package com.xworkz.aptiprograms.testexecution;

public class ChangeString {

	public static void main(String[] args) {
		 
		String s = "hi name, welcome to execute";
		String name = "sonaa";
		System.out.println(meth(name));
	}
	private static String meth(String name) {
		
		String s = "hi"+" "+name+" "+"welcome to execution";
		return s;
	}
}