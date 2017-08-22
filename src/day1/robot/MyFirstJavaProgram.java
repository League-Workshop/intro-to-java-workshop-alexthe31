package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot JohnWalsh = new Robot();
		JohnWalsh.penDown();
		JohnWalsh.setSpeed(10);

		for (int i = 0; i < 4; i++) {
			JohnWalsh.move(50);
			JohnWalsh.turn(90);

		}
		JohnWalsh.penUp();
		JohnWalsh.move(120);
		JohnWalsh.turn(90);
		for (int i = 0; i < 4; i++) {
			JohnWalsh.penDown();
			JohnWalsh.move(50);
			JohnWalsh.turn(90);

		}JohnWalsh.turn(180);
		JohnWalsh.penUp();
		JohnWalsh.move(120);
		JohnWalsh.setAngle(90);
		
		
		
	}
}
