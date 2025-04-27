package A3;

import java.io.Console;
public class TestJNI {
	
	static {
	           System.loadLibrary("MO");
	}


private native int addition(int n1, int n2);
private native int subtraction(int n1, int n2);
private native int multiplication(int n1, int n2);
private native int division(int n1, int n2);


public static void main(String[] args)  {


Console console = System.console();

System.out.println("\n\n\n Enter first number: ");
int i = Integer.parseInt(console.readLine());

System.out.println("\n Enter Second number: ");
int j = Integer.parseInt(console.readLine());

System.out.println("\n Addition is       ="+ new TestJNI().addition(i,j));
System.out.println("\n Subtraction is    ="+ new TestJNI().subtraction(i,j));
System.out.println("\n Multiplication is ="+ new TestJNI().multiplication(i,j));
System.out.println("\n Division is       ="+ new TestJNI().division(i,j));
System.out.println("\n\n");

}
}
