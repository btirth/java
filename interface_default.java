interface f1{
	default void print(){
		System.out.println("f1");
	}
}
interface f2{
	default void print(){
		System.out.println("f2");
	}
}
class interface_default implements f1,f2{
	public void print(){
		f1.super.print();
		f2.super.print();
			
	}
	
	public static void main(String[] args){
		interface_default i1 = new interface_default();
		i1.print();
		System.out.println("\n\nTirth Bharatiya\n18DCS008");
	} 
}