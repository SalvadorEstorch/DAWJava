package ArrayListExamples;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTriangulo {
	public static void main(String args[]) {
		ArrayList<Triangulo> tria = new ArrayList<Triangulo>();
	    tria.add(new Triangulo(3,3,3));
	    tria.add(new Triangulo(3,3,2));
	    tria.add(new Triangulo(1,2,3));	
	    
	    for(Triangulo t : tria) {
	    	System.out.println(t);
	    }
	    //Método Iterator
	    Iterator <Triangulo> itera = tria.iterator();
	    Triangulo cadaTriangulo;
	    while(itera.hasNext()) {
	    	cadaTriangulo=itera.next();
	    	System.out.println(cadaTriangulo.tipo());
	    }
	}	
}
	
