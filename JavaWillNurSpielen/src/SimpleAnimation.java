import javax.swing.*;
import java.awt.event.*;
import util.ShowInFrame;

public class SimpleAnimation extends MovablePanel {
	Timer t = new Timer(30, new ActionListener() {
		public void actionPerformed(ActionEvent e) { doOnTick();}
	});
	
	SimpleAnimation(){t.start();}


	public static void main(String[] args) {
		ButtonAnimation p = new ButtonAnimation();
		p.mp.gos.add(new MovableImage("hexe.png", 0, 0, 1, 1));
		p.mp.gos.add(new MovableImage("biene.png", 200, 200, -1, -1));
		ShowInFrame.show(p);

	}

}
