package day15;

import java.util.Scanner;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class MyFile {
	
	public void readWeb() {
		 try {
			 URL url = new URL("http://www.google.com:80/");
	         PrintWriter out = new PrintWriter( new FileWriter("C:\\Users\\OJUS\\eclipse-workspace-java\\Zensar Java Training\\src\\day15\\File.txt"));
	         BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
	         String line;
	         System.out.println("File content :- \n");
	         while ((line = in.readLine()) != null) {
	        	 System.out.println(line);
	             out.println(line);
	         }
	         in.close();
	         out.close();
	    }
	    catch (MalformedURLException e) {
	    	System.out.println("Malformed URL: " + e.getMessage());
	    }
	    catch (IOException e) {
	        System.out.println("I/O Error: " + e.getMessage());
	    }
	}
	
	public void copyFile(String path) throws FileNotFoundException, IOException {
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			in = new BufferedReader( new FileReader(path));
			out = new PrintWriter( new FileWriter("C:\\Users\\OJUS\\eclipse-workspace-java\\Zensar Java Training\\src\\day15\\CopyFile.txt"));
			String str;
			System.out.println("CopyFile content :- \n");
			while((str=in.readLine()) != null) {
				out.println(str);
				System.out.println(str);
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			in.close();
			out.close();
		}
	}
	
	void readUserInput()
	{	
		BufferedReader br = null;
		File f1 = null;
		FileWriter obj= null;
		Scanner scnObj = null;
		String str;
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String :- ");
		try {
			str=br.readLine();
			
			obj=new FileWriter("C:\\Users\\OJUS\\eclipse-workspace-java\\Zensar Java Training\\src\\day15\\UserFile.txt");
			obj.write(str);
			obj.close();
			
			System.out.println("\nUserFile content :- \n");
			f1 = new File("C:\\Users\\OJUS\\eclipse-workspace-java\\Zensar Java Training\\src\\day15\\UserFile.txt");
			scnObj=new Scanner(f1);
			while(scnObj.hasNextLine()) {
				String s=scnObj.nextLine();
				System.out.println(s);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {	
			scnObj.close();
		}	
	}
	
	public static void main(String[] args) {
		MyFile obj = new MyFile();
		System.out.println("Reading from Web := \n");
		obj.readWeb();
		
		System.out.println("\nCopying File := \n");
		try {
			obj.copyFile("C:\\Users\\OJUS\\eclipse-workspace-java\\Zensar Java Training\\src\\day15\\File.txt");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nTaking File from User:= \n");
		obj.readUserInput();	
	}
}
