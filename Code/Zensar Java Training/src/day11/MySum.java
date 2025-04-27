package day11;

import java.util.Scanner;

public class MySum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Addition obj =new Addition();
		int ch = 0;
		System.out.println("Sum Calculator :=");
		while(ch != 4) {
			System.out.println("\nMenu\n1. Add 2 numbers\n2. Add 3 numbers\n3. Add 4 numbers\n4. Exit\nEnter your choice =");
			ch = s.nextInt();
			switch(ch) {
				case 1: System.out.println("\nAddition of 2 numbers :-\n");
						obj.add(0, 0);
						break;
						
				case 2: System.out.println("\nAddition of 3 numbers :-\n");
						obj.add(0, 0, 0);
						break;
						
				case 3: System.out.println("\nAddition of 4 numbers :-\n");
						obj.add(0, 0, 0, 0);
						break;
				
				case 4: System.out.println("\nThank you for using this Calculator!!!\n");
						System.out.println("Exiting Calculator!!!");
						break;
						
				default: System.out.println("\nWrong Choice Entered!!!\n");
			}
		}
	}
}

class Addition {
	
	void add(double x, double y) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter x = ");
		x = s.nextDouble();
		System.out.println("Enter y = ");
		y = s.nextDouble();
		System.out.println("Addition of "+x+" and "+y+" = "+(x+y));
	}
	
	void add(double x, double y, double z) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter x = ");
		x = s.nextDouble();
		System.out.println("Enter y = ");
		y = s.nextDouble();
		System.out.println("Enter z = ");
		z = s.nextDouble();
		System.out.println("Addition of "+x+", "+y+" and "+z+" = "+(x+y+z));
	}
	
	void add(double w, double x, double y, double z) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter w = ");
		w = s.nextDouble();
		System.out.println("Enter x = ");
		x = s.nextDouble();
		System.out.println("Enter y = ");
		y = s.nextDouble();
		System.out.println("Enter z = ");
		z = s.nextDouble();
		System.out.println("Addition of "+w+", "+x+", "+y+" and "+z+" = "+(w+x+y+z));
	}	
}