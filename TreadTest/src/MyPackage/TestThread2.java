package MyPackage;

public class TestThread2 extends Thread {
	Object lock1 = null;
	Object lock2 = null;

	public TestThread2(Object lock1_, Object lock2_) {
		lock1 = lock1_;
		lock2 = lock2_;
		this.setName(this.getClass().getName());
	}

	public void run() {
		fun();
	}

	public void fun() {
		synchronized (lock2) {
			try {
				Thread.sleep(2);
			} catch (Exception e) {
				// JAVA线程堆栈分析 27
				e.printStackTrace();
			}
			synchronized (lock1) {
			}
		}
	}
}