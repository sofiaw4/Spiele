
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

		return new Vertex(x * s, y * s);

	}

	public void skalarMultMod(double s) {
		x = x * s;
		y = y * s;
	}

	public Vertex add(Vertex v2) {
		return new Vertex(x + v2.x, y + v2.y);
	}

	public void addMod(Vertex v2) {
		x = x + v2.x;
		y = y + v2.x;

	}

	public void subMod(Vertex that) {
		x = that.x - x;
		y = that.y - y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public boolean equals(Object thatObject) {
		if (thatObject instanceof Vertex) {
			Vertex that = (Vertex) thatObject;
			return this.x == that.x && this.y == that.y;
		}
		return false;
	}

	public double distance(Vertex that) {
		double xx = this.x - that.x;
		double yy = this.y - that.y;

		return Math.sqrt(xx * xx + yy * yy);
	}

	public void normalize() {
		double factor = this.lenght();

		this.x = x / factor;
		this.y = y / factor;
	}

}
