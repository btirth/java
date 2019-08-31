class java26{
	public static void main(String[] args){
		try{
			
			
			try{
				int b[] = new int[3];
				b[4] = 4;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			int a = 10/0;
			
			
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		
		finally{
			System.out.println("Hello Geeks");
		}
		System.out.println("\n-18DCS008\nTirth Bharatiya");
	}
}