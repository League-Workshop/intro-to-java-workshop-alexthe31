package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String talking = JOptionPane.showInputDialog("do yous knows hows to writes codes?");

		// 2. If they say "yes", tell them they will rule the world.
		if (talking.equals("yes")) {
			System.out.println("correct");
			// 3. Otherwise, wish them good luck washing dishes.

		} else {
			speak("have fun in the ditches of life");
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
