import java.io.*;
public class java32{
	public static void main(String[] args) throws IOException{
		try{
			FileWriter wr = new FileWriter("op.txt");
			BufferedWriter wBuffer = new BufferedWriter(wr);
			
			wBuffer.write("First LIne");
			wBuffer.newLine();
			wBuffer.write("Second Line");
			wBuffer.newLine();
			wBuffer.write("Third Line");
			wBuffer.newLine();
			wBuffer.close();
		}
		catch(Exception e){
			System.out.println("Interrupted");
		}
		try{
			FileReader fr = new FileReader("op.txt");
			BufferedReader rBuffer = new BufferedReader(fr);
			
			System.out.println(rBuffer.readLine());
			System.out.println(rBuffer.readLine());
			System.out.println(rBuffer.readLine());
			
			rBuffer.close();
		}
		catch(Exception e){
			System.out.println("Interrupted");
		}
		
		System.out.println("\n-18DCS008\nTirth Bharatiya");
		
	}
	
}