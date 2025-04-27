package day10;

import java.util.Scanner;

public class MonthlySalary {

	public static void main(String[] args) {
		int ch = 0;
		int sales;
		int production;
		float salS;
		float salP;
		Scanner s = new Scanner(System.in);
		System.out.println("Total Monthly Salary of Employees Calculator :=");
		while(ch != 4) {
			System.out.println("\nMenu\n1. Company1\n2. Company2\n3. Company3\n4. Exit\nEnter your choice =");
			ch = s.nextInt();
			switch(ch) {
				case 1: System.out.println("\nCompany1 :-\n");
						System.out.println("Enter no. of Sales Employees = ");
						sales = s.nextInt();
						System.out.println("Enter no. of Production Employees = ");
						production = s.nextInt();
						System.out.println("Enter salary of each Sales Employees = ");
						salS = s.nextFloat();
						System.out.println("Enter salary of each Production Employees = ");
						salP = s.nextFloat();
						new Company1(sales, production, salS, salP);
						break;
						
				case 2: System.out.println("\nCompany2 :-\n");
						System.out.println("Enter no. of Sales Employees = ");
						sales = s.nextInt();
						System.out.println("Enter no. of Production Employees = ");
						production = s.nextInt();
						System.out.println("Enter salary of each Sales Employees = ");
						salS = s.nextFloat();
						System.out.println("Enter salary of each Production Employees = ");
						salP = s.nextFloat();
						new Company2(sales, production, salS, salP);
						break;
						
				case 3: System.out.println("\nCompany3 :-\n");
						System.out.println("Enter no. of Sales Employees = ");
						sales = s.nextInt();
						System.out.println("Enter no. of Production Employees = ");
						production = s.nextInt();
						System.out.println("Enter salary of each Sales Employees = ");
						salS = s.nextFloat();
						System.out.println("Enter salary of each Production Employees = ");
						salP = s.nextFloat();
						new Company3(sales, production, salS, salP);
						break;
						
				case 4: System.out.println("\nThank you for using this Calculator!!!\n");
						System.out.println("Exiting Calculator!!!");
						break;
						
				default: System.out.println("\nWrong Choice Entered!!!\n");
			}
		}
		s.close();
	}
}

class Parent {
	int sales;
	int production;
	float salS;
	float salP;
	float totalSal;
	
	Parent(int s, int p, float salS, float salP) {
		this.sales = s;
		this.production =p;
		this.salS = s * salS;
		this.salP = p * salP;
		this.totalSal = this.salS+this.salP;
		System.out.println("Total Monthly Salary of Sales Employees = "+this.salS);
		System.out.println("Total Monthly Salary of Production Employees = "+this.salP);
		System.out.println("Total Monthly Salary of Employees = "+this.totalSal);
	}
}

class Company1 extends Parent {

	Company1(int s, int p, float salS, float salP) {
		super(s, p, salS, salP);
	}
}

class Company2 extends Parent {

	Company2(int s, int p, float salS, float salP) {
		super(s, p, salS, salP);
	}
}

class Company3 extends Parent {

	Company3(int s, int p, float salS, float salP) {
		super(s, p, salS, salP);
	}
}

