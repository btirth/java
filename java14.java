 
import java.util.Scanner;

abstract class Office
{
	int empNo;
	String empName;
	int salary;

	abstract void getData();
}

class Teaching extends Office
{
	String designation;

	void setData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employ number => ");
		empNo = sc.nextInt();

		System.out.print("Enter Employ name => ");
		empName = sc.next();

		System.out.print("Enter salary => ");
		salary = sc.nextInt();

		System.out.print("Enter designation => ");
		designation = sc.next();
	}

	void getData()
	{
		System.out.println("Employ name => " + empName + "\t\tEmploy number => " + empNo);
		System.out.println("Salary => " + salary + "\t\tDesignation => " + designation);
	}
}

class Non_teaching extends Office
{
	String designation;

	void setData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employ number => ");
		empNo = sc.nextInt();

		System.out.print("Enter Employ name => ");
		empName = sc.next();

		System.out.print("Enter salary => ");
		salary = sc.nextInt();

		System.out.print("Enter designation => ");
		designation = sc.next();
	}

	void getData()
	{
		System.out.println("Employ name => " + empName + "\t\tEmploy number => " + empNo);
		System.out.println("Salary => " + salary + "\t\tDesignation => " + designation);
	}
}

public class java14
{
	public static void main(String[] args)
	{
		Teaching t1 = new Teaching();
		Non_teaching nt1 = new Non_teaching();

		System.out.println("Data about Teaching class => \n");
		t1.setData();
		t1.getData();

		System.out.println("\n\nData about Non teaching class => \n");
		nt1.setData();
		nt1.getData();
		System.out.println("\n\nTirth Bharatiya\n18DCS008");
	}
}
