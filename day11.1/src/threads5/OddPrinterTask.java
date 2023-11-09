package threads5;

import java.util.stream.IntStream;

public class OddPrinterTask implements Runnable {
	// state
	private int begin;
	private int end;

	public OddPrinterTask(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
		System.out.println("in ctor of " + getClass() + " invoked by " + Thread.currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			// even nos
			IntStream.rangeClosed(begin, end)
			.filter(i -> i % 2 != 0)
			.forEach(i -> System.out.println(Thread.currentThread().getName() + " printed " + i));
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
