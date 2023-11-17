package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedFileCopyFP2 {

	public static void main(String[] args) {
		System.out.println("Enter src n dest file names");
		try (Scanner sc = new Scanner(System.in);
				// Java App <---- BR <---- FR <---text file (src)
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
				// Java App --> PW ---> FW --> dest text file
				PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine()))) {
			br.lines()
			.filter(s -> s.contains("Day"))
			.map(String::toUpperCase) //s -> s.toUpperCase()
			.forEach(pw::println);//line -> pw.println(line)
			System.out.println("copy done !");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
