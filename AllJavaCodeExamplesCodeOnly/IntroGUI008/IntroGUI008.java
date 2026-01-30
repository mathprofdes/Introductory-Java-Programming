import java.awt.*;
import javax.swing.*;

/*-
 * IntroGUI008
 * Creates a special JPanel for graphing and places the panel on the frame. 
 * Author:  Don Spickler
 * Date: 7/6/2016
 */

public class IntroGUI008 extends JFrame {

	private static IntroGUI008 prog;
	private GraphicsJPanel canvas;

	public static void main(String[] args) {
		prog = new IntroGUI008(args);
		prog.setTitle("GUI");

		prog.setBounds(20, 20, 700, 500);
		prog.setVisible(true);
		prog.toFront();
	}

	public IntroGUI008(String[] args) {
		canvas = new GraphicsJPanel();

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(canvas, BorderLayout.CENTER);
	}
}
