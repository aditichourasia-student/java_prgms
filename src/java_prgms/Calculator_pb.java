package java_prgms;
import java.util.*;


public class Calculator_pb {

	public Calculator_pb() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter a : ");
		
		int a=sc.nextInt();
		System.out.println("Enter b : ");
		int b=sc.nextInt();
		
		System.out.println("Enter your choice (1-5): ");
		int n=sc.nextInt();
		
		switch(n) {
			case 1 : System.out.println("Addition = " + (a+b));
			break;
			case 2 : System.out.println("Subtraction =" + (a-b));
			break;
			case 3 : System.out.println("Multiplication = " + (a*b));
			break;
			case 4 : System.out.println("Division = " +(a/b));
			break;
			case 5 : System.out.println("Remainder or Modulo =" +(a%b));
			break;
			default : System.out.println("Enter valid number");
			
			
		}
		sc.close();
		}

}
