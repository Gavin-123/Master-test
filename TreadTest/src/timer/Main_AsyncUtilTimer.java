package timer;

import java.util.Timer;

public class Main_AsyncUtilTimer {
	public static void main(String[] args) {
		Timer timer = new Timer();

		MyAsyncTimerTask task1 = new MyAsyncTimerTask(1);
		MyAsyncTimerTask task2 = new MyAsyncTimerTask(2);
		MyAsyncTimerTask task3 = new MyAsyncTimerTask(3);
		timer.schedule(task1, 5000);
		timer.schedule(task2, 5000);
		timer.schedule(task3, 5000);
	}
}