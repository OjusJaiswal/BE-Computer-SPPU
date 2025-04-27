package day18;

import java.util.*;

public class MyCollections {
	
	 void traverseArray(){
	 	System.out.println("Traversing ArrayList :=\n");
		ArrayList<Integer> obj = new ArrayList<>();
		for(int i =0; i<10; i++){
			obj.add(i);
		}
		int s = obj.size();
	    for(int i=0; i<s; i++){
			System.out.println(obj.get(i));
		}
	}
	
	void traverseLL(){
		System.out.println("\nTraversing LinkedList :=\n");
		LinkedList<String> obj = new LinkedList<String>();
		for(int i =0; i<10; i++){
			obj.add("LinkedList"+i);
		}
		for(String i : obj){
			System.out.println(i);
		}
	}
	
	void traverseMap(){
		System.out.println("\nTraversing HashMap :=\n");
		HashMap <Integer, String> obj = new HashMap<>();
		for(int i =0; i<10; i++){
			obj.put(i, "HashMap"+i);
		}
		obj.forEach((k, v) -> System.out.println(k+" = "+v));
	}
	
	void traverseSet(){
		System.out.println("\nTraversing HashSet :=\n");
		HashSet<String> obj = new HashSet<String>();
		for(int i =0; i<10; i++){
			obj.add("HashSet"+i);
		}
		for(String i : obj){
			System.out.println(i);
		}
	}
	
	void traverseTable(){
		System.out.println("\nTraversing Hashtable :=\n");
		Hashtable <Integer, String> obj = new Hashtable<>();
		for(int i =0; i<10; i++){
			obj.put(i, "Hashtable"+i);
		}
		obj.forEach((k, v) -> System.out.println(k+" = "+v));
	}
	
	void searchArray(int e){
		System.out.println("\nSearching ArrayList for "+e+" :=\n");
		int f=0;
		ArrayList<Integer> obj = new ArrayList<>();
		for(int i =0; i<10; i++){
			obj.add(i);
		}
		int s = obj.size();
	    for(int i=0; i<s; i++){
			if(e == obj.get(i)){
				f=1;
				break;
			}
		}
		if(f==0){
			System.out.println("Element not present");
		}
		else{
			System.out.println("Element is present");
		}
	}
	
	void searchSet(String e){
		System.out.println("\nSearching HashSet for "+e+" :=\n");
		int f=0;
		HashSet<String> obj = new HashSet<String>();
		for(int i =0; i<10; i++){
			obj.add("HashSet"+i);
		}
		for(String i : obj){
			if(e.equals(i)){
				f=1;
				break;
			}
		}
		if(f==0){
			System.out.println("Element not present");
		}
		else{
			System.out.println("Element is present");
		}
	}
	
	void checkEmpty(){
		System.out.println("\nChecking if HashMap is Empty :=\n");
		HashMap <Integer, String> obj = new HashMap<>();
		for(int i =0; i<10; i++){
			obj.put(i, "HashMap"+i);
		}
		System.out.println("HashMap is Empty = "+obj.isEmpty());
	}
	
	void insertArray(int index){
		System.out.println("\nInserting 10 in ArrayList at index "+index+" :=\n");
		ArrayList<Integer> obj = new ArrayList<>();
		for(int i =0; i<10; i++){
			obj.add(i);
		}
		obj.add(index, 10);
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		MyCollections obj = new MyCollections();
		obj.traverseArray();
		obj.traverseLL();
		obj.traverseMap();
		obj.traverseSet();
		obj.traverseTable();
		obj.searchArray(60);
		obj.searchSet("HashSet3");
		obj.checkEmpty();
		obj.insertArray(5);
	}
}