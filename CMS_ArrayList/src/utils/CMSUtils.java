package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Customer;
import com.app.core.ServicePlan;

public class CMSUtils {
//add a static method to populate customer list
	public static List<Customer> populateCustomerList() {
		/*
		 * String firstName, String lastName, String email, String password, double
		 * regAmount, LocalDate dob, ServicePlan plan
		 */
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Tanishq", "Kusale", "tanishqkusale10@gmail.com", "Tanishq#123", 2000, LocalDate.parse("2001-05-09"),
				ServicePlan.GOLD));
		customers.add(new Customer("Satej", "Ambekar", "ambekarsatej@gmail.com", "satej#123", 1000, LocalDate.parse("2000-12-26"),
				ServicePlan.SILVER));
		customers.add(new Customer("Vaibhav", "Deshmane", "vaibhavdeshmane@gmail.com", "vai#123", 2000, LocalDate.parse("2001-11-21"),
				ServicePlan.GOLD));
		
		return customers;
	}
}
