package day9;

import java.util.Scanner;

public class NestedClass {

	public static void main(String[] args) {
		System.out.println("Nested Class :=");
		OuterClass objOuter = new OuterClass();
		OuterClass.InnerClass objInner = objOuter.new InnerClass();
		OuterClass.InnerClass.InnermostClass objInnermost = objInner.new InnermostClass();
		objOuter.accessInner();
		objInner.accessOuter();
		objInnermost.printDiamond();
	}

}

class OuterClass{
	
	 void printPyramid(int n) {
		 System.out.println("\nPyramid : \n");
		 for (int i=0; i<n; i++) {
	            
			 for (int j=n-i; j>1; j--) {
				 System.out.print(" ");
	         }
	 
	         for (int j=0; j<=i; j++ ) {
	             System.out.print("* ");
	         }

	         System.out.println();
		 }       
	 }
	 
	 void accessInner() {
		 System.out.println("\nAccessing InnerClass Members from OuterClass Method :- \n");
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter n = ");
		 int n = s.nextInt();
		 InnerClass obj = new InnerClass();
		 obj.printHalfPyramid(n);
	 }
	 
	 class InnerClass{
		 
		 void printHalfPyramid(int n) {
			 System.out.println("\nHalf Pyramid : \n");
			 int rows = n;
			 for (int i = 1; i <= rows; ++i) {
				 for (int j = 1; j <= i; ++j) {
					 System.out.print("* ");
			      }
			      System.out.println();
			 }
		 }
		 
		 void accessOuter() {
			 System.out.println("\nAccessing OuterClass Members from InnerClass Method :- \n");
			 Scanner s = new Scanner(System.in);
			 System.out.println("Enter n = ");
			 int n = s.nextInt();
			 printPyramid(n);
		 }
		 
		 class InnermostClass{
			 
			 void printDiamond() {
				 System.out.println("\nAccessing InnermostClass Method from main() :- \n");
				 System.out.println("Diamond : \n");
				 Scanner s = new Scanner(System.in);
				 System.out.println("Enter n = ");
				 int n = s.nextInt();
				 int i, j, space = n-1;
				 for (j = 1; j <= n; j++) {
					 for (i = 1; i <= space; i++) {
						 System.out.print(" ");
			         }
			         space--;
			         for (i = 1; i <= 2 * j - 1; i++) {
			             System.out.print("*");                
			         }
			         System.out.println("");
			     }
			        
				 space = 1;
			     for (j = 1; j <= n - 1; j++) {
			    	 for (i = 1; i <= space; i++) {
			    		 System.out.print(" ");
			         }
			         space++;
			         for (i = 1; i <= 2 * (n - j) - 1; i++) {
			             System.out.print("*");
			         }
			         System.out.println("");
			     }
			 }	 
		 }
	 }  
}
