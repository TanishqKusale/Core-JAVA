package code;

import java.time.LocalDate;

public class Customer {

	private static int id;
	private String first_name;
	private String last_name;
	public static int getId() {
		return id;
	}



	public static void setId(int id) {
		Customer.id = id;
	}



	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public double getRegistrationAmount() {
		return registrationAmount;
	}



	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public ServicePlan getPlan() {
		return plan;
	}



	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}
	private int id1;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	ServicePlan plan;

	static {
		id=1;
	}

	public Customer(String first_name, String last_name, String email, String password,
			double registrationAmount, String dob, String plan) {
		super();
	
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = LocalDate.parse(dob);
		this.plan = ServicePlan.valueOf(plan.toUpperCase());
		this.id1=id;
		id++;
	}
	
	
	
	@Override
	public String toString() {
		return "----Customer Details----\nid=" + id1 + "\nFirst_Name=" + first_name + "\nLast_Name=" + last_name + "\nEmail=" + email
				+ "\nRegistration Amount=" + registrationAmount + "\nDate of Birth=" + dob + "\nPlan="
				+ plan;
	}
	@Override
	public boolean equals(Object o) {
		if (o instanceof Customer) {
			return this.email.equals(((Customer)o).email);
		}
		return false;
	}
	
}
