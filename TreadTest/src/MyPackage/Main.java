package MyPackage;

public class Main {
	public static void main(String[] args) {
		Object lockobj1 = new Object();
		Object lockobj2 = new Object();
		TestThread1 thread1 = new TestThread1(lockobj1, lockobj2);
		thread1.start();

		TestThread2 thread2 = new TestThread2(lockobj1, lockobj2);
		thread2.start();
	}
}
