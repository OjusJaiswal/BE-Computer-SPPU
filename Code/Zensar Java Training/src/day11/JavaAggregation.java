package day11;

import java.util.Scanner;

public class JavaAggregation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int rollNo;
		String sub1;
		String sub2;
		String sub3;
		System.out.println("Enter name of student :- ");
		name = sc.nextLine();
		System.out.println("Enter roll no of student :- ");
		rollNo = sc.nextInt();
		System.out.println("Enter subject 1 of student :- ");
		sub1 = sc.next();
		System.out.println("Enter subject 2 of student :- ");
		sub2 = sc.next();
		System.out.println("Enter subject 3 of student :- ");
		sub3 = sc.next();
		sc.close();
		Student obj1 = new Student(name, rollNo);
		Subject obj2 = new Subject(obj1, sub1, sub2, sub3);
		System.out.println("\nStudent Details using object of Subject class := \n");
		System.out.println("Enter name of student :- "+obj2.s.name);
		System.out.println("Enter roll no of student :- "+obj2.s.rollNo);
		System.out.println("Enter subject 1 of student :- "+obj2.sub1);
		System.out.println("Enter subject 2 of student :- "+obj2.sub2);
		System.out.println("Enter subject 3 of student :- "+obj2.sub3);
	}
}

class Student {
	String name;
	int rollNo;
	
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
}

class Subject {
	Student s;
	String sub1;
	String sub2;
	String sub3;
	
	Subject(Student s, String sub1, String sub2, String sub3) {
		this.s = s;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
}
