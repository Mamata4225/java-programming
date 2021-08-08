package com.xworkz.aptiprograms.StarPattern;

public class ReverseLeftAngleTriangle {

	public static void main(String[] args) {
		int num = 5;
		
		 for(int i=0; i<num; i++) {
			 for(int j=0; j<num; j++ ) {
				 if(i<=j)
					 System.out.print("* ");
			 
			 else 
				 System.out.print("");
			 
		 }
		 System.out.println();
		 } 
	}

}
