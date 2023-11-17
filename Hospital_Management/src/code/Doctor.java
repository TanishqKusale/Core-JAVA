package code;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Doctor implements Serializable{
	
	int DocId;
	String Dname;
	String email;
	String Degree;
	LocalDate joining_date;
	double salary;
	int experience;
	Department dept;
	
	
	public Doctor(int docId, String dname, String email, String degree, String joining_date, double salary,
			int experience, String dept) {
		super();
		DocId = docId;
		Dname = dname;
		this.email = email;
		Degree = degree;
		this.joining_date = LocalDate.parse(joining_date);
		this.salary = salary;
		this.experience = experience;
		this.dept = Department.valueOf(dept.toUpperCase());
	}


	public double getSalary() {
		return salary;
	}
	
	

	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "----Doctor Details---- \nDocId= " + DocId + "\nDname= " + Dname + "\nemail= " + email + "\nDegree= " + Degree
				+ "\njoining_date= " + joining_date + "\nsalary= " + salary + "\nexperience= " + experience + "\ndept= "
				+ dept;
	}
	
	
	
	
	
}
