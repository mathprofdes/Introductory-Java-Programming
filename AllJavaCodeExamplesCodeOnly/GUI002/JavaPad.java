import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*-
 * JavaPad
 * Added to the application:
 * 1. The JTextArea
 *  
 * Author:  Don Spickler
 * Date: 7/6/2016
 */

public class JavaPad extends JFrame implements WindowListener {

	private JTextArea TextEditor;
	
	public static void main(String[] args) {
		JavaPad prog = new JavaPad(args);

		prog.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		prog.setBounds(20, 20, 700, 500);
		prog.setVisible(true);
		prog.toFront();
	}

	public JavaPad(String[] args) {
		addWindowListener(this);
		setTitle("JavaPad");
		
		TextEditor = new JTextArea();
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(TextEditor, BorderLayout.CENTER);
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}
}
