package validations;

import java.time.LocalDate;
import java.util.Map;

import code.Customer;
import code.Plan;
import exceptions.DuplicateCustomer;

public class Validation_rules{
	
	public static void duplicateCustomer(Map<Integer,Customer> cMap,int id)throws DuplicateCustomer {
		
		Customer d= new Customer(id);
		
		if (cMap.containsKey(d)) {
			throw new DuplicateCustomer("Customer Already Exists");
		}

	}
	
	
	
	public static Plan validatePlan(String plan) throws IllegalArgumentException{
		
		return Plan.valueOf(plan);
	}

	public static void regAmtPlan(Plan plan,double price)throws IllegalArgumentException{
		
		if (plan.getPrice()!=price) {
			throw new IllegalArgumentException("Enter valid Plan Amount");
		}
	}
	
	public static void emailVerification(Map<Integer,Customer> eMap,String em)throws DuplicateCustomer 
	{
		String reg="[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
		
		if (!(em.matches(reg))) {
			throw new DuplicateCustomer("Invalid Email id");
		}
		
		Customer cs=new Customer(em);
		
		if (eMap.containsKey(cs)) {
			throw new DuplicateCustomer("Email id already exits");
		}
		
		
	}
	
	public static void signIn(Map<Integer,Customer> eMap,String em,String pass)throws DuplicateCustomer{
		
		Customer s=new Customer(em);
		
		if (!(eMap.containsKey(s))) {
			throw new DuplicateCustomer("Invalid Email id");
		}
		
		Customer d=eMap.get(s);
		if (!(d.getPassword().equals(pass))) {
			throw new DuplicateCustomer("Invalid Password");
		}
		System.out.println("Signed in Sucessfully");
		System.out.println(s);
	}
	
	public static LocalDate parsePlanDate(Plan pl,LocalDate regDate)throws IllegalArgumentException
	{
		LocalDate rd=regDate;
		LocalDate pd=LocalDate.now();
		
		if (rd.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("Enter vaild registration date");
		}
		if (pl==Plan.MONTHLY ) {
			
			pd=rd.plusMonths(1);
		}
		else if (pl==Plan.QUARTERLY) {
			pd=rd.plusMonths(3);
		}
		else if (pl==Plan.HALFYEAR) {
			pd=rd.plusMonths(6);
		}
		else if (pl==Plan.YEARLY) {
			pd=rd.plusMonths(12);
		}
		return pd;
		
	}
		
	public static Customer signUp (int id, String fName, String lName, String email, String password, String address,
			String rDate,String phoneNo, 
			String pl, double finalAmount,Map<Integer,Customer> aMap) throws DuplicateCustomer {
		
		duplicateCustomer(aMap,id);
		emailVerification(aMap,email);
		LocalDate endplan=parsePlanDate(Plan.valueOf(pl),LocalDate.parse(rDate));
		validatePlan(pl);
		regAmtPlan(Plan.valueOf(pl),finalAmount);
		
		return new Customer(id,fName,lName,email,password,address,rDate,endplan,phoneNo, pl,finalAmount);
	}
	

}
