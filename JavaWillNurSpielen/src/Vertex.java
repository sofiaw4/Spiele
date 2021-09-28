
public class Vertex {
	public double x;
	public double y;

	public Vertex(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		
		return "(" + x + ", " + y + ")";
	}

	public double lenght() {
		
		return Math.sqrt(x * x + y * y);
	}
	
	public Vertex skalarMult(double s) {
		
		return new Vertex(x*s, y*s) ;
		
	}
	
	public void SkalarMultMod(double s) {
		x = x*s ;
		y = y*s ;
	}
	
	public Vertex add(Vertex v2) {
		return new Vertex (x+v2.x , y+v2.y) ;
	}
	
	public void addMod(Vertex hund) {
		x = x+hund.x ;
		y = y+hund.x ;
		
	}
	
	public void setX (double x) {
		this.x = x ;
	}
	
	public void setY (double y) {
		this.y = y ;
	}

}
