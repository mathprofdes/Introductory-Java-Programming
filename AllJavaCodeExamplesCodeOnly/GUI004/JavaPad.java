import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*-
 * JavaPad
 * Added to the application:
 * 1. The JTextArea
 * 2. The Menu
 * 3. The About Screen
 *  
 * Author:  Don Spickler
 * Date: 7/6/2016
 */

public class JavaPad extends JFrame implements WindowListener {

	private JTextArea TextEditor;
	private JMenuBar MainMenu;

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

		createMenu();
		setJMenuBar(MainMenu);
	}

	private void createMenu() {
		MainMenu = new JMenuBar();

		JMenu FileMenu = new JMenu("File");
		FileMenu.setMnemonic('F');

		JMenu EditMenu = new JMenu("Edit");
		EditMenu.setMnemonic('E');

		JMenu HelpMenu = new JMenu("Help");
		HelpMenu.setMnemonic('H');

		JMenuItem ExitMenuItem = new JMenuItem("Exit");
		ExitMenuItem.setMnemonic('x');
		ExitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				windowClosing(null);
			}
		});

		JMenuItem AboutMenuItem = new JMenuItem("About JavaPad");
		AboutMenuItem.setMnemonic('A');
		AboutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				onShowAbout();
			}
		});

		FileMenu.add(ExitMenuItem);

		HelpMenu.add(AboutMenuItem);

		MainMenu.add(FileMenu);
		MainMenu.add(EditMenu);
		MainMenu.add(HelpMenu);
	}
	
	private void onShowAbout() {
		JOptionPane.showMessageDialog(this, "JavaPad\nWritten by: Don Spickler\nCopyright 2016", "About JavaPad", JOptionPane.INFORMATION_MESSAGE);
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
