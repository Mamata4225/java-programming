package com.xworkz.javaprogram.aptiprogram;

public class PatternA4 {
	 public static void main(String[] args) {
		 int lines=7;
		 for(int i=0; i<lines; i++) {
			 for(int j=0; j<lines; j++ ) {
				 if (j==0 || j==6 || i+j==6 || i-j==0 ) {
					 System.out.print(" * ");
				 }
				 else {
					 System.out.print("   ");
				 }
			 }
			 System.out.println();
		 }
	 }
}


