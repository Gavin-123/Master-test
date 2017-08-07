package MyPackage;


public class ThreadTest {

	public static void main(String[] args) {
		Object shareobj = new Object();
		TestThread_Locked thread1 = new TestThread_Locked(shareobj);
		thread1.start(); // 启动第一个线程 8
		// 1 JAVA线程堆栈分析

		TestThread_WaitingTo thread2 = new TestThread_WaitingTo(shareobj);
		thread2.start(); // 启动第二个线程 11

		TestThread_WaitingOn thread3 = new TestThread_WaitingOn();
		thread3.start(); // 启动第三个线程 14
	}
}
