package day4;

import java.util.*;

public class Temperature {
	
	void fahrenheit(double cTemp) {
		double fTemp = 1.8*cTemp + 32;
		System.out.println("Temperature in fahrenheit = "+fTemp+" degree F");
	}
	
	void celsius(double fTemp) {
		double cTemp = 0.556*(fTemp - 32);
		System.out.println("Temperature in celsius = "+cTemp+" degree C");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Temperature obj = new Temperature();
		int c = 1;
		int ch;
		double temp;
		while(c == 1) {
			System.out.println("Menu \n1. Convert to Celsius \n2. Convert to Fahrenheit \n\nEnter Choice : ");
			ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("\nEnter temperatue in Fahrenheit : ");
				temp = sc.nextDouble();
				obj.celsius(temp);
			}
			else if(ch == 2){
				System.out.println("\nEnter temperatue in Celsius : ");
				temp = sc.nextDouble();
				obj.fahrenheit(temp);
			}
			else {
				System.out.println("Wrong choice entered");
			}
			System.out.println("\nWant to convert again (1/0) : ");
			c = sc.nextInt();
			System.out.println();
		}
		
	}

}
