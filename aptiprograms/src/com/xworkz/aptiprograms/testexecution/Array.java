package com.xworkz.aptiprograms.testexecution;

public class Array {

	public static void main(String[] args) {
		String s = "mamata";
		char[] carray = converted(s);
		for(int i=0; i<carray.length; i++) {
			
			System.out.print(carray[i]+",");
		}
	}
	public static char[] converted(String s) {
		char[]a=new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			a[i]=s.charAt(i);
		}
		return a;
	}
}
