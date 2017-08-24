package day3;

import javax.swing.JOptionPane;

public class Quizgame {
	public static void main(String[] args) {

		String q1 = JOptionPane.showInputDialog("what is the air speed velocity of an unladen swallow?");
		if (q1.equals("african or european")) {
			speak("correct");
		} else {
			speak("into the void");

		}
		JOptionPane.showMessageDialog(null, "put answer to the thousandths place");
		String q2 = JOptionPane.showInputDialog("542/62");

		if (q2.equals("8.741")) {
			speak("correct");
		} else {
			speak("you fail math");
			JOptionPane.showMessageDialog(null, "the correct one is 8.741");
		}

		speak("happy");
		String q3 = JOptionPane.showInputDialog(" spell it");

		if (q3.equals("happy")) {
			speak("correct");
		} else {
			speak("you fail english but i failed it too");

		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}