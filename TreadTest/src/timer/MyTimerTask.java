package timer;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

	int taskid;

	public MyTimerTask(int _taskid) {
		taskid = _taskid;
	}

	public void run() {
		try {
			System.out.println("execute timer task:" + taskid + " at :"
					+ System.currentTimeMillis());
			;
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
