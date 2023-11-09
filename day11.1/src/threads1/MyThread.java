package threads1;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);// NEW
	}

	@Override
	public void run() /* throws InterruptedException */ {
		System.out.println(getName() + " strted");
		// B.L : delay loop
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + " exec counter " + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(getName() + " got exc " + e);
		}
		System.out.println(getName() + " over...");
	}
}
