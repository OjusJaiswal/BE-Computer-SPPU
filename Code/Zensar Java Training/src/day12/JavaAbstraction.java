package day12;

import java.util.Scanner;

public class JavaAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Interest Calculator :- \n");
		MyInterest obj1 = new MyInterest();
		MyInterest obj2 = new MyInterest(7.0f);
		Scanner s = new Scanner(System.in);
		float P;
		int T, n;
		System.out.println("Enter Principle Amount = ");
		P =  s.nextFloat();
		System.out.println("Enter Time  = ");
		T =  s.nextInt();
		System.out.println("Enter number of times interest applied per time period = ");
		n =  s.nextInt();
		obj1.simpleInterest(P, T);
		obj2.compoundInterest(P, T, n);
	}

}

abstract class Interest {
	float rate;
	abstract void simpleInterest(float P, int T);
	abstract void compoundInterest(float P, int T, int n);
}

class MyInterest extends Interest {
	
	MyInterest(){
		this.rate = 6.4f;
	}
	
	MyInterest(float x){
		this.rate = x;
	}
	
	void simpleInterest(float P, int T) {
		System.out.println("\nSimple Interest : \n");
		System.out.println("Interest Rate = "+this.rate);
		float si = (P*this.rate*T)/100;
		System.out.println("Simple Interest = "+si);
		System.out.println("Total Amount = "+ (P+si));
	}
	
	void compoundInterest(float P, int T, int n) {
		System.out.println("\nCompound Interest : \n");
		System.out.println("Interest Rate = "+this.rate);
		double amount =  P*(Math.pow((1+(this.rate/(n*100))), (n*T)));
		double ci = amount - P;
		System.out.println("Compound Interest = "+ci);
		System.out.println("Total Amount = "+amount);
	}
}