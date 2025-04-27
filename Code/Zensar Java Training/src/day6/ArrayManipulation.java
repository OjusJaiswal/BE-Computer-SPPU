package day6;

import java.util.Arrays;

public class ArrayManipulation {
	int[] arr1 = {1, 2, 3, 4, 6, 7, 9};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12};
	int[] arr3 = {2, 1, 6, 5, 4, 12};
	int[] arr4 = {55, 66, 77, 44, 55};
	
	void missing(int[] arr) {
		System.out.println("\nMissing Values\n");
		System.out.println("Array : "+Arrays.toString(arr));
		int count = 1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != count) {
				System.out.println("Missing value : "+count);
				i--;
			}
			count++;
		}
	}
	
	void duplicate(int[] arr) {
		System.out.println("\nDuplicate Values\n");
		System.out.println("Array : "+Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate value : "+arr[j]);
				}
			}
		}
	}
	
	void minMax(int[] arr) {
		System.out.println("\nSmallest and Largest Values\n");
		System.out.println("Array : "+Arrays.toString(arr));
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Smallest value : "+min);
		System.out.println("Largest value : "+max);
		
	}
	
	void removeDuplicate(int[] arr) {
		System.out.println("\nRemove Duplicate Values\n");
		System.out.println("Array : "+Arrays.toString(arr));
		int i, j;
		int length = arr.length;
		for(i=0; i<length; i++) {
			for(j=i+1; j<length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate value : "+arr[j]);
					if(j == length-1) {
						length--;
					}
					else {
						arr[j] = arr[j+1];
						length--;
					}
				}
			}
		}
		System.out.print("Array without duplicates : [");
		for(i=0; i<length; i++) {
			if(i == length-1) 
				System.out.print(arr[i]+"]"+"\n");
			else
				System.out.print(arr[i]+", ");
		}
	}
	
	void reverse(int[] arr) {
		System.out.println("\nReverse Array\n");
		System.out.println("Array : "+Arrays.toString(arr));
		int[] revArr = new int[arr.length];
		for(int i=arr.length-1, j=0; i>=0; i--, j++) {
			revArr[j] = arr[i];
		}
		System.out.println("Reverse Array : "+Arrays.toString(revArr));
	}
	
	public static void main(String[] args) {
		ArrayManipulation obj = new ArrayManipulation();
		obj.missing(obj.arr1);
		obj.missing(obj.arr2);
		obj.duplicate(obj.arr4);
		obj.minMax(obj.arr3);
		obj.removeDuplicate(obj.arr4);
		obj.reverse(obj.arr3);
	}

}
