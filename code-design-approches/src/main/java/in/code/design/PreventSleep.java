package in.code.design;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.LocalDateTime;
import java.util.Random;

public class PreventSleep {
	public static void main(String[] args) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Random random = new Random();
		while (true) {
			System.out.println(LocalDateTime.now());
			robot.mouseMove(random.nextInt(1000), random.nextInt(1000));
			Thread.sleep(random.nextInt(1000 * 60 * 2));
		}
	}
}
