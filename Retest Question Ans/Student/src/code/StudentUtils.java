package code;

import java.util.ArrayList;

public class StudentUtils {
	
	public static ArrayList<Student> populateList() {
		ArrayList<Student> al = new ArrayList<Student>();
		int a1[]= {99,98,100};
		int a2[]= {87,79,92};
		int a3[]= {80,88,95};
		int a4[]= {50,50,50};
		int a5[]= {67,76,85};
		
		al.add(new Student(1,"Ram",a1));
		al.add(new Student(2,"Sham",a2));
		al.add(new Student(3,"Gargi",a3));
		al.add(new Student(4,"Lopamudra",a4));
		al.add(new Student(5,"Maitreya",a5));
		
		return al;
	}

}
