package day14;

import java.util.Arrays;
import java.util.Scanner;

public class JavaExceptionHandling {
	
	void primeNumber(int a) {
		try {
			Exception e = null;
			if(a<0) {
				throw e;
			}
			int p = 1;
			for(int i=2; i<a; i++) {
				if(a%i == 0) {
					p = 0;
					break;
				}
			}
			if(p == 1) {
				System.out.println(a+" is prime number");
			}
			else {
				System.out.println(a+" is not prime number");
			}
		}
		catch(Exception e) {
			System.out.println("Enter positive number");
		}
	}
	
	void finacciSeries(int n) {
		try {
			Exception e = null;
			if(n<0) {
				throw e;
			}
			int a=0, b=1, c;
			System.out.print(a+" "+b+" ");
			for(int i=2; i<n; i++) {
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
		}
		catch(Exception e) {
			System.out.println("Enter positive number");
		}
	}
	
	void reverse(int num) {
		int reversed = 0;
	    System.out.println("Original Number: " + num);
	    while(num != 0) {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	      num /= 10;
	    }
	    System.out.println("Reversed Number: " + reversed);
	}
	
	void kmToM(double km) {
		try {
			Exception e = null;
			if(km<0) {
				throw e;
			}
			double m = km*1000;
			System.out.println("Distance in meter = "+m+" m");
		}
		catch(Exception e) {
			System.out.println("Enter positive number");
		}
	}
	
	void mToIn(double m) {
		try {
			Exception e = null;
			if(m<0) {
				throw e;
			}
			double in = m*3.28084*12;
			System.out.println("Distance in inches = "+in+" in");
		}
		catch(Exception e) {
			System.out.println("Enter positive number");
		}
	}
	
	void inToFt(double in) {
		try {
			Exception e = null;
			if(in<0) {
				throw e;
			}
			double ft = in/12;
			System.out.println("Distance in feet = "+ft+" ft");
		}
		catch(Exception e) {
			System.out.println("Enter positive number");
		}
	}
	
	void arrayMultiply(int a[][], int b[][]) {
		int c[][] = new int[a.length][b[0].length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b[0].length; j++) {
				c[i][j] = 0;
				for(int k=0; k<b.length; k++) {
					c[i][j] += a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
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
	
	void circle(){
		try {
			Exception e = null;	
			final double pi = 3.14;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter radius of circle = ");
			double r = s.nextDouble();
			if(r<0) {
				throw e;
			}
			double area = pi*Math.pow(r, 2);
			System.out.print("Area of circle = "+area);
		}
		catch(Exception e) {
			System.out.println("Enter positive number");
		}
	}
	
	void triangle(){
		try {
			Exception e = null;	
			Scanner s = new Scanner(System.in);
			System.out.println("Enter b = ");
			double b = s.nextDouble();
			if(b<0) {
				throw e;
			}
			System.out.println("Enter h = ");
			double h = s.nextDouble();
			if(h<0) {
				throw e;
			}
			double area = (b*h)/2;
			System.out.print("Area of triangle = "+area);
		}
		catch(Exception e) {
			System.out.println("Enter positive number");
		}
	}
	
	void rectangle(){
		try {
			Exception e = null;	
			Scanner s = new Scanner(System.in);
			System.out.println("Enter l = ");
			double l = s.nextDouble();
			if(l<0) {
				throw e;
			}
			System.out.println("Enter b = ");
			double b = s.nextDouble();
			if(b<0) {
				throw e;
			}
			double area = (l*b);
			System.out.print("Area of rectangle = "+area);
		}
		catch(Exception e) {
			System.out.println("Enter positive number");
		}
	}
	
	void square() {
		try {
			Exception e = null;	
			Scanner s = new Scanner(System.in);
			System.out.println("Enter side = ");
			double l = s.nextDouble();
			if(l<0) {
				throw e;
			}
			double area = Math.pow(l, 2);
			System.out.print("Area of square = "+area);
		}
		catch(Exception e) {
			System.out.println("Enter positive number");
		}
	}
	
	public static void main(String[] args) {
		JavaExceptionHandling obj = new JavaExceptionHandling();
		System.out.println("Prime number := \n");
		obj.primeNumber(5);
		System.out.println();
		obj.primeNumber(-5);
		System.out.println("\nFibonacci Series := \n");
		obj.finacciSeries(5);
		System.out.println("\n");
		obj.finacciSeries(-5);
		System.out.println("\nReverse number := \n");
		obj.reverse(-100);
		System.out.println("\nKm to M := \n");
		obj.kmToM(200);
		System.out.println();
		obj.kmToM(-200);
		System.out.println("\nM to Inch := \n");
		obj.mToIn(200);
		System.out.println();
		obj.mToIn(-200);
		System.out.println("\nInch to Ft := \n");
		obj.inToFt(200);
		System.out.println();
		obj.inToFt(-200);
		System.out.println("\n2D Array Multiplication := \n");
		int a[][] = {{1, 2},{3, 4}};
		int b[][] = {{5, 6},{7, 8}};
		obj.arrayMultiply(a, b);
		System.out.println("\nArray Remove Duplicate:=");
		int c[] = {1, 2, 2, 1, 3, 3};
		obj.removeDuplicate(c);
		System.out.println("\nArea of Shapes := \n");
		System.out.println("Area of Circle :- \n");
		obj.circle();
		System.out.println("\n\nArea of Triangle :- \n");
		obj.triangle();
		System.out.println("\nArea of Rectangle :- \n");
		obj.rectangle();
		System.out.println("\nArea of Square :- \n");
		obj.square();		
	}
}

