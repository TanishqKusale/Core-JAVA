package tester;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;

import runnable_tasks.StudentDobSorter;
import runnable_tasks.StudentSubjectSorter;

import static utils.StudentCollectionUtils.*;

public class TestCollectionIOThreads {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Student> map = populateMap(populateList());
			System.out.println("Enter filename for saving DoB based sorted details");
			// create a thread --by attaching a task
			Thread t1 = new Thread(new StudentDobSorter(map, sc.nextLine()), "dob_sorter");
			System.out.println("Enter filename for saving subject based sorted details");
			Thread t2 = new Thread(new StudentSubjectSorter(map, sc.nextLine()), "subject_sorter");
			//start the thrds
			t1.start();
			t2.start();
			System.out.println("waiting for child thrds....");
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
