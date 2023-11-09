package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import com.app.core.Student;

public interface IOUtils {
//add a static method to store sorted stream of students in a text file using buffer
	static void storeStudentDetails(String fileName, Stream<Student> studentStream) throws IOException {
		// Java App ---> PW --> FW --> text file
		try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
			studentStream.forEach(pw::println);
		}
	}
}
