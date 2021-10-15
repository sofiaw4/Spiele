
public class SimpleTriangle extends GeometricObject{
	
	public SimpleTriangle(double w, double h, Vertex pos) {
		super(w, h, pos);
	}
	
	public SimpleTriangle(double w, double h, double x, double y) {
		super(w, h, new Vertex(x,y));
	}
	
	/*@Override public double circumference() {
		return 
	}
	
	@Override public double area() {
		return 
	} */
	
	@Override public String toString() {
		return "SimpleTriangle ("+super.toString()+")";
	}
	@Override public boolean equals(Object that) {
		return (that instanceof SimpleTriangle) && super.equals(that);
	}
	

}
