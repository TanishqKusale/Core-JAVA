package code;

import java.time.LocalDate;

public class Customer {
	
	private int id;
	private String fName;
	private String lName;
	private String email;
	private String password;
	private String address;
	private LocalDate RegisterDate;
	private LocalDate planEndDate;
	private String phoneNo;
	private Plan pl;
	private double finalAmount;
	
	public Customer(int id, String fName, String lName, String email, String password, String address,
			String registerDate,LocalDate planEndDate, String phoneNo, String pl, double finalAmount) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.RegisterDate = LocalDate.parse(registerDate);
		this.planEndDate = planEndDate;
		this.phoneNo = phoneNo;
		this.pl =Plan.valueOf(pl.toUpperCase());
		this.finalAmount = finalAmount;
	}
	
	public Customer (int id2) {
		this.id=id2;
	}
	
	public Customer (String em) {
		this.email=em;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getRegisterDate() {
		return RegisterDate;
	}

	public void setRegisterDate(LocalDate registerDate) {
		RegisterDate = registerDate;
	}

	public LocalDate getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Plan getPl() {
		return pl;
	}

	public void setPl(Plan pl) {
		this.pl = pl;
	}

	public double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}

	@Override
	public String toString() {
		return "----Customer_Details---- \nId= " + id + "\nFirst Name= " + fName + "\nLast Name= " + lName + "\nEmail= " + email + "\nAddress= "
				+ address + "\nRegisterDate= " + RegisterDate + "\nPlanEndDate=" + planEndDate + "\nPhoneNo=" + phoneNo
				+ "\nPlan= " + pl + "\nFinalAmount=" + finalAmount ;
	}
	
	@Override
	public boolean equals(Object c) {
		
		if(c instanceof Customer) {
		
			return this.email.equals(((Customer)c).getEmail());
		}
		return false;
	}
	
	
	

}
