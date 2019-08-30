interface Luminious{
	public void lightOff();
	public void lightOn();
}
class solid{
}
class cube extends solid{
}
class cone extends solid{
}
class LuminiousCone extends cone implements Luminious{
	public void lightOff(){
		System.out.println("Cone Light Off");
	}
	public void lightOn(){
		System.out.println("Cone Light On");
	}
}
class LuminiousCube extends cube implements Luminious{
	public void lightOff(){
		System.out.println("Cube Light Off");
	}
	public void lightOn(){
		System.out.println("Cube Light On");
	}
}
class java16{
	
	public static void main(String[] args){
		LuminiousCone cn = new LuminiousCone();
		LuminiousCube cb = new LuminiousCube();
		System.out.println("------Cone------");
		cn.lightOff();
		cn.lightOn();
		System.out.println("\n------Cube------");
		cb.lightOff();
		cb.lightOn();
		System.out.println("\n\nTirth Bharatiya\n18DCS008");
	}
	
}
