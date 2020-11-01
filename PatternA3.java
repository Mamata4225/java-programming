package com.xworkz.javaprogram.aptiprogram;

public class PatternA3 {
	 public static void main(String[] args) {
		 int lines=5;
		 for(int i=0; i<lines; i++) {
			 for(int j=0; j<lines; j++ ) {
				 if (i==0 || i==4 || i+j==4 || i-j==0 ) {
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


