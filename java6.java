import java.util.Scanner;

class java6
{
	
	void bmi()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in pounds");
		double w = sc.nextDouble();
		System.out.println("Enter height in inches");
		double h = sc.nextDouble();
	
		double wKg = w*0.45359237;	
		double hmeter = h*0.0254;
	
		double BMI = wKg/(hmeter*hmeter);
		System.out.println("\nBMI is "+BMI);
	
		if (BMI<=30){
			if (BMI<18.5){
				System.out.println("\nUnderweight");
			}
			else if(BMI>=18.5 && BMI<25.0){
				System.out.println("\nNormal");
			}
			else if(BMI>=25.0 && BMI<30.0){
				System.out.println("\nOverweight");
			}
			else{
				System.out.println("\nObese");
			}
		}
	}
	
	
	
	public static void main(String[] args)
	{
		
		java6 b = new java6();
		b.bmi();
		
		System.out.println("\nTirth Bharatiya\n-18DCS008");
		
	}
	
	
}