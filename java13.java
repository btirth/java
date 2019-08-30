import java.lang.*;
import java.util.*;

class Account
{
	String id;
	int balance;

	Account(String i)
	{
		id = i;
		balance = 300;
	}

	void BalanceInq()
	{
		System.out.println("ID :- " + id);
		System.out.println("Balance :- " + balance);
	}

	void withdraw()
	{
		int temp;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter amount to withdraw :- ");
		temp = sc.nextInt();

		if(balance - temp < 300)
			System.out.println("Minimum 300 balance is needed");
		else
		{
			balance = balance - temp;
			System.out.println("Current balance :- " + balance);
		}
	}

	void deposit()
	{
		int temp;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter amount to deposite :- ");
		temp = sc.nextInt();

		balance = balance + temp;

		System.out.println("Current balance :- " + balance);
	}

	void moneyTransfer(ArrayList ar)
	{
		int temp;
		String id;
		Scanner sc = new Scanner(System.in);
		Account ac = null;

		System.out.print("Enter ID to transfer :- ");
		id = sc.next();

		Iterator itr = ar.iterator();
		while(itr.hasNext())
		{
			Account a = (Account) itr.next();

			if(id.equals(a.id))
				ac = a;
				
		}
		
		if(ac == null)
			System.out.println("Account not found");
		else
		{ 
			System.out.print("Enter amount to transfer :- ");
			temp = sc.nextInt();

			if(temp > balance)
				System.out.println("Not enough balane to transfer");
			else
			{
				ac.balance = ac.balance + temp;
				balance = balance - temp;
			}
		}
	}

	void Create(ArrayList arr)
	{
		String str;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ID :- ");
		str = sc.next();

		Account ac = new Account(str);
		arr.add(ac);
	}
	
	void delete(ArrayList arr)
	{
		String str;
		Scanner sc = new Scanner(System.in);
		Account ac = null;

		System.out.print("Enter ID :- ");
		str = sc.next();

		Iterator itr = arr.iterator();
		while(itr.hasNext())
		{
			Account a = (Account) itr.next();
			if(str.equals(a.id))
				ac = a;			
		}
	
		if(ac == null)
			System.out.println("Account not found");
		else
		{
			arr.remove(ac);
			System.out.println("Account removed successfully");
		}
	}
}

public class java13
{
	public static void main(String[] args)
	{
		ArrayList<Account> arr = new ArrayList<Account>();
		Scanner sc = new Scanner(System.in);
		String str;
		int op;
		Account ac = null;
		Account a = new Account(null);

		arr.add(new Account("AC001"));
		arr.add(new Account("AC002"));
		arr.add(new Account("AC003"));
		arr.add(new Account("AC004"));
		arr.add(new Account("AC005"));
		arr.add(new Account("AC006"));
		arr.add(new Account("AC007"));
		arr.add(new Account("AC008"));
		arr.add(new Account("AC009"));
		arr.add(new Account("AC010"));

		System.out.print("Enter your ID :- ");
		str = sc.next();

		Iterator itr = arr.iterator();
		while(itr.hasNext())
		{
			a = (Account) itr.next();
			if(str.equals(a.id))
				ac = a;
		}

		if(ac == null)
		{
			System.out.println("Invalid ID");
			System.exit(0);
		}
		else
		{

			do
			{
				System.out.println("Press 1 - for Balance Inquiry");
				System.out.println("Press 2 - for Withdraw");
				System.out.println("Press 3 - for Deposit");
				System.out.println("Press 4 - for Money Transfer");
				System.out.println("Press 5 - for Create Account");
				System.out.println("Press 6 - for Remove Account");
				System.out.println("Press 0 - for Exit");
		
				System.out.print("Enter your choice => ");
				op = sc.nextInt();
		
				switch(op)
				{
					case 1:
						ac.BalanceInq();
						break;
					case 2:
						ac.withdraw();
						break;
					case 3:
						ac.deposit();
						break;
					case 4:
						ac.moneyTransfer(arr);
						break;
					case 5:
						ac.Create(arr);
						break;
					case 6:
						ac.delete(arr);
						break;
					case 0:
						System.out.println("Thank you");
						break;
					default:
						System.out.println("Invalid input");
				}
			}while(op != 0);
		}
                     System.out.println("\n\nTirth Bharatiya\n18DCS008");
	}
}
