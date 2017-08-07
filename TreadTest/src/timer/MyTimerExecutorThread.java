package timer;



public class MyTimerExecutorThread extends Thread {
	int taskid;

	public MyTimerExecutorThread(int _taskid) {
		taskid = _taskid;
	}

	public void run() {
		try {
			System.out.println("execute timer task:" + taskid + " at :"
					+ System.currentTimeMillis());
			;
			Thread.sleep(15000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}