import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
class java30{
	public static void main(String[] args){
		
		File f = new File("18DCS008.txt");
		FileInputStream fin = new FileInputStream("input.txt");
		FileOutputStream fout = new FileOutputStream("18DCS008.txt");
		int i = 0;
		while((i = fin.read()) != -1){
			fout.write((char)i);
		}
		fin.close();
		System.out.println("\n\n-18DCS008\nTirth Bharatiya");
	}

}