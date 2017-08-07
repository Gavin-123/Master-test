package MyPackage;

public class TestThread1 extends Thread {
	Object lock1 = null;
	Object lock2 = null;

	public TestThread1(Object lock1_, Object lock2_) {
		lock1 = lock1_;
		// 1 JAVA线程堆栈分析
		lock2 = lock2_;
		this.setName(this.getClass().getName());
	}

	public void run() {
		fun();
	}

	public void fun() {
		synchronized (lock1) {
			try {
				Thread.sleep(2);
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (lock2) {
			}
		}
	}
}