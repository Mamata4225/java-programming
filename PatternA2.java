package com.xworkz.javaprogram.aptiprogram;

public class PatternA2 {
	 public static void main(String[] args) {
		 int lines=5;
		 for(int i=0; i<lines; i++) {
			 for(int j=0; j<lines; j++ ) {
				 if (i==2 || j==2) {
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


