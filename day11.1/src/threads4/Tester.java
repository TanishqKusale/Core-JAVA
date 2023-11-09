package threads4;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());// Thread [main,5,main]
		//create runnable task instance
		MyRunnableTask task=new MyRunnableTask();
		Thread t1=new Thread(task, "one");
		Thread t2=new Thread(task, "two");
		Thread t3=new Thread(task, "three");
		// how many active (runnable) thrds ? 1
		t1.start();
		t2.start();
		t3.start();
		// how many active (runnable) thrds ? 4
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec counter " + i);
			Thread.sleep(200);
		}
		System.out.println("main waiting for child thrds to complete exec");
		System.out.println(t1.isAlive()+" "+t2.isAlive()+" "+t3.isAlive());
		t1.join();//main : Blocked on join  for t1
		t2.join();//main : Blocked on join  for t2
		t3.join();//main : Blocked on join  for t3
		System.out.println(t1.isAlive()+" "+t2.isAlive()+" "+t3.isAlive());		
		System.out.println("main over....");

	}

}
