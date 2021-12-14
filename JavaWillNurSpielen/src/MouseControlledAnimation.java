import util.*;
import java.awt.event.*;

public class MouseControlledAnimation extends SimpleAnimation{
	
GameObject controlled;

MouseControlledAnimation(final GameObject contr){
	controlled=contr;
	gos.add(controlled);
	addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			final Vertex delta = new Vertex(e.getX(), e.getY());
			delta.addMod(controlled.getPos().skalarMult(-1));
			delta.addMod(new Vertex(-controlled.getWidth()/2,-controlled.getHeight()/2));
		    final double factor = controlled.getDeltaPos().length()/delta.length();
		    delta.skalarMultMod(factor);
		    controlled.setDeltaPos(delta);
		}
	});
}
	
	
	public static void main(String[] args) {
		MovablePanel p = new MouseControlledAnimation(new MovableImage("bat.png", 0, 0, 1, 1));
		p.gos.add(new MovableImage("biene2.png", 600, 600, -1, -1));
		ShowInFrame.show(p);

	}

}