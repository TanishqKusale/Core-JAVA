package runnable_tasks;

import java.util.Map;
import java.util.stream.Stream;

import com.app.core.Student;
import static java.lang.Thread.currentThread;
import static utils.IOUtils.storeStudentDetails;

public class StudentSubjectSorter implements Runnable {
	// state
	private Map<String, Student> students;
	private String fileName;

	// ctor to init state
	public StudentSubjectSorter(Map<String, Student> students, String fileName) {
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
					.sorted((s1, s2) -> s1.getSubject().compareTo(s2.getSubject()));
			storeStudentDetails(fileName, sortedStrm);
			System.out.println("student details sorted as per Subject n saved ");

		} catch (Exception e) {
			System.out.println("err in thread " + currentThread().getName() + " " + e);
		}
		System.out.println(currentThread().getName() + " over");

	}

}
