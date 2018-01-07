package com.tyton25;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] myIntegers = getIntegers(5);
		int[] sortedIntegers = sortIntegers(myIntegers);
		printArray(sortedIntegers);
		
	}
	
	public static int[] sortIntegers(int[] array) {
		
		int[] sortedArray = Arrays.copyOf(array, array.length);
		boolean flag = true;
		int temp;		
		while(flag) {
			flag = false;
			for(int i=0; i<sortedArray.length; i++) {
				if(sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}

		return sortedArray;
	}
	
	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("Element " + i + ", value is " + array[i]);
			}
	}
	
	public static int[] getIntegers(int number) {
		int[] values = new int[number];
		System.out.println("Enter " + number + " integer values.\r");
		
		for(int i=0; i<values.length; i++) {
			values[i] = scanner.nextInt();
		}
		
		return values;
	}
}
