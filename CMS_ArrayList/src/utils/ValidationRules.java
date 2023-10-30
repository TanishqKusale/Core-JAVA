package utils;

import java.time.LocalDate;
import java.util.List;

import com.app.core.Customer;
import com.app.core.ServicePlan;

import custom_exceptions.InvalidInputException;

public class ValidationRules {
//add a method to parse n validate service plan
	public static ServicePlan parseAndValidatePlan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	// add a method to validate reg amount with the plan
	public static void validatePlanAmount(ServicePlan plan, double regAmount) throws InvalidInputException {
		if (plan.getPlanCost() != regAmount)
			throw new InvalidInputException("Reg amount doesn't match with the plan !!!!!");

	}

	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date);
	}

	// add a static method to validate email :
	// 1 well formed email : "[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)"
	// String : public boolean matches(String regEx)
	// 2 no dups pls !
	public static void validateEmail(String email, List<Customer> custList) throws InvalidInputException {
		// reg ex
		String pattern = "[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)";
		if (!email.matches(pattern))
			throw new InvalidInputException("Email invalid!!!!!!");
		// => valid email , now chk for dups
		// wrap PK (email) in Customer
		Customer c = new Customer(email);
		if (custList.contains(c))
			throw new InvalidInputException("Dup email !!!!");
	}
	public static void changePassword(String email,String ops,String nps,List<Customer>cs) throws InvalidInputException
	
	{
		Customer c=new Customer(email);
		int index=cs.indexOf(c);
		if(index<0)
			throw new InvalidInputException("Invalid emailid");
		Customer s=cs.get(index);
		if(!(s.getPassword().equals(ops)))
		{
			throw new InvalidInputException("Invalid Password");
		}
		s.setPassword(nps);
		System.out.println("Password updated successfully");
	}
	// add a method to call validation rules
	public static Customer validateAllInputs(String firstName, String lastName, String email, String password,
			double regAmount, String dob, String plan, List<Customer> customers) throws InvalidInputException {
		validateEmail(email, customers);
		ServicePlan validatedPlan = parseAndValidatePlan(plan);
		validatePlanAmount(validatedPlan, regAmount);
		LocalDate date = parseDate(dob);
		return new Customer(firstName, lastName, email, password, regAmount, date, validatedPlan);
	}

	// add a method for customer authentication
	public static Customer authenticateCustomer(String email, 
			String pass, List<Customer> customers)
			throws InvalidInputException {
		// check if customer exists by email
		int index = customers.indexOf(new Customer(email));
		if (index == -1)
			throw new InvalidInputException("Login failed : email invalid");
		// => email valid , get customer details
		Customer c = customers.get(index);
		// checkk password
		if (!c.getPassword().equals(pass))
			throw new InvalidInputException("Login failed : password invalid");
		return c;
	}

}
