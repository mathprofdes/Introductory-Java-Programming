import java.awt.*;
import javax.swing.*;

/*-
 * GraphicsJPanel
 * Shows the process of selecting fonts and drawing text to a graphics panel. 
 * Author:  Don Spickler
 * Date: 7/6/2016
 */

public class GraphicsJPanel extends JPanel {

	public GraphicsJPanel() {
		setBackground(Color.white);
	}

	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.red);
		g.drawString("Hi there", 100, 200);
		
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
		g.drawString("Big Font", 50, 70);
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD | Font.ITALIC, 70));
		g.drawString("Big Slant Font", 50, 170);
	}
}
