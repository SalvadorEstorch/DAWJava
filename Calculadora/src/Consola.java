/* 
 * Esta clase sirve para realizar todo tipo de operaciones con las clases suma, resta, producto y cociente.
 * @author Salvador
 * @version 1.0
 */
public class Consola {
	public static void main (String args []) {
		/*-----SUMA-----*/
		suma s = new suma();
		s.sumaDosNumerosReales(13.4234, 3534.2);
		s.sumaDosNumerosEnteros(4, 7);
		s.sumaTresNumerosReales(-5, 120, 3.14);
		s.setReal(6.12);
		s.sumaValorAcumulado(15.5);
		s.getReal();
		
		/*-----RESTA-----*/
		/*No estaba claro si había que llamar a los métodos
		 * desde un main y alguno ha decidido no hacerlo*/
		
		/*-----PRODUCTO-----*/
		/*No estaba claro si había que llamar a los métodos
		 * desde un main y alguno ha decidido no hacerlo*/
		
		/*-----COCIENTE-----*/
        cociente cociente1= new cociente(0,0,0,0,0,0);
        cociente1.DivisionReales(0, 0);
        cociente1.DivisionEnteros(0, 0);
        cociente1.Inverso(0);
        cociente1.Raiz(0);
	}
}
