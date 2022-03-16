package ArrayListExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExplicación {
	public static void main(String [] args) {
		ArrayList <String> nombres = new ArrayList<String>();
		nombres.add("Carmen");
		nombres.add("Rosa");
		nombres.add("Miguel");
		nombres.add("Pablo");

		
		Iterator <String> itera=nombres.iterator();
		String cadaNombre;	
		while(itera.hasNext()) {
			cadaNombre=itera.next();
			System.out.println(cadaNombre);
			if (cadaNombre.equals("Carmen")) {
				itera.remove();
			}
        }
		/*En un bucle For-each no se permite eliminar ningún elememnto sobre el que se está iterando*/
		for (String n : nombres) {
			System.out.println(n);
			/*if(n.equals("Carmen")) {
				nombres.remove(n); 
			}*/
		}
		//Métodos importantes para trabajar ArrayList
		nombres.size(); 
		nombres.add("Verónica");
		itera.hasNext();
		nombres.remove("Verónica");
		nombres.contains("Carmen");
		nombres.isEmpty();
	}
}
