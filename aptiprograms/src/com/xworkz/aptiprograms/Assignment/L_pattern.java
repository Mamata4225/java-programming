package com.xworkz.aptiprograms.Assignment;

public class L_pattern {
	
	public static void main(String[] args) {
		int num=4;
		for(int i=0; i<=num; i++) {
			for(int j=0; j<=num; j++) {
			 if(i==4 || j==0 ) {
				System.out.print("* ");
			}
			 
			else 
				System.out.print(" ");
				
		  }
			System.out.println();
		}
	  }
	}


