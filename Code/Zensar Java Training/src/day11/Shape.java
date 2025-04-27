package day11;

import java.util.Scanner;

public class Shape {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int ch = 0;
		System.out.println("Area Calculator :=");
		while(ch != 7) {
			System.out.println("\nMenu\n1. Circle\n2. Triangle\n3. Rectangle\n4. Rhombus\n5. Square\n6. Trapezoid\n7. Exit\nEnter your choice =");
			ch = s.nextInt();
			switch(ch) {
				case 1: System.out.println("\nArea of Circle :-\n");
						Circle obj1 = new Circle();
						System.out.println("Area of Circle = "+obj1.area);
						break;
				case 2: System.out.println("\nArea of Triangle :-\n");
						Triangle obj2 = new Triangle();
						System.out.println("Area of Triangle = "+obj2.area);
						break;
				case 3: System.out.println("\nArea of Rectangle :-\n");
						Rectangle obj3 = new Rectangle();
						System.out.println("Area of Rectangle = "+obj3.area);
						break;
						
				case 4: System.out.println("\nArea of Rhombus :-\n");
						Rhombus obj4 = new Rhombus();
						System.out.println("Area of Rhombus = "+obj4.area);
						break;
						
				case 5: System.out.println("\nArea of Square :-\n");
						Square obj5 = new Square();
						System.out.println("Area of Square = "+obj5.area);
						break;
						
				case 6: System.out.println("\nArea of Trapezoid :-\n");
						Trapezoid obj6 = new Trapezoid();
						System.out.println("Area of Trapezoid = "+obj6.area);
						break;
			
				case 7: System.out.println("\nThank you for using this Calculator!!!\n");
						System.out.println("Exiting Calculator!!!");
						break;
						
				default: System.out.println("\nWrong Choice Entered!!!\n");
			}
		}
	}
}

class Area {
	double r, l, b, h, p, q, area;
}

class Circle extends Area {
	final double pi = 3.14;
	
	Circle(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius of circle = ");
		r = s.nextDouble();
		area = pi*Math.pow(r, 2);
	}
}

class Triangle extends Area {
	
	Triangle(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter b = ");
		b = s.nextDouble();
		System.out.println("Enter h = ");
		h = s.nextDouble();
		area = (b*h)/2;
	}
}

class Rectangle extends Area {
	
	Rectangle(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter l = ");
		l = s.nextDouble();
		System.out.println("Enter b = ");
		b = s.nextDouble();
		area = (l*b);
	}
}

class Rhombus extends Area {
	
	Rhombus() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter p = ");
		p = s.nextDouble();
		System.out.println("Enter q = ");
		q = s.nextDouble();
		area = (p*q)/2;
	}
}

class Square extends Area {
	
	Square() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter side = ");
		l = s.nextDouble();
		area = Math.pow(l, 2);
	}
}

class Trapezoid extends Rectangle {
	
	Trapezoid() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter h = ");
		h = s.nextDouble();
		area = ((l+b)*h)/2;
	}
}