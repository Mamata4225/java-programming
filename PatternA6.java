package com.xworkz.javaprogram.aptiprogram;

public class PatternA6 {
	 public static void main(String[] args) {
		 int lines=7;
		 for(int i=0; i<lines; i++) {
			 for(int j=0; j<lines; j++ ) {
				 if (i-j==0 ||  i+j==6 ) {
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



