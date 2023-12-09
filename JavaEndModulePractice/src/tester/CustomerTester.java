
package tester;

//import static util.CustomerMethods.PopcMap;
//import static util.CustomerMethods.cList;
//import static util.CustomerMethods.signIn;
//import static util.CustomerMethods.updatePassword;
//import static util.CustomerMethods.setFname;
import static validations.Validation_rules.signUp;
import static util.CustomerMethods.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import code.Customer;
import exceptions.DuplicateCustomer;

public class CustomerTester {
	
	public static void main(String[] args) {
		
		boolean exit=true;
		
		List <Customer> lis= new ArrayList<>();
		lis=cList();
		//lis.forEach(System.out::println);
		Map<Integer,Customer> cMap=new HashMap<>();
		cMap=PopcMap(lis);
		//cMap.values().stream().forEach(System.out::println);
//		for (Customer c:cMap.values()) {
//			System.out.println(c);
//		}
		
		
		do{
			Scanner sc=new Scanner(System.in); 
				System.out.println("1.Sign Up\n2.Sign in\n3.Display All Customers\n4.Change Password\n"
						+ "5.Sort as per First name\n6.Sort as per Plan\n"
						+ "7.Sort as per Reg Date\n8.Modify all customers first name\n"
						+ "9.Display email addresses of the customers who did registration in month of January\n"
						+ "10.Display count of the Customers who have register for plan: Monthly\n"
						+ "11.Search the Customer who lived in Akurdi\n"
						+ "12.Give the 20% discount to the customers who have selected plan for 1 year");
				 		int ch=sc.nextInt();
			switch (ch) {
			
			case 1:
//				int id, String fName, String lName, String email, String password, String address,
//				String registerDate,LocalDate planEndDate, String phoneNo, String pl, double finalAmount)
				System.out.println("Enter Customer Details\n(id,FirstName,LastNAme,Email,Password,Address,RegDate,PhoneNo,Plan,Amount)");
				int id=sc.nextInt();
				Customer cd;
				try {
				cd = signUp(id,sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),cMap);
				
				cMap.put(id, cd);}catch(Exception e) {};
				
			//	System.out.println(cd);
				
//				cMap.values().stream().collect(Collectors.toMap(Customer::getId, s->((new Customer(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),null,sc.next(),sc.next(),sc.nextDouble())))));
				System.out.println("Added Successfully");
				break;
			case 2:
				System.out.println("Enter Email and Password");
				try{signIn(sc.next(), sc.next(), cMap);}catch(Exception e) {e.printStackTrace();}
				break;
			case 3:
				cMap.values().stream().forEach(c->System.out.println(c));
				break;
			case 4:
				System.out.println("Enter Email, Password, OldPassword");
				try{updatePassword(sc.next(),sc.next(),sc.next(),cMap);}catch(Exception e) {e.printStackTrace();}
				break;
			case 5:
				System.out.println("Sort as per First name");
				Comparator<Customer> comp= (c1,c2)->c1.getfName().compareTo(c2.getfName());
				
				cMap.values().stream()
				.sorted(comp).forEach(System.out::println);
				break;
			case 6:
				System.out.println("Sort as per Plan");
				Comparator<Customer> com= (c1,c2)->c1.getPl().compareTo(c2.getPl());
				
				cMap.values().stream()
				.sorted(com).forEach(System.out::println);
				break;
			case 7:
				System.out.println("Sort as per Reg Date");
				Comparator<Customer> co=(c1,c2)->c1.getRegisterDate().compareTo(c2.getRegisterDate());
				cMap.values().stream().sorted(co).forEach(System.out::println);
				break;
			case 8:
				setFname(cMap);
				System.out.println("First Name Updated");
				break;
			case 9:
				System.out.println("Registered in January");
				regInJan(cMap);
				break;
			case 10:
				System.out.println("Enter Department to see count");
				count(cMap,sc.next());
				break;
			case 11:
				
			}
			
//			}catch(Exception e) {
////				e.printStackTrace();
//			}
		
		}while (exit);
		
		
	
	}

}
