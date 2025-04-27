package day9;

import java.util.Scanner;

public class LocalClass {
	
	LocalClass() {
		final int passLen = 8;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter password : ");
		String pass = s.nextLine();
		 
		class Password{
			Password(String pass){
				if(pass.length() >= passLen) {
					if(pass.equals("MyPassword@123")) {
						System.out.println("\nCorrect Password");
						System.out.println("Successfully Logged in");
					}
					else 
						System.out.println("\nIncorrect Password");
				}
				else
					System.out.println("\nInvalid Password");
			}	
		}	
		Password obj = new Password(pass);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Local Class :=");
		System.out.println("\nPassword Validation System :-\n");
		LocalClass obj = new LocalClass();
	}
}
