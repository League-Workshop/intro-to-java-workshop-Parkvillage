package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot ty= new Robot();
	Robot the=new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		ty.setSpeed(200);
		ty.miniaturize();
		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...
		



			// 7. Set the pen color to random
			ty.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			ty.turn(90);
		}
	

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		//JOptionPane.showMessageDialog(null,"yay! you called the drawSquare() method!");

		ty.penDown();
		ty.move();
		ty.turn(90);
		ty.move(500);
		ty.turn(90);
		ty.move(500);
		ty.turn(90);
		ty.move(500);
        ty.turn(90);

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



