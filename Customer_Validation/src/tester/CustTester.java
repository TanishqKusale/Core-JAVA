package tester;
import code.*;
import exception.*;
import java.util.Scanner;

public class CustTester {

	public static void main (String[] args) {
		
		try(Scanner sc=new Scanner(System.in);){
		//customer id(int) ,first name, last name (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
//		System.out.println("----Enter Your Details----\nFirst name, last name ,email ,password,registrationAmount,dob(yyyy-mm-dd),plan");
//		Customer c1=ValidationRules.validateAllInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
//		System.out.println(c1);
//		Customer c2=new Customer("Sam","Man","sam@gmail.com","afsgajs",10000,"2000-12-26","silver");
//		System.out.println(c2);
		
Customer [] carr=new Customer[10];
		int ch=0,index=0;
		do{
			
			System.out.println("1.Display Customers\n2.Add Customer\n3.Delete Customer\n4.Exit");
			ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				
				for(Customer c:carr) {
					if(c!=null) {
					System.out.println(c);
				}else {
					System.out.println("No Customers in list");
					break;
				}
				}break;
				
			case 2:
				System.out.println("----Enter Your Details----\nFirst name, last name ,email ,password,registrationAmount,dob(yyyy-mm-dd),plan");
				Customer c=ValidationRules.validateAllInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
				carr[index]=c;
				index++;
				break;
			case 3:
				System.out.println("Enter Customer ID to be deleted");
				int d=sc.nextInt();
				carr[d-1]=null;
				System.out.println("Deleted");
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid Input");
			}			
		}while(ch!=4);
	
		
	}catch(Exception e){
		System.out.println(e);
	}

	
}
}
	

