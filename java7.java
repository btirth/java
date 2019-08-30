import java.util.Random;
import java.util.Scanner;

class java7{
	public static void main(String[] args){
		int Lottery,number;
		
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		Lottery = rm.nextInt(100);
		
		System.out.println("Enter Your Lottery Number");
		number = sc.nextInt();
		
		if(Lottery==number){
			System.out.println("You won $10,000");
		}
		else{
			int l1,l2,n1,n2,cnt=0;
			l1 = Lottery%10;
			Lottery = Lottery/10;
			l2 = Lottery%10;
			n1=number%10;
			number = number/10;
			n2 = number%10;
			
			if(l1==n1 || l1==n2){
				cnt++;
			}
			if(l2==n1 || l2==n2){
				cnt++;
			}
			if(n1==n2){
				cnt--;
			}
			
			if(cnt==0){
				System.out.println("Sorry!!");	
			}
			else if(cnt==1){
				System.out.println("You won $1000");
			}
			else if(cnt==2){
				System.out.println("You won $3000");
			}	
		}
		System.out.println("\n18DCS008\n-Tirth Bharatiya");
	} 
}