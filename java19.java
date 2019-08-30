abstract class Shape{
	int i = 10,j = 20;
	void printArea(){};
} 
class Rectangle extends Shape{
	void printArea(){
		System.out.println("Rectangle area: "+(i*i));
	}
}
class Triangle extends Shape{
	void printArea(){
		System.out.println("Triangle area: "+(0.5*i*j));
	}
}
class Circle extends Shape{
	void printArea(){
		System.out.println("Circle area: "+(3.14*i*i));
	}
} 
class java19{
	public static void main(String[] args){
		Rectangle r = new Rectangle();
	Triangle t = new Triangle();
	Circle c = new Circle();
	r.printArea();
	t.printArea();
	c.printArea();
	System.out.println("\n\nTirth Bharatiya\n18DCS008");
	}
	
}