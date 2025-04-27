package day1;

public class Arithmetic {
	
	int i, j;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic obj = new Arithmetic();
		float z;
		obj.i = 10;
		obj.j = 5;
		System.out.println("Program for Aritmetic Operations\n");
		z = obj.i + obj.j;
		System.out.println("Addition of "+obj.i+" and "+obj.j+" = "+z);
		z = obj.i - obj.j;
		System.out.println("Subtraction of "+obj.i+" and "+obj.j+" = "+z);
		z = obj.i * obj.j;
		System.out.println("Multiplication of "+obj.i+" and "+obj.j+" = "+z);
		z = (float) obj.i / obj.j;
		System.out.println("Division of "+obj.i+" and "+obj.j+" = "+z);
		z = obj.i % obj.j;
		System.out.println("Modulus of "+obj.i+" and "+obj.j+" = "+z);
	}

}
