class java24{
	public static void main(String[] args){
		System.out.println("Hello");
		try{
			int a = 10/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("World");
	}
}