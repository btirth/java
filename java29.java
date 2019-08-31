import java.io.*;
import java.util.Scanner;
class java29{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	System.out.print("Enter File Name: ");
	String fileName = sc.nextLine();
	File f = new File(fileName);
	
	System.out.println("-----------Before any change------------");
	System.out.println("File is readable? "+f.canRead());
	System.out.println("File is writable? "+f.canWrite());
	System.out.println("File is executable? "+f.canExecute());
	
	//Changes
	f.setReadable(false);
	f.setWritable(false);
	f.setExecutable(false);
	
	System.out.println("\n-------------After Changes--------------");
	System.out.println("File is readable? "+f.canRead());
	System.out.println("File is writable? "+f.canWrite());
	System.out.println("File is executable? "+f.canExecute());
	
	System.out.println("\n\n-18DCS008\nTirth Bharatiya");
	
	}
	
}