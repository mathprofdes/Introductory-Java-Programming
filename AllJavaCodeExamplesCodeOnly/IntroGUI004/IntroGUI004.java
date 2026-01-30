import java.awt.*;
import java.util.Random;
import javax.swing.*;

/*-
 * IntroGUI004
 * Draws 300 random lines in random colors inside the frame.
 * Author:  Don Spickler
 * Date: 7/6/2016
 */

public class IntroGUI004 extends JFrame {

	private Random gen = new Random();
	private static IntroGUI004 prog;

	public static void main(String[] args) {
		prog = new IntroGUI004(args);
		prog.setTitle("GUI");

		prog.setBounds(20, 20, 700, 500);
		prog.setVisible(true);
		prog.toFront();
	}

	public IntroGUI004(String[] args) {
	}

	public void paint(Graphics g) {
		super.paint(g);

		Rectangle bounds = prog.getBounds();
		int x = (int) bounds.getWidth();
		int y = (int) bounds.getHeight();

		for (int i = 0; i < 300; i++) {
			g.setColor(new Color(gen.nextInt(255), gen.nextInt(255), gen.nextInt(255)));
			g.drawLine(gen.nextInt(x), gen.nextInt(y), gen.nextInt(x), gen.nextInt(y));
		}
	}
}
