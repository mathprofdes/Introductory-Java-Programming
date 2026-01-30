import java.awt.*;
import javax.swing.*;

/*-
 * GraphicsJPanel
 * Plots the function y = sin(x).
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
		g.translate(200, 200);
		g.drawLine(0, 200, 0, -200);
		g.drawLine(-200, 0, 200, 0);

		g.setColor(Color.red);

		double lastx = -100;
		double lasty = -100;

		for (double x = -10; x <= 10; x += 0.1) {
			double y = Math.sin(x);
			if (lastx > -90) {
				g.drawLine((int) (20 * lastx), (int) (20 * lasty), (int) (20 * x), (int) (20 * y));
			}
			lastx = x;
			lasty = y;
		}
	}
}
