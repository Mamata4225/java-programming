package com.xworkz.aptiprograms.Assignment;

public class A_pattern {
	public static void main(String[] args) {
		int num=4;
		for(int i=0; i<=num; i++) {
			for(int j=0; j<=num; j++) {
			 if(i==2 ||  i+j==2 || j==0) {
				System.out.print(" * ");
			}
			 
			else 
				System.out.print("   ");
				
		  }
			System.out.println();
		}
	 
	}
}
