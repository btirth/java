import java.util.Scanner;
class Account{
	Scanner sc = new Scanner(System.in);
	int id;
	double balance;
	double annualInterestRate = 7;
	String date;
	Account(){
		id = 0;
		balance = 500;
	};
	Account(int i,double b){
		id = i;
		balance = b;
	}
	void set(int i,double b,double air){
		id = i;
		balance = b;
		annualInterestRate = air;
	}
	void Date(){
		System.out.print("Enter Date:");
		date = sc.nextLine();
		
	}
	
	void getMonthlyInterestRate(){
		System.out.println("\nAnnual Interest Rate: "+annualInterestRate/12+"%");
	}
	void getMonthlyInterest(){
		System.out.println("Annual Interest: "+(annualInterestRate/12)*balance);
	}
	void withdraw(){
		double wd;
		System.out.print("\nEnter Withdraw Amount: ");
		wd = sc.nextDouble();
		balance = balance-wd;
		System.out.println("Updated Balance: "+balance);
	}
	void deposit(){
		double ds;
		System.out.print("\nEnter Deposit Amount: ");
		ds = sc.nextDouble();
		balance = balance+ds;
		System.out.println("Updated Balance: "+balance);
	}
}

class java12{
	public static void main(String[] args){
		Account ac = new Account();
		ac.Date();
		ac.getMonthlyInterestRate();
		ac.getMonthlyInterest();
		ac.deposit();
		ac.withdraw();
		System.out.println("\n-Tirth Bharatiya\n18DCS008");
		
	}
}