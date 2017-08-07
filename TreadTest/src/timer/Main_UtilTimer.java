package timer;

import java.util.Timer;

public class Main_UtilTimer {
	public static void main(String[] args) {
		Timer timer = new Timer();

		MyTimerTask task1 = new MyTimerTask(1);
		MyTimerTask task2 = new MyTimerTask(2);
		MyTimerTask task3 = new MyTimerTask(3);
		timer.schedule(task1, 5000);
		timer.schedule(task2, 5000);
		timer.schedule(task3, 5000);
	}
}