import java.util.*;
interface Student{
	int s_id = 3;
	int s_class = 1;
	String s_name = "Xyz";
	void getValue();
}
interface Department{
	int attendance = 86;
	void getAttendance();
}
interface Exam extends Student,Department{
	boolean eligible(); 
}
class java20 implements Exam{
	Scanner sc = new Scanner(System.in);
	
	public void getValue(){
		System.out.println("ID: "+s_id);
		System.out.println("Name: "+s_name);
		System.out.println("Class: "+s_class);
	}
	public void getAttendance(){
		System.out.println("Attendance: "+attendance);
	}
	public boolean eligible(){
		if (attendance<75){
			return false;
		}
		else{
			return true;
		}
	}
	public static void main(String[] args){
		java20 j = new java20();
		j.getValue();
		j.getAttendance();
		boolean s_eligible = j.eligible();
		if (s_eligible==true){
			System.out.println("Eligible for Exam");
		}
		else{
			System.out.println("Not Eligible for Exam");
		}
		
		System.out.println("\n\nTirth Bharatiya\n18DCS008");
	}
}

