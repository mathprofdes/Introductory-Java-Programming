import java.awt.*;
import javax.swing.*;

/*-
 * IntroGUI017
 * Creates a special JPanel for graphing and places the panel on the frame. 
 * Author:  Don Spickler
 * Date: 7/6/2016
 */

public class IntroGUI017 extends JFrame {

	private static IntroGUI017 prog;
	private GraphicsJPanel canvas;

	public static void main(String[] args) {
		prog = new IntroGUI017(args);
		prog.setTitle("GUI");

		prog.setBounds(20, 20, 700, 500);
		prog.setVisible(true);
		prog.toFront();
	}

	public IntroGUI017(String[] args) {
		canvas = new GraphicsJPanel();

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(canvas, BorderLayout.CENTER);
	}
}
