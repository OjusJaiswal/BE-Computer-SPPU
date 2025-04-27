package day13;

public class MyInterface implements Tyre {
	
	public void kpaConv(double kpa) {
		System.out.println(kpa+" kpa = "+(kpa*kpaToPsi)+" psi");
		System.out.println(kpa+" kpa = "+(kpa*kpaToBar)+" bar");		
	}	
	
	public static void main(String[] args) {
		MyInterface obj = new MyInterface();
		obj.tyreDefault();
		Tyre.barConv(25.5);
		obj.kpaConv(25.5);
	}
}

interface Tyre{
	double psiToBar = 0.0689;
	double barToPsi = 14.5038;
	double psiToKpa = 6.895;
	double kpaToPsi = 0.145038;
	double barToKpa = 100;
	double kpaToBar = 0.01;
	
	default void psiConv (double psi){
		System.out.println(psi+" psi = "+(psi*psiToBar)+" bar");
		System.out.println(psi+" psi = "+(psi*psiToKpa)+" kpa");
	}
	
	default void tyreDefault(){
		psiConv(25.5);
	}
	
	static void barConv(double bar){
		System.out.println(bar+" bar = "+(bar*barToPsi)+" psi");
		System.out.println(bar+" bar = "+(bar*barToKpa)+" kpa");
	}
	
	void kpaConv(double kpa);
}