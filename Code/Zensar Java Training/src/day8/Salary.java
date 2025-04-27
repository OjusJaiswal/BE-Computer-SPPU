package day8;

import java.util.Scanner;

public class Salary {
	final double eDaySal;
	String eName;
	int eWorkDays;
	int eLeaves;
	int monthDays;
	double eTotalSal;
	
	Salary(){
		this.eDaySal = 2500;
	}
	
	Salary(String name, int workDays, int leaves, int monthDays){
		this();
		this.eName = name;
		this.eWorkDays = workDays;
		this.eLeaves = leaves;
		this.monthDays = monthDays;
		this.eTotalSal = this.eDaySal*(this.eWorkDays-this.eLeaves);
		if((this.eWorkDays+this.eLeaves)<this.monthDays) {
			System.out.println("\nEmployee Details : ");
			System.out.println("Emp Name = "+this.eName);
			System.out.println("Emp Work Days = "+this.eWorkDays);
			System.out.println("Emp Leaves = "+this.eLeaves);
			System.out.println("Emp Daily Salary = "+this.eDaySal);
			System.out.println("Emp Total Salary = "+this.eTotalSal);
			System.out.println();
		}
		else {
			System.out.println("Wrong Info Entered");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Salary Calculator :- \n");
		String name;
		int workDays, leaves, monthDays;
		Scanner s = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("Enter Name = ");
			name = s.next();
			System.out.println("Enter Work Days = ");
			workDays = s.nextInt();
			System.out.println("Enter Leaves = ");
			leaves = s.nextInt();
			System.out.println("Enter Month Days = ");
			monthDays = s.nextInt();
			Salary obj = new Salary(name, workDays, leaves, monthDays);		
		}
	
	}

}
