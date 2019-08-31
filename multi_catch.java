class multi_catch{
	public static void main(String[] args){
		try{
			int a = 10/0;
		}
		
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		catch(Exception e){
			System.out.println("Exception");
		}
		
		//Error
		
		/*catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}*/
	}
}