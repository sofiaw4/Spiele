
public class TestVertex {

	public static void main(String[] args) {
		
		String s1 ="hallo" ;
		String s2 ="hallO".toLowerCase() ;
		
		Vertex v1 = new Vertex(17, 4) ;
		Vertex v2 = new Vertex(42, 23) ;
		Vertex v3 = new Vertex(0, 0) ;
		Vertex v4 = new Vertex(42, 23) ;
		
		System.out.println(v2.toString());
		System.out.println(v2) ;
		System.out.println(v1.lenght()) ;
		System.out.println(v2.lenght()) ;
		System.out.println(v3.lenght()) ;
		System.out.println(v1.skalarMult(0.5)) ;
		System.out.println(v1) ;
		System.out.println(v1.add (v2)) ;
		System.out.println(v1) ;
		System.out.println(v2) ;
		System.out.println(v1.equals(v2)) ;
		System.out.println(v2.equals(v3)) ;
		System.out.println(v2.equals(v4)) ;
		System.out.println(v4.equals(v2)) ;
		System.out.println(v1.distance(v2)) ;
		
	}

}
