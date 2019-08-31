import java.io.*;

class java27{
	public static void main(String[] args) throws IOException{
		
		File obj = new File("18DCS008.txt");
		if(obj.createNewFile()){
			System.out.println("File Created: "+ obj.getName());
			
		}
		else{
			System.out.println("File already exists");
		}
		System.out.println("File Path: "+obj.getAbsolutePath());
		System.out.println("File Length: "+obj.length());
		System.out.println("\n\n-18DCS008\nTirth Bharatiya");
	}
	
}