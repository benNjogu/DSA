package com.keytech;

public class Main {

	public static void main(String[] args) {

		int[] intArray = {-22,-15,1,7,20,35,55};
		
		System.out.println(iterativeBinarySearch(intArray, -15));
		System.out.println(iterativeBinarySearch(intArray, 1));
		System.out.println(iterativeBinarySearch(intArray, 55));
		System.out.println(iterativeBinarySearch(intArray, 13));
		System.out.println("----------------------------------------");
		System.out.println(recursiveBinarySearch(intArray, -15));
		System.out.println(recursiveBinarySearch(intArray, 1));
		System.out.println(recursiveBinarySearch(intArray, 55));
		System.out.println(recursiveBinarySearch(intArray, 13));
	}

	public static int iterativeBinarySearch(int[] input, int value) {
		int start = 0;
		int end = input.length;
		
		while(start < end) {
			int midpoint = (start + end) / 2;
			if (input[midpoint] == value) {
				return midpoint;
			}else if (input[midpoint] < value) {
				start = midpoint + 1;	
			}else {
				end = midpoint;
			}
		}
		
		return -1;
	}
	

	public static int recursiveBinarySearch(int[] input, int value) {
		return recursiveBinarySearch(input, 0, input.length, value);
	}

	private static int recursiveBinarySearch(int[] input, int start, int end, int value) {
		if (start >= end) {
			return -1;
		}
		
		int midpoint = (start + end) / 2;
		System.out.println("midpoint = "+midpoint);
		if (input[midpoint] == value) {
			return midpoint;
		}else if (input[midpoint] < value) {
			start = midpoint + 1;
			return recursiveBinarySearch(input, midpoint+1,end,value);
		}else {
			end = midpoint;
			return recursiveBinarySearch(input, start,midpoint,value);
		}
	}
	
}
