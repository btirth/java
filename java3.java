class java3{
	public static void lastDigit(int a,int b){
		
		//Method:1
		
		/*if (a%10 == b%10){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}*/
		
		
		

		//Method:2
		
		String c = Integer.toString(a);
		String d = Integer.toString(b);
		
		if (d.endsWith(c)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}	
	}
	
	public static void main(String[] argc){
		lastDigit(7,17);
		lastDigit(6,17);
		
		System.out.println("\n18DCS008\n-Tirth Bharatiya");
	}
}