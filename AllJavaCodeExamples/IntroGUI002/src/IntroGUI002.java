import java.awt.*;
import javax.swing.*;

/*-
 * IntroGUI002
 * Shows the basic setup for the creation of a JFrame and 
 * draws two circles to the frame by overriding the paint method.
 * Author:  Don Spickler
 * Date: 7/6/2016
 */

public class IntroGUI002 extends JFrame {

	public static void main(String[] args) {
		IntroGUI002 prog = new IntroGUI002(args);
		prog.setTitle("GUI");

		prog.setBounds(20, 20, 700, 500);
		prog.setVisible(true);
		prog.toFront();
	}

	public IntroGUI002(String[] args) {
	}

	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.black);
		g.fillOval(60, 40, 220, 220);
		g.setColor(Color.red);
		g.fillOval(80, 60, 180, 180);
	}
}
