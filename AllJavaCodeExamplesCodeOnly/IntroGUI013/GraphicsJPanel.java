import java.awt.*;
import javax.swing.*;

/*-
 * GraphicsJPanel
 * Shows the translate method.  
 * Author:  Don Spickler
 * Date: 7/6/2016
 */

public class GraphicsJPanel extends JPanel {

	public GraphicsJPanel() {
		setBackground(Color.white);
	}

	public void paint(Graphics g) {
		super.paint(g);

		g.translate(200, 200);
		g.drawLine(0, 200, 0, -200);
		g.drawLine(-200, 0, 200, 0);
	}
}
