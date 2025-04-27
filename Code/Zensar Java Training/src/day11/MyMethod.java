package day11;

import java.util.Scanner;

public class MyMethod {

	public static void main(String[] args) {
		System.out.println("Metod Overloading :=\n");
		Arithmetic obj1 = new Arithmetic(); 
		obj1.add(12.5, 2.5);
		obj1.add(12.5, 2.5, 3.8);
		obj1.sub(12.5, 2.5);
		obj1.sub(12.5, 2.5, 3.8);
		
		System.out.println("\nMetod Overriding :=\n");
		Arithmetic2 obj2 = new Arithmetic2();
		obj2.mul(0, 0);
		obj2.div(0, 0);	
	}
}

class Arithmetic {
	void add(double x, double y) {
		System.out.println("Addition of "+x+" and "+y+" = "+(x+y));
	}
	
	void add(double x, double y, double z) {
		System.out.println("Addition of "+x+", "+y+" and "+z+" = "+(x+y+z));
	}
	
	void sub(double x, double y) {
		System.out.println("Subtraction of "+x+" and "+y+" = "+(x-y));
	}
	
	void sub(double x, double y, double z) {
		System.out.println("Subtraction of "+x+", "+y+" and "+z+" = "+(x-y-z));
	}
	
	void mul(double x, double y) {
		System.out.println("Multiplication of "+x+" and "+y+" = "+(x*y));
	}
	
	void div(double x, double y) {
		System.out.println("Division of "+x+" and "+y+" = "+(x/y));
	}
}

class Arithmetic2 extends Arithmetic {
	
	void mul(double x, double y) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter x = ");
		x = s.nextDouble();
		System.out.println("Enter y = ");
		y = s.nextDouble();
		System.out.println("Multiplication of "+x+" and "+y+" = "+(x*y));
	}
	
	void div(double x, double y) {
		Scanner s =new Scanner(System.in);
		System.out.println("\nEnter x = ");
		x = s.nextDouble();
		System.out.println("Enter y = ");
		y = s.nextDouble();
		System.out.println("Division of "+x+" and "+y+" = "+(x/y));
	}
}
