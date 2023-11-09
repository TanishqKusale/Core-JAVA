package threads5;

import java.util.stream.IntStream;

public class AveragerTask implements Runnable {
	// state
	private int begin;
	private int end;

	public AveragerTask(int begin, int end) {
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
			double avg = IntStream.rangeClosed(begin, end)
					.average()
					.orElseThrow();
			System.out.println("Avg of nos int the range " + begin + "-" + end + " " + avg);
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
