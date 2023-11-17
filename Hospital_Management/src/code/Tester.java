package code;
import static code.HospitalUtils.*;
//import static code.HospitalUtils.populateList;
//import static code.HospitalUtils.singUp;
//import static code.HospitalUtils.sortSal;
//import static code.HospitalUtils.highestSalary;
//import static code.HospitalUtils.searchDept;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Tester {
	
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			
		List<Doctor> dList=populateList();
		dList=getFromFile("Doctor.ser");
		boolean exit=false;
		//dList.forEach(System.out::println);
		
		System.out.println("Enter login details\nID and Password");
		
		if (signIn(sc.next(), sc.next())) {
			
		do {
			try {
			System.out.println("1.Add Doctor\n2.Doctor having higest salary\n3.Sort(salary)\n4.Search(dept)\n5.Display all\n6.Exit");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter Doctor Details\n(docId,Doctor Name,Email,Degree, Joining_date,salary"
						+ ",Dept");
				Doctor d=singUp(sc.nextInt(), sc.next(), sc.next(), sc.next(),sc.next(), sc.nextDouble(), sc.next());
				dList.add(d);
				System.out.println("Added sucessfully");
				break;
			case 2:
				highestSalary(dList);
				break;
			case 3:
				sortSal(dList);
				break;
			case 4:
				System.out.println("Enter Department");
				searchDept(dList,sc.next());
				break;
			case 5:
				dList.forEach(System.out::println);
				break;
			case 6:
				System.out.println("Exited Sucessfully");
				storeInFile(dList,"Doctor.ser");
				exit=true;
				break;
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		}while(!exit);
			
			
		}else {
			System.out.println("Invalid Login Details");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
