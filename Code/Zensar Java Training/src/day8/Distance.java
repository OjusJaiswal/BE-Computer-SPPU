package day8;

import java.util.Scanner;

public class Distance {
	
	final double  mile = 1.60934;
	double km;
	
	Distance(double ml) {
		this.km = ml*mile;
		System.out.println("Distance = "+km+" km");
	}
	
	public static void main(String[] args) {
		System.out.println("Distance Conversion :- \n");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter distance in mile = ");
		double ml = s.nextDouble();
		Distance obj = new Distance(ml);
	}

}
