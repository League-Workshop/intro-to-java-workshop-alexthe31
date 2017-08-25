package day5;

import org.jointheleague.graphical.robot.Robot;

public class RobotGrafiti {
	public static void main(String[] args) {
		Robot a = new Robot("batman");
		a.penDown();

		a.setSpeed(10);

		a.setPenWidth(5);

		for (int i = 0; i < 3; i++) {

			a.setRandomPenColor();
			a.move(50);
			a.turn(90);

		}
	}
}
