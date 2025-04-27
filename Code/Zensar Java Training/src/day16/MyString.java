package day16;

import java.util.Scanner;

public class MyString {
	
	void maxCharCount(String str) {
		System.out.println("\nMaximum Occuring Character :=\n");
		int count;
		int max = -1;
		String s = "";
		char c, result='0';
		for(int i=0; i<str.length(); i++) {
			c = str.charAt(i);
			if(!s.contains(String.valueOf(c))) {	
				count = 1;
				s.concat(String.valueOf(c));
				for(int j=i+1; j<str.length(); j++) {
					if(c == str.charAt(j)) {
						count++;						
					}
					if(count > max) {
						max = count;
						result = c;
					}
				}
			}
		}
		System.out.println("Max occuring character :- "+result+" which occurs "+max+" times in given String :- "+str);
	}
	
	void removeDuplicate(String str1) {
		System.out.println("\nString without duplicate words :=\n");
		String[] s = str1.split(" ");
		StringBuffer str2 = new StringBuffer("");
		for(String i : s) {
			if(!str2.toString().contains(i)) {
				str2.append(i);
				str2.append(" ");
			}
		}
		System.out.println("String without duplicate :- "+str2);
	}
	
	void findSub(String str1) {
		System.out.println("\nMinimum Length SubString :=\n");
		int min = Integer.MAX_VALUE, len = 0, f=0;
		String result = "";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String for checking :- ");
		char str2[] = sc.next().toCharArray();
		String[] s = str1.split(" ");
		for(String i : s) {
			for(int j = 0; j < str2.length; j++) {
				if(i.contains(String.valueOf(str2[j]))) {
					len = i.length();
					f=1;
				}
				else {
					f=0;
					break;
				}
			}
			if(len<min && f == 1) {
				result = i;
				min = len;
			}
		}	
		if(f==1) {
			System.out.println("\nSmallest SubString containing all characters :- "+result);
		}
		else {
			System.out.println("\nNo such SubString found");
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		String str;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String :- ");
		str = sc.nextLine();
		MyString obj = new MyString();
		obj.maxCharCount(str);
		obj.findSub(str);
		obj.removeDuplicate(str);
		sc.close();
	}
}