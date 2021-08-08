package com.xworkz.aptiprograms.factorial;

	import java.util.Scanner;
	public class FactorialRecursion {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter number");
			int number = scanner.nextInt();
			FactorialRecursion recursion = new FactorialRecursion();
		    int factorial = recursion.factorial(number);
		    System.out.println(factorial);
		}
		int factorial(int number) {
			int factorial=1;
			if(number>1) {
				return number*factorial(number-1);
				
			}
			else
			return factorial;
		}
	}


