package MyPackage;

public class TestThread_Locked extends Thread {
	Object lock = null;

	public TestThread_Locked(Object lock_) {
		lock = lock_;
		this.setName(this.getClass().getName());
	}

	public void run() {
		fun();
	}

	public void fun() {
		synchronized (lock) {
			fun_longtime();
		}
	}

	public void fun_longtime() {
		try {
			Thread.sleep(20000); // <---打印线程堆栈时，该线程运行到这里 38
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}