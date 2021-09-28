
public class TestVertex {

	public static void main(String[] args) {
		
		Vertex v1 = new Vertex(10, 5) ;
		Vertex v2 = new Vertex(27, 25) ;
		Vertex v4 = v1.skalarMult(42.42) ;
		Vertex katze = v2.add(v1) ;
		
		System.out.println(v1) ;
		System.out.println(v2) ;
		System.out.println(v2.lenght()) ;
		System.out.println(v4) ;
		System.out.println(katze) ;

	}

}
