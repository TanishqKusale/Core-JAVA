package util;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import code.Customer;
import code.Plan;
import exceptions.DuplicateCustomer;

public class CustomerMethods {

	public static List<Customer> cList(){
		
		List<Customer> list=new ArrayList<>();
		//int id, String fName, String lName, String email, String password, String address,
		//	String rDate,String phoneNo, 
			//String pl, double finalAmount
	
		list.add(new Customer(01,"Satej","Ambekar","user0.dac@iacsd.com","123456","Kolhapur","2023-11-04",LocalDate.parse("2024-11-04"),"45495656481","Yearly",32000));
		list.add(new Customer(02,"Vaibhav","Deshmane","user1.dac@iacsd.com","123456","Latur","2023-01-15",LocalDate.parse("2024-11-15"),"45495656481","MONTHLY",3000));
		list.add(new Customer(03,"Tanishq","Kusale","user2.dac@iacsd.com","123456","Kolhapur","2023-11-04",LocalDate.parse("2024-11-04"),"45495656481","Yearly",32000));
		list.add(new Customer(04,"Apeksha","Jagtap","user3.dac@iacsd.com","123456","Nagar","2023-01-04",LocalDate.parse("2024-02-04"),"45495656481","QUARTERLY",11700));
		
		return list;
	}
	
		public static Map<Integer, Customer> PopcMap(List<Customer> list){
		
		//HashMap <Integer,Customer> map= new HashMap<>();
				
		return list.stream().collect(Collectors.toMap(Customer::getId, s->s));
			
				
	}
		public static void signIn(String email,String password,Map<Integer,Customer> m)throws DuplicateCustomer {
			
//			List<Customer> s= new ArrayList<>();
//			s=m.values().stream().collect(Collectors.toList());
			Customer c=new Customer(email);
//			int index=s.indexOf(c);
			
			
//			if(index<0) {
//			
//			System.out.println(c.getEmail());
//				throw new DuplicateCustomer("Invalid Email");
//			}
//			
//			Customer sk =s.get(index);
//					
//			if (!(sk.getPassword().equals(password))) {
//						throw new DuplicateCustomer("Invalid Password");}
//			else {		
//					System.out.println("Signed in Successfully");
//					System.out.println(sk);
//				}			
			if(m.containsValue(c)) {
				
				for(Customer s:m.values()) {
					
					if(s.equals(c)) {
						
						if(s.getPassword().equals(password)) {
							System.out.println("Signed In Sucessfully");
							System.out.println(s);}
						else {
						throw new DuplicateCustomer("Invalid Password");}
					}else {}
				}
			}else{throw new DuplicateCustomer("Invalid Email");}
			
		}
		
		public static void liveInAkurdi(Map<Integer,Customer> mp) {
			
		}
		
		public static void regInJan(Map<Integer,Customer> mp) {
			
			for (Customer c:mp.values()) {
				
			int month=c.getRegisterDate().getMonth().getValue();
//			System.out.println(month);
			if(month==1) {
				System.out.println(c.getEmail());
			}
		}
		}
		
		public static void count(Map<Integer,Customer> mp, String plan) {
			int cu=0;
			for(Customer c:mp.values()) {
				
				if(c.getPl().equals(Plan.valueOf(plan.toUpperCase()))) {
					cu++;
				}
			}
			System.out.println("Number of people having Yearly plan : "+cu);
		}
		
		public static void setFname(Map<Integer,Customer>mp) {
			
			for(Customer c:mp.values()) {
				c.setfName(c.getfName().substring(0).toUpperCase());
			}
		}
		
		public static void updatePassword(String email,String oPass,String nPass,Map<Integer,Customer> pm) throws DuplicateCustomer{
			
			Customer c=new Customer(email);
			
			if(!(pm.containsValue(c))) {
			
				throw new DuplicateCustomer("Invalid Email id");
			}
			for (Customer s:pm.values()) {
				
				if (s.equals(c)) {
					if(s.getPassword().equals(oPass)) {
						s.setPassword(nPass);
						System.out.println("PassWord Updated");
					}else {
						throw new DuplicateCustomer("Invalid Password");
					}
				}
			}
		}
	
	 
}
