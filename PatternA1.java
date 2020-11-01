package com.xworkz.javaprogram.aptiprogram;

public class PatternA1 {
	 public static void main(String[] args) {
		 int lines=5;
		 for(int i=0; i<lines; i++) {
			 for(int j=0; j<lines; j++ ) {
				 if (i==0 || i==1 || i==2 || i==3 || i==4 || j==0 || j==1 || j==2 || j==3 || j==4 || i==5 || j==5 ) {
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

