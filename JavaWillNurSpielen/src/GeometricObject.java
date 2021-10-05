
public class GeometricObject {
	 
	public Vertex pos;
	public double height; 
	public double width;

	public GeometricObject (double width, double height, Vertex pos) {
		this.width = width;
		this.height = height;
		this.pos = pos;
	
		if (width<0) {
			width = -width;
			pos.x = pos.x - width;
		}
	
		if (height<0) {
			height = -height;
			pos.y = pos.y -height;
		
		}
		
	}
		
	public GeometricObject (double width, double height) {
		this(width, height, new Vertex(0,0));
	}
		
	public GeometricObject (double w) {
		this(w,w);
	}
	
	public GeometricObject() {
		this(10);
	}
	
	public  String toString() {
		return "width= " +width+", height=" +height+", pos=" +pos;
	}
	
	public double circumference() {
		return 2*(width+height);
	}
	
	public double area () {
		return width*height;
	}
	
	public double getWidth() {return width; }	
	public double getHeight() {return height; }	
	public Vertex getPos() {return pos; }
	

}
