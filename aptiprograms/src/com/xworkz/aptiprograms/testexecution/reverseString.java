package com.xworkz.aptiprograms.testexecution;

public class reverseString {

	public static void main(String[] args) {
		String s = "mamata";
		String rev = converted(s);
		
		System.out.println(rev);
	}
	
		public static String converted(String s) {
			
			String r = " ";
			for(int i = s.length()-1; i>0; i--) {
				r=r+(s.charAt(i));
			}
		return r;
	}
}
