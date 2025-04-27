package day2;

public class ArrayArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayVar1[] = {2, 4, 7, 8};
		int arrayVar2[] = {9, 7, 6, 1};
		int arrayVar3[] = new int[4];
		
		System.out.println("Program for Aritmetic Operations on Arrays");
		
		System.out.println("\nArray 1 :-");
		System.out.print("{");
		for(int i=0; i<4; i++) {
			if(i == 3) {
				System.out.print(arrayVar1[i]);
				break;
			}
			System.out.print(arrayVar1[i]+", ");
		}
		System.out.print("}");
		
		System.out.println("\n\nArray 2 :-");
		System.out.print("{");
		for(int i=0; i<4; i++) {
			if(i == 3) {
				System.out.print(arrayVar2[i]);
				break;
			}
			System.out.print(arrayVar2[i]+", ");
		}
		System.out.print("}");
		
		System.out.println("\n\nAddition of two arrays :-");
		for(int i=0; i<4; i++) {
			arrayVar3[i] = arrayVar1[i] + arrayVar2[i];
		}
		System.out.print("{");
		for(int i=0; i<4; i++) {
			if(i == 3) {
				System.out.print(arrayVar3[i]);
				break;
			}
			System.out.print(arrayVar3[i]+", ");
		}
		System.out.print("}");
		
		System.out.println("\n\nSubtraction of two arrays :-");
		for(int i=0; i<4; i++) {
			arrayVar3[i] = arrayVar1[i] - arrayVar2[i];
		}
		System.out.print("{");
		for(int i=0; i<4; i++) {
			if(i == 3) {
				System.out.print(arrayVar3[i]);
				break;
			}
			System.out.print(arrayVar3[i]+", ");
		}
		System.out.print("}");
		
		System.out.println("\n\nMultiplication of two arrays :-");
		for(int i=0; i<4; i++) {
			arrayVar3[i] = arrayVar1[i] * arrayVar2[i];
		}
		System.out.print("{");
		for(int i=0; i<4; i++) {
			if(i == 3) {
				System.out.print(arrayVar3[i]);
				break;
			}
			System.out.print(arrayVar3[i]+", ");
		}
		System.out.print("}");
		
		System.out.println("\n\nDivision of two arrays :-");
		for(int i=0; i<4; i++) {
			arrayVar3[i] = arrayVar1[i] / arrayVar2[i];
		}
		System.out.print("{");
		for(int i=0; i<4; i++) {
			if(i == 3) {
				System.out.print(arrayVar3[i]);
				break;
			}
			System.out.print(arrayVar3[i]+", ");
		}
		System.out.print("}");
		
		System.out.println("\n\nModulus of two arrays :-");
		for(int i=0; i<4; i++) {
			arrayVar3[i] = arrayVar1[i] % arrayVar2[i];
		}
		System.out.print("{");
		for(int i=0; i<4; i++) {
			if(i == 3) {
				System.out.print(arrayVar3[i]);
				break;
			}
			System.out.print(arrayVar3[i]+", ");
		}
		System.out.print("}");
		
	}

}
