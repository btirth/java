interface p{
	int i1 = 1;
	void printP();
}
interface p1 extends p{
	int i2 = 2;
	void printP1();
}
interface p2 extends p{
	int i3 = 3;
	void printP2();
}
interface p12 extends p1,p2{
	int i4 = 4;
	void printP12();
}

class java17 implements p12{
	public void printP(){
		System.out.println("In P   i: "+i1);
	}
	public void printP1(){
		System.out.println("In P1  i: "+i2);
	}
	public void printP2(){
		System.out.println("In P2  i: "+i3);
	}
	public void printP12(){
		System.out.println("In P12 i: "+i4);
	}
	public static void main(String[] args){
		java17 a = new java17();
		a.printP();
		a.printP1();
		a.printP2();
		a.printP12();
		System.out.println("\n\nTirth Bharatiya\n18DCS008");
	}
}
