package MyPackage;

public class TestThread_WaitingOn extends Thread {
	Object lockobj1 = new Object();

	public TestThread_WaitingOn() {
		// JAVA线程堆栈分析
		this.setName(this.getClass().getName());
	}

	public void run() {
		fun();
	}

	public void fun() {
		synchronized (lockobj1) {
			fun_wait();
		}
	}

	public void fun_wait() {
		try {
			lockobj1.wait(100000);// <--- 打印线程堆栈时，该线程运行到这里 66
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
