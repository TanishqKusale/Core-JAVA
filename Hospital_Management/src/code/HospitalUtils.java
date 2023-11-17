package code;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HospitalUtils {

	public static void parseDateOfJoining(String date) throws CustomHandlingException{
		
		if (LocalDate.parse(date).isBefore(LocalDate.parse("2001-05-10"))) {
			throw new CustomHandlingException ("Invalid Date of joining");
		}
	}
	
	public static boolean signIn (String id,String pass) throws CustomHandlingException{
		
		if (id.equals("admin") && pass.equals("admin")) {
			System.out.println("Logged in sucessfully");
			return true;
		}
		throw new CustomHandlingException ("Invalid login details");
 	}
	
	public static List populateList() {
		
		List<Doctor> dList=new ArrayList<>();
		//int docId, String dname, String email, String degree, LocalDate joining_date, double salary,int experience, String dept
		//ORTHO,PEDIATRICS,PHYSIIOTHEROPY,GASTROLOGY
		dList.add(new Doctor(01, "Satej", "Satej@gmail.com", "MS", "2002-05-10", 100000,expCalc("2002-05-10"), "Ortho"));
		dList.add(new Doctor(02, "Tanishq", "Tanishq@gmail.com", "MBBS", "2002-05-10", 90000,expCalc("2002-05-10"), "PEDIATRICS"));
		dList.add(new Doctor(03, "Vaibhav", "Vaibhav@gmail.com", "BHMS", "2002-05-10", 80000,expCalc("2002-05-10"), "PHYSIIOTHEROPY"));
		dList.add(new Doctor(04, "Aditya", "Aditya@gmail.com", "BAMS", "2002-05-10", 70000,expCalc("2002-05-10"), "GASTROLOGY"));
		
		
		return dList;
		
	}
	static Comparator<Doctor> comp= (d1,d2)-> {
		if (d1.getSalary()>d2.getSalary()) {
			return 1;
		}
		if(d1.getSalary()==d2.getSalary()) {
			return 0;
		}
		return-1;
	};
	public static void sortSal(List<Doctor> doc) {
	
		doc.sort(comp);
		System.out.println(doc);
	}
	
	public static void searchDept(List<Doctor> doc,String dept) {
		
		for (Doctor d:doc) {
			
			if(d.getDept()==Department.valueOf(dept.toUpperCase())) {
				System.out.println(d);
			}
		}
	}
	
	public static void highestSalary(List<Doctor> doc) {
		doc.sort(comp);
		int index = (doc.size()-1);
		System.out.println(doc.get(index));
	}
	
	public static int expCalc(String jDate) {
		
		return Period.between(LocalDate.parse(jDate), LocalDate.now()).getYears();
		
	}
	
	public static void storeInFile(List<Doctor> list,String Fname) throws FileNotFoundException, IOException {
		
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(Fname));
		o.writeObject(list);
	}
	
	public static List<Doctor> getFromFile(String fName) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream(fName));
		List<Doctor> d= (List<Doctor>) oi.readObject();
		return d;
	}
	
	public static Doctor singUp(int docId, String dname, String email, String degree, String joining_date, double salary,
			 String dept)throws CustomHandlingException
	{
	
		parseDateOfJoining(joining_date);
		int exp=expCalc(joining_date);
		return new Doctor(docId,dname,email,degree,joining_date,salary,exp,dept);
	}
	
}
