package java_prgms;
import java.util.*;

public class Student_data {



	 
	String name;
	String city;
	int age;
	
	
	
	void addData() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the name of the student: ");
		 name=s.nextLine();
		System.out.println("Enter the city of the student: ");
		 city=s.nextLine();
		System.out.println("Enter the age of the student: ");
		 age=s.nextInt();
	}
	
	
	void PrintData() {
		System.out.println("name of the student is:"+name);
		System.out.println("city of the student is: "+city);
		System.out.println("age of the student is: "+ age);
	}
	
	
	

	public static void main(String[]args) {
	
		
		Student_data s1=new Student_data();
		Student_data s2=new Student_data();
		
		s1.addData();
		s1.PrintData();
		
		s2.addData();
		s2.PrintData();
		
	}
		
	
	
}


