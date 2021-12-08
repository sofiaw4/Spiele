import java.util.*;
import util.*;

class RemoveAnimation extends AnimationPanel {
	public void doChecks() {
		List<GameObject> toRemove = new LinkedList<GameObject>();
		for (GameObject g1 : gos)
			for (GameObject g2 : gos)
				if (g1 != g2 && g1.touches(g2)) {
					if (g1.isLargerThan(g2)) toRemove.add(g2);
					else toRemove.add(g1);
				}
		gos.removeAll(toRemove);
	}

	public static void main(String[] args) {
		MovablePanel p = new RemoveAnimation();
		p.gos.add(new MovableImage("bat.png", 0, 0, 1, 1));
		p.gos.add(new MovableImage("biene.png", 800, 800, -1, -1));
		ShowInFrame.show(p);


	}

}
