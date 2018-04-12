package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		Random randGen = new Random();
		// 1. Create a variable to hold the user's score
		int x = 0;
		// 2. Ask the user a question
		String hat = JOptionPane.showInputDialog(null, "are you embarest that you pooped in your diaper today?");
		// 3. Use an if statement to check if their answer is correct
		if (hat.equals("no")) {

			x = x + 1;
		}
		// 4. if the user's answer is correct

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String hat=JOptionPane.showInputDialog(null,warning, these f)
		hat = JOptionPane.showInputDialog(null,
				"what is a 4 LETTER word that starts with poo and ends with p and please no toiet humor allowed");
		if (hat.equals("poo0p")) {
			x = x + 1;
		}
		hat = JOptionPane.showInputDialog(null, "who is the coolest in the whole wide world? San_ay the hint is j");
		if (hat.equals("Sanjay")) {
			x = x + 1;
		}
		String pat = JOptionPane.showInputDialog(null, "whats the time?");
		if (pat.equals("time for me to get a watch")) {
			x = x + 1;
			// 6. After all the questions have been asked, print the user's score
		}
		if (x == 2) {
			JOptionPane.showInputDialog(null, "you did suuuuuuuuuuuuuuucccccchhhhh a dorky job you got 2/4 correct:1");
		}
		if (x == 1) {
			JOptionPane.showInputDialog(null,
					"I am done for life and all eternity I am hacking your accounts you got 1/4. searching for bank accounts OMG you...you are...BILL GATES:( ");
		}
		if (x == 3) {
			JOptionPane.showInputDialog(null, "OMGOMGOMGOMG you got 75%");
		}
		if (x == 3)
			JOptionPane.showInputDialog(null,
					"you know me so much I think I am going to gglithsJHAS<JsajWMNSVDDJSDHVE,DBVLHvgVHWEkhefvrykvHVAsfvafsfvKHVAFDJHEVFJH");
	}

}
