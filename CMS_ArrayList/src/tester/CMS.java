package tester;

import java.util.List;
import java.util.Scanner;

import com.app.core.Customer;

import utils.ValidationRules;

import static utils.CMSUtils.populateCustomerList;
import static utils.ValidationRules.*;

public class CMS {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init
			// get the populated AL from utils
			List<Customer> customerList = populateCustomerList();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options 1.Sign Up 2. Sign In 3. Display all 4. Change Password 5. Un subscribe 0. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter customer details \nfirstName,lastName,email,password,regAmount,dob,plan");
					
						Customer newCust = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), customerList);
						customerList.add(newCust);
						System.out.println("customer signed up !");
						break;
					case 2:
						System.out.println("Enter email n password for sign in");
						newCust = authenticateCustomer(sc.next(), sc.next(), customerList);
						System.out.println("Succeful Login , your details : "+newCust);
						break;
					case 3:
						for(Customer c :customerList)
						{
							System.out.println(c);
						}
						
						break;
					case 4:
						
						System.out.println("Enter email,old password,new password");
						ValidationRules.changePassword(sc.next(), sc.next(), sc.next(), customerList);
					break;
					
					case 5:
						System.out.print("Enter customer email to unsubscribe: ");
	                    String unsubscribeEmail = sc.next();

	                    for (Customer customer : customerList) {
	                        if (customer.getEmail().equals(unsubscribeEmail)) {
	                            customerList.remove(customer);
	                            System.out.println("Customer unsubscribed successfully."+customer);
	                           
	                        }
	                    }
	                    break;
					
					case 0:
						exit = true;
						break;
					
					}
				} catch (Exception e) {
					// to read off the pending i/ps from scanner
					sc.nextLine();
					System.out.println(e);
				}
			}

		}

	}

}
