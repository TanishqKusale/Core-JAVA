package threads5;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter range : begin end ");
			int begin = sc.nextInt();
			int end = sc.nextInt();
			// create tasks n attach it to the thread n start the thrds
			Thread t1 = new Thread(new EvenPrinterTask(begin, end), "even");
			Thread t2 = new Thread(new OddPrinterTask(begin, end), "odd");
			Thread t3 = new Thread(new AveragerTask(begin, end), "avger");
			//runnable : 1
			t1.start();
			t2.start();
			t3.start(); //runnable : 4
			System.out.println("main waiting for child thrds to finish exec");
			t1.join();
			t2.join();
			t3.join();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
