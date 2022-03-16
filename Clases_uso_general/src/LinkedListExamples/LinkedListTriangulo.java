package LinkedListExamples;

import ArrayListExamples.Triangulo;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListTriangulo {
	public static void main(String args[]) {
		LinkedList<Triangulo> tria = new LinkedList<Triangulo>();
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
