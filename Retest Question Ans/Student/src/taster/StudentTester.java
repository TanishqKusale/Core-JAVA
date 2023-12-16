package taster;

import java.util.ArrayList;
import java.util.Scanner;
import static code.StudentUtils.populateList;
import code.Student;

public class StudentTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Student> studList = populateList();//new ArrayList<Student>();//populateList();//
			int choice;
			do {
				System.out.println("Enter choice : \n" + "1: Accept Student :\n" + "2: Display Student :\n" + "3: Exit");
				choice = sc.nextInt();
			
				switch (choice) {
				case 1:
					System.out.println("Enter Student Details :");
					System.out.println("Enter Roll no :");
					int rollNo = sc.nextInt();
					System.out.print("Enter Name :");
					String name = sc.next();
					System.out.println("Enter Mark 1 :");
					int m1 = sc.nextInt();
					System.out.println("Enter Mark 2 :");
					int m2 = sc.nextInt();
					System.out.println("Enter Mark 3 :");
					int m3 = sc.nextInt();
					int arr[] = {m1,m2,m3};
					Student s1 = new Student(rollNo, name,arr);
					studList.add(s1);
					System.out.println("Student Added Successfully..!");
					break;
				case 2:
					for(Student s : studList) {
						System.out.println(s);
					}
					break;
				case 0: choice = 0;

					break;

				default:System.out.println("Please Enter Valid Choice");
					break;
				}

			} while (choice != 0);
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
