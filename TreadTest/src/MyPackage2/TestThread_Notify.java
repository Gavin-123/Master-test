package MyPackage2;

public class TestThread_Notify extends Thread {
	Object lock = null;

	public TestThread_Notify(Object lock_) {
		lock = lock_;
		this.setName(this.getClass().getName());
	}

	public void run() {
		fun();
	}

	public void fun() {
		synchronized (lock) {
			lock.notify();
			System.out.println("Have notified");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("sleep complete");
		}
	}
}