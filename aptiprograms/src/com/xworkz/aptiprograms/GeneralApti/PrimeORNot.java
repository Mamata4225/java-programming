package com.xworkz.aptiprograms.GeneralApti;

public class PrimeORNot {
public static void main(String[] args) {
	int number = 77;
	int count = 0;
	for (int i = 2; i < number; i++) {
		if(number % i == 0) {
			count++;
			break;
		}
	}
	if(count == 0) {
		System.out.println("number is prime");
	}
	else
		System.out.println("number is not prime");
}
}
