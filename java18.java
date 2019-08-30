interface motion{
	void forward();
	void stop();
	void reverse();
}
interface sound{
	void beep();
}

abstract class Robot{
}
class RobotA extends Robot{
}
class RobotB extends Robot implements motion{
	public void forward(){
		System.out.println("forward in RobotB");
	}
	public void stop(){
		System.out.println("stop in RobotB");
	}
	public void reverse(){
		System.out.println("reverse in RobotB");
	}
	
}
class RobotC extends Robot implements motion{
	public void forward(){
		System.out.println("forward in RobotB");
	}
	public void stop(){
		System.out.println("stop in RobotC");
	}
	public void reverse(){
		System.out.println("reverse in RobotB");
	}
}
class RobotA1 extends RobotA implements sound{
	public void beep(){
		System.out.println("beep in RobotA1");
	}
} 
class RobotB1 extends RobotB implements sound{
	
	public void beep(){
		//super.stop();
		System.out.println("beep in RobotB1");
	}
} 
class RobotC1 extends RobotC implements sound{
	
	public void beep(){
		//super.stop();
		System.out.println("beep in RobotC1");
	}
}

class java18{
	public static void main(String[] args){
		RobotA1 a1 = new RobotA1();
		RobotB1 b1 = new RobotB1();
		RobotC1 c1 = new RobotC1();
		
		a1.beep();
		b1.stop();
		b1.beep();
		c1.stop();
		c1.beep();
		System.out.println("\n\nTirth Bharatiya\n18DCS008");
	} 
	
}