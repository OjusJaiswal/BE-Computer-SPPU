package day3;

import java.util.*;

class MyClass{
	int x;
	MyClass(){
		x = 100;
	}
}

public class JavaMethod {
	
	int a = 10;
	
	int[] retArr1(int[] x, int[] y) {
		int[] z = new int[x.length];
		for(int i=0; i<x.length; i++) {
			z[i] = x[i] + y[i];
		}
		return z;
	}
	
	MyClass retObj1(JavaMethod obj) {
		MyClass myObj = new MyClass();
		myObj.x = obj.a;
		return myObj;
	}
	
	MyClass retObj2(int[] x) {
		MyClass myObj = new MyClass();
		myObj.x = x[0];
		return myObj;
	}
	
	int[] retArr2(JavaMethod obj) {
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]= obj.a;
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaMethod obj = new JavaMethod();
		MyClass myObj = new MyClass();
		
		int x[] = {1, 2, 3, 4, 5};
		int y[] = {6, 7, 8, 9, 10};
		int z[] = obj.retArr1(x, y);
		System.out.println("Method returning array and parameter is also array");
		System.out.println(Arrays.toString(z));
		System.out.println();
		
		System.out.println("Method returning object and parameter is also object");
		myObj = obj.retObj1(obj);
		System.out.println(myObj.x);
		System.out.println();
		
		System.out.println("Method returning object and parameter is array");
		myObj = obj.retObj2(x);
		System.out.println(myObj.x);
		System.out.println();
		
		System.out.println("Method returning array and parameter is object");
		x = obj.retArr2(obj);
		System.out.println(Arrays.toString(x));
		System.out.println();
	
	}

}
