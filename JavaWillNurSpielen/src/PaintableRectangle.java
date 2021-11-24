
public class PaintableRectangle extends SimpleRectangle implements Paintable {
	
	public PaintableRectangle (double width, double height, double x, double y) {
		super(width, height, x, y);

	}
	
	public void paintTo(java.awt.Graphics g)  {
		g.fillRect ((int)pos.x, (int)pos.y, (int)width, (int)height);
		
	}

}