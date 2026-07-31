package java_prgms;
import java.util.*;
public class Employee {

	
		int empId;
		String empName;
		
		
		Scanner sc=new Scanner(System.in);
		
		public Employee() {
		}
		//Method
		
		void addData() {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the name of the employee: ");
			 empName=sc.nextLine();
			System.out.println("Enter the id of the employee: ");
			 empId=sc.nextInt();
			 
		}

		public void showDetails() {
			System.out.println("Employee name is : " + empName);
			System.out.println("Employee ID is: " + empId);
			}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
	
		
		e1.addData();
		e1.showDetails();
		e2.addData();
		e2.showDetails();
	  
	e1.sc.close();
	e2.sc.close();
  }
}