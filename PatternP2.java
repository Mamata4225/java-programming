package com.xworkz.javaprogram.aptiprogram;

public class PatternP2 {
	 public static void main(String[] args) {
		 int lines=11;
		 for(int i=0; i<lines; i++) {
			 for(int j=0; j<lines; j++ ) {
				 if (i==0 || i==lines-1 || j==0 || j==lines-1 || i+j==lines-1 ) {
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


