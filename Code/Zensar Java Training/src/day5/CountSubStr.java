package day5;

import java.util.Scanner;

public class CountSubStr {
	
	void findCount(String str, String subStr) {
		boolean found = false;
		int numSubStr = 0;
		int max = str.length() - subStr.length();
		find:
			for(int i=0; i<max; i++) {
				int n=subStr.length();
				int j=i, k=0;
				while(n-- != 0) {
					if(str.charAt(j++) != subStr.charAt(k++)) {
						continue find;
					}
				}
				found = true;
				numSubStr++;
			}
		System.out.println("\nFound "+numSubStr+" SubStr : "+subStr+" in Str : "+str);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		System.out.println("\nEnter Sub String : ");
		String subStr = sc.nextLine();
		CountSubStr obj = new CountSubStr();
		obj.findCount(str, subStr);
	}

}
