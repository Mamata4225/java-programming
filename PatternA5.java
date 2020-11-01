package com.xworkz.javaprogram.aptiprogram;

public class PatternA5 {
	 public static void main(String[] args) {
		 int lines=7;
		 for(int i=0; i<lines; i++) {
			 for(int j=0; j<lines; j++ ) {
				 if (i==3 || j==3 || i+j==6 || i-j==0 ) {
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


