class A{
	public void fun(){
		try{
			throw new NullPointerException();
		}
		catch(NullPointerException e){
			System.out.println("catch in fun()");
			throw e;
		}
	}
}
class java25{
	public static void main(String[] args){
		A a = new A();		
		try{
			a.fun();
		}
		catch(NullPointerException e){
			System.out.println("Catch in main");
		}
		System.out.println("\n-18DCS008\nTirth Bharatiya");
	}
	
}