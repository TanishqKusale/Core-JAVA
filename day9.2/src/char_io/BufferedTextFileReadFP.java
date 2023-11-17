package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedTextFileReadFP {

	public static void main(String[] args) {
		System.out.println("Enter file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <--- BR <---- FR <--- src text file
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			System.out.println("File data");
			//declarative style : FP , only WHAT : has to be supplied
			br.lines() //Stream<String> => lines from the buffer
			 .forEach(System.out::println);//s -> sop(s)
			System.out.println("data read over....");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
