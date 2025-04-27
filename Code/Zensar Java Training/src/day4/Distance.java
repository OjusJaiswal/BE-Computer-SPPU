package day4;

import java.util.*;

public class Distance {
	
	void kmToM(double km) {
		double m = km*1000;
		System.out.println("Distance in meter = "+m+" m");
	}
	
	void mToFt(double m) {
		double ft = m*3.28084;
		System.out.println("Distance in feet = "+ft+" ft");
	}
	
	void ftToIn(double ft) {
		double in = ft*12;
		System.out.println("Distance in inches = "+in+" in");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Distance obj = new Distance();
		int c = 1;
		int ch;
		double d;
		while(c == 1) {
			System.out.println("Menu \n1. Convert km to m \n2. Convert m to ft \n3. Convert ft to in \n\nEnter Choice : ");
			ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("\nEnter distance in km : ");
					d = sc.nextDouble();
					obj.kmToM(d);
					break;
				
				case 2:
					System.out.println("\nEnter distance in m : ");
					d = sc.nextDouble();
					obj.mToFt(d);
					break;
				
				case 3:
					System.out.println("\nEnter distance in ft : ");
					d = sc.nextDouble();
					obj.ftToIn(d);
					break;
					
				default:
					System.out.println("Wrong choice entered");
				
			}
			
			System.out.println("\nWant to convert again (1/0) : ");
			c = sc.nextInt();
			System.out.println();
		}
	}

}
