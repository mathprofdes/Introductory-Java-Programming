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
		
		g.setColor(Color.black);
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		g.drawString("Green Triangle", 50, 70);
		
		int [] trixvalues = new int [3];
		int [] triyvalues = new int [3];
		
		trixvalues[0] = 20;
		trixvalues[1] = 120;
		trixvalues[2] = 290;
		
		triyvalues[0] = 100; 
		triyvalues[1] = 200;
		triyvalues[2] = 110;
		
		g.setColor(Color.green);
		g.fillPolygon(trixvalues, triyvalues, 3);	
		
		g.setColor(Color.black);
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		g.drawString("Red Square", 350, 70);
		g.setColor(Color.red);
		g.fillRect(360, 100, 150, 150);
	}
}
