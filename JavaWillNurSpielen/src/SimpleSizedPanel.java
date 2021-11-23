import javax.swing.*;
import util.ShowInFrame;

public class SimpleSizedPanel extends SizedPanel {
	
	public void paintComponent(java.awt.Graphics g) {
		g.fillRect(30,  50, 50, 80);
	}

	public static void main(String[] args) {
		ShowInFrame.show(new SimpleSizedPanel());

	}

}
