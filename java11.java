class Circle{
	double r;
	Circle(){
		r = 1;
	}
	Circle(double rad){
		r = rad;
	}
	double getArea(){
		return 3.14*r*r;
	}
	double getPerimeter(){
		return 2*3.14*r;
	}
}

class java11{
	public static void main(String[] args){
		double area,perimeter;
		System.out.println("No argument Constructor");
		Circle x = new Circle();
		area = x.getArea();
		perimeter = x.getPerimeter();
		System.out.println("Area:"+area+" and Perimeter:"+perimeter);
		System.out.println("\nSingle argument constructor");
		Circle y = new Circle(100);
		area = y.getArea();
		perimeter = y.getPerimeter();
		System.out.println("Area:"+area+" and Perimeter:"+perimeter);
		System.out.println("\n-Tirth Bharatiya\n18DCS008");
	}
}