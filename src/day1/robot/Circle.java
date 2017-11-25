package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Circle {
	public static void main(String[] args) {
		Robot A = new Robot();
		A.penDown();
		for (int i = 0; i <= 45; i++) {
			A.turn(1);
			A.move(1);
		}
		for (int i = 0; i <= 360; i++) {
			A.turn(-1);
			A.move(1);
		}
		A.hide();
	}

}
