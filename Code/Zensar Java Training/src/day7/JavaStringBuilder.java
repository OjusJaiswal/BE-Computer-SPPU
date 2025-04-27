package day7;

import java.util.Arrays;

public class JavaStringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder s1 =new StringBuilder();
		StringBuilder s2 =new StringBuilder(50);
		StringBuilder s3 =new StringBuilder("Hello");
		CharSequence cs = "CharSequence";
		StringBuilder s4 =new StringBuilder(cs);
		StringBuilder s5 = new StringBuilder("Java");
		
		System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n");
		
		String str1 = s3.toString().concat(s5.toString());
		System.out.println("s3.toString().concat(s5.toString()) : "+str1);
		
		String str2 = s3.toString()+s5.toString();
		System.out.println("s3.toString()+s5.toString() : "+str2);
		
		s3.append(s4) ; 
		System.out.println("s3.append(s4) : "+s3);
		
		boolean e = s3.equals(s4);
		System.out.println("s3.equals(s4) : "+e);
		
		e=(s3==s5);
		System.out.println("(s3==s5) : "+e);
		
		int l1 = s3.toString().compareTo(s5.toString());
		System.out.println("s3.toString().compareTo(s5.toString()) : "+l1);
		
		System.out.println("s3.charAt(5) : "+s3.charAt(5));
		
		System.out.println("s3.toString().equalsIgnoreCase(s5.toString()) : "+s3.toString().equalsIgnoreCase(s5.toString()));
		
		System.out.println("s3.indexOf(\"h\", 5) : "+s3.indexOf("h", 5));
		
		System.out.println("s5.length() : "+s5.length());
		
		System.out.println("s5.replace(0, 4, \"Python\") : "+s5.replace(0, 4, "Python"));
		
		System.out.println("s5.substring(5,7) : "+s5.substring(3, 6));
		
		System.out.println("s5.toString().toLowerCase() : "+s5.toString().toLowerCase());
		
		System.out.println("s5.toString().toUpperCase() : "+s5.toString().toUpperCase());
		
		s1.append(String.valueOf(e));
		System.out.println("s1.append(String.valueOf(e)) : "+s1);
		
		StringBuilder s6 =new StringBuilder();
		System.out.println(s6.getClass());
		
		e = s3.toString().contains("Char");
		System.out.println("s3.toString().contains(\"Char\"); : "+e);
		
		System.out.println("s5.toString().startsWith(\"n\") : "+s5.toString().startsWith("n"));
		
		System.out.println("s5.toString().endsWith(\"n\") : "+s5.toString().endsWith("n"));
		
		byte[] bArr = s5.toString().getBytes();
		System.out.println("s5.toString().getBytes() : ");
		for(byte x:bArr) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		char[] arrChar = new char[12];
		s3.getChars(2, 4, arrChar, 0);
		System.out.println("s3.getChars(2, 4, arrChar, 0) : "+Arrays.toString(arrChar));
		
		System.out.println("s3.toString().isEmpty() : "+s3.toString().isEmpty());		
	}
	
	public String toString() {
		return "Hi";
	}

}