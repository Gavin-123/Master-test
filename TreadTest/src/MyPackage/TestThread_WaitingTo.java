package MyPackage;

public class TestThread_WaitingTo extends Thread {
	Object lock = null;

	public TestThread_WaitingTo(Object lock_) {
		lock = lock_;
		this.setName(this.getClass().getName());
	}

	public void run() {
		fun();
	}

	public void fun() {
		synchronized (lock) { // <--打印线程堆栈时，该线程运行到这里 89
			fun_longtime();
		}
	}

	public void fun_longtime() {
		// 1 JAVA线程堆栈分析
		try {
			Thread.sleep(20000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
