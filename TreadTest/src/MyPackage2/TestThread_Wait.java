package MyPackage2;

public class TestThread_Wait extends Thread {
	Object lock = null;

	public TestThread_Wait(Object lock_) {
		lock = lock_;
		this.setName(this.getClass().getName());
	}

	public void run() {
		fun();

	}

	public void fun() {
		synchronized (lock) {
			try {
				lock.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("is notified");

		}
	}
}
