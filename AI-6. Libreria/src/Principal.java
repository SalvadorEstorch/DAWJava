import com.itt.libreria.Autor; //Necesito importar las clases porque pertenecen a otro paquete.
import com.itt.libreria.Libro;

public class Principal {
	public static void main(String args []) {
		Autor A1 = new Autor("C.S.Lewis","C.S.Lewis fue un inventor, científico y empresario estadounidense​​.");
		Libro L1 = new Libro("Las Crónicas de Narnia","Humor",A1);
		System.out.println(L1.toString());
		/*Primero hago un get del objeto, y luego modifico el atributo. Hay que ir en ese orden, porque si no
		no tengo acceso a los atributos del otro objeto*/
		L1.getAutor().setBiogrfia("C. S. Lewis, fue un apologista cristiano, medievalista y escritor británico.");
		System.out.println(L1.getAutor().toString());
		System.out.println(A1.toString());
		L1.setGenero("Fantasía/Aventura");
		L1.toString();
	}
}