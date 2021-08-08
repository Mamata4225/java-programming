package com.xworkz.aptiprograms.testexecution;

public class Palindrome {

	public static void main(String[] args) {
		
		String s ="mom";
		if(palindrome(s)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	public static boolean palindrome(String s) {
		String r ="";
		for(int i = s.length()-1; i>=0; i--) {
			r=r+(s.charAt(i));
		}
		if(s.equals(r))
			return true;
		return false;
			
		}
	}

