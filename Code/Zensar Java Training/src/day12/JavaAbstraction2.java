package day12;

public class JavaAbstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FountainPen obj = new FountainPen();
		obj.write();
		obj.fill();
		obj.changdeNib();
	}
}

abstract class Pen {
	abstract void write();
	abstract void fill();	
}

class FountainPen extends Pen {
	
	void write() {
		System.out.println("Write Method");
	}
	
	void fill() {
		System.out.println("Fill Method");
	}
	
	void changdeNib() {
		System.out.println("Change Nib Method");
	}
}