package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "you had one job");
		System.out.println("you have failed");
		String talking = JOptionPane.showInputDialog("why have you failed");
		System.out.println("hi " + talking);

	}
}
