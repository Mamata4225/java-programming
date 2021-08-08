package com.xworkz.aptiprograms.GeneralApti;

public class PrimeNumRange {
	
		public static void main(String[] args) {
			
			int startNum = 1;
			int endNum = 20;
			System.out.println("prime numbers b/w the range " + startNum +" - " + endNum +"");
			
			for(int i = startNum; i<=endNum; i++) {
				int count = 0;
				for(int j = 2; j<=i/2; j++) {
					if(i%j == 0) {
						count++;
						
					}
				}
				if(count==0 && i!=1) {
					System.out.print(i+" ");
				}
			}
		}
		}

