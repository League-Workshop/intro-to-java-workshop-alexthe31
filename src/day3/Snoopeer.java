package day3;

import javax.swing.JOptionPane;

public class Snoopeer {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			String a = JOptionPane.showInputDialog("what is phone number");
			String b = JOptionPane.showInputDialog("what is your name");
			String c = JOptionPane.showInputDialog("what is your adress");
			JOptionPane.showMessageDialog(null, " thank you " + b + " your number is " + a + " you live at " + c);
		}
	}

}
