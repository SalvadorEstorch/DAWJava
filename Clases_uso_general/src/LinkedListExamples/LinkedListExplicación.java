package LinkedListExamples;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExplicaci�n {
	public static void main(String [] args) {
		LinkedList <String> nombres = new LinkedList<String>();
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
		/*En un bucle For-each no se permite eliminar ning�n elememnto sobre el que se est� iterando*/
		for (String n : nombres) {
			System.out.println(n);
			/*if(n.equals("Carmen")) {
				nombres.remove(n); 
			}*/
		}
		//M�todos importantes para trabajar LinkedList
		nombres.size(); 
		nombres.add("Ver�nica");
		itera.hasNext();
		nombres.remove("Ver�nica");
		nombres.contains("Carmen");
		nombres.isEmpty();
	}
}
