package MyPackage2;

public class ThreadTest {
	public static void main(String[] args) {
		Object shareobj = new Object();
		TestThread_Wait thread1 = new TestThread_Wait(shareobj);
		thread1.start();

		TestThread_Notify thread3 = new TestThread_Notify(shareobj);
		thread3.start();
	}

}