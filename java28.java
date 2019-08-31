import java.io.*;
class java28{
	public static void main(String[] args){
		displayIt(new File("D://18DCS008"));
	}
	public static void displayIt(File f){
		System.out.println(f.getAbsoluteFile());
		
		if(f.isDirectory()){
			String[] subNote = f.list();
			for(String FileName : subNote){
				displayIt(new File(f,FileName));
			}
		}
		
		System.out.println("\n\n-18DCS008\nTirth Bharatiya");
	}
	
}