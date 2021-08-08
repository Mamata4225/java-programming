package com.xworkz.aptiprograms.GeneralApti;

import java.util.Scanner;

public class InsersionSort {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of values");
		int num = scanner.nextInt();
		int[] iSort= new int[num];
		
		System.out.println("Enter Values");
		for(int i=0; i<iSort.length; i++);
		iSort[i]=scanner.nextInt();
	}
	InsersionSort insertionSort = new InsersionSort();
	int []sortedArray = insertionSort.inserstionSort(iSort);
	for (int i=0; i<sortedArray.length; i++) {
		System.out.println(sortedArray[i]);
	}

		
}	
}
