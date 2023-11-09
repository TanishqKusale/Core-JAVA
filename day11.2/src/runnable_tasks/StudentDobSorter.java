package runnable_tasks;

import java.util.Map;
import java.util.stream.Stream;

import com.app.core.Student;
import static java.lang.Thread.currentThread;
import static utils.IOUtils.storeStudentDetails;

public class StudentDobSorter implements Runnable {
	// state
	private Map<String, Student> students;
	private String fileName;

	// ctor to init state
	public StudentDobSorter(Map<String, Student> students, String fileName) {
		super();
		this.students = students;
		this.fileName = fileName;
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted");
		try {
			// map --> Collection --> stream --> sorted(comp)
			Stream<Student> sortedStrm = students.values()
					.stream()
					.sorted((s1, s2) -> s1.getDob().compareTo(s2.getDob()));
			storeStudentDetails(fileName, sortedStrm);
			System.out.println("student details sorted as per DoB n saved ");

		} catch (Exception e) {
			System.out.println("err in thread " + currentThread().getName() + " " + e);
		}
		System.out.println(currentThread().getName() + " over");

	}

}
