package day17;

import java.util.Arrays;

public class MyArray {
	
	void minMaxElement(int arr[]) {
		System.out.println("\nMinimum and Maximum element in Array :=\n");
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Minimum element = "+min+" and Maximum element = "+max+" in Array :- "+Arrays.toString(arr));
	}
	
	void findOccurence(int arr[]) {
		System.out.println("\nCount occurence of each element in Array :=\n");
		int count=0, i, j;
		for(i=0; i<arr.length; i++) {
			count = 0;
			for(j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count += 1;
				}
			}
			System.out.println("Element "+arr[i]+" occurs "+count+" times in Array :- "+Arrays.toString(arr));
		}	
	}
	
	void findSum(int arr[]) {
		System.out.println("\nPair of elements in Array whose sum is equal to 10 or 20 :=\n");
		System.out.println("Below are pairs having sum 10 or 20 in Array :- "+Arrays.toString(arr)+"\n");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if((arr[i]+arr[j]) == 10) {
					System.out.println("Pair of "+arr[i]+" and "+arr[j]+" has sum as 10");
				}
				if((arr[i]+arr[j]) == 20) {
					System.out.println("Pair of "+arr[i]+" and "+arr[j]+" has sum as 20");
				}
			}
		}
	}
	
	void reverse(int arr[]) {
		System.out.println("\nReverse of Array :=\n");
		System.out.println("Reverse of "+Arrays.toString(arr)+" :- \n");
		for(int i=arr.length-1; i>=0; i--) {
			if(i == arr.length-1) {
				System.out.print("{"+arr[i]+", ");
				continue;
			}
			if(i == 0) {
				System.out.print(arr[i]+"}");
				continue;
			}
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	
	void sortTwoArrays(int a[], int b[]) {
		System.out.println("\nMerging and Sorting of two unsorted Arrays :=\n");
		System.out.println("Unsorted Array 1 = "+Arrays.toString(a));
		System.out.println("\nUnsorted Array 2 = "+Arrays.toString(b));
		int c[] = new int[a.length+b.length];
		for(int i=0, j=0; i<a.length; i++, j++) {
			c[j] = a[i];
		}
		for(int i=0, j=a.length; i<b.length; i++, j++) {
			c[j] = b[i];
		}
		Arrays.sort(c);
		System.out.println("\nMerged and sorted array = "+Arrays.toString(c));
	}
	
	public static void main(String[] args) {
		MyArray obj = new MyArray();
		int a[] = {1, 5, 9, 8, 4, 2, 3, 6, 7, 5, 2, 4, 6, 10, 15, 14, 12, 13, 16, 17}; 
		int b[] = {1, 5 ,10, 20, 58, 72, 11, 2, 3, 5, 1};
		System.out.println("Array 1 := "+Arrays.toString(a));
		System.out.println("\nArray 2 := "+Arrays.toString(b));
		obj.minMaxElement(a);
		obj.minMaxElement(b);
		obj.findOccurence(a);
		obj.findOccurence(b);
		obj.findSum(a);
		obj.findSum(b);
		obj.reverse(a);
		obj.reverse(b);
		obj.sortTwoArrays(a, b);
	}
}
