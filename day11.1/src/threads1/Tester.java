package threads1;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());// Thread [main,5,main]
		// create 3 child thread to test concurrency
		MyThread t1 = new MyThread("one");
		MyThread t2 = new MyThread("two");
		MyThread t3 = new MyThread("three");
		// how many active (runnable) thrds ? 1
		t1.start();
		t2.start();
		t3.start();
		// how many active (runnable) thrds ? 4
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec counter " + i);
			Thread.sleep(1000);
		}
		System.out.println("main over....");

	}

}
