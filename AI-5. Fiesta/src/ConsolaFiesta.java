
public class ConsolaFiesta {
	
	public static void main(String args []) {
		/*En este caso uso el primer constructor. Por no puedo meter parámetros.*/
        Fiesta f = new Fiesta(); 
		f.setTipo("cumpleaños");
		f.setFechaHora("12:02:2022, 20:00");
		f.setDireccion("C/Rosas 21");
		f.setBocadillos(15);
		f.setBebidas(5);
		f.invitar();
		f.invitar();
		f.invitar();
		f.cancelarInvitación();
		System.out.println(f.consultar());	
		/*En este otro caso estoy usando el segundo constructor que permite meter los valores directamente a través de los parámetros*/
		Fiesta f2 = new Fiesta("Indios y baqueros","28:02:2022, 17:30","C/Margaritas 15",12,30,14);
		f2.cancelarInvitación();
		f2.setBocadillos(12);
		f2.setBebidas(24);
		System.out.println("bocadillos "+f2.getBocadillos()+" bebidas "+f2.getBebidas());
		f2.precioFiesta();
		System.out.println(f2.consultar());
		//Ejercicio 2.
		f.invitar(20);
		f.invitar(5);
		System.out.println(f.getInvitados());
		System.out.println("Numero de veces que se ha llamado a algún constructor: "+f.sumaContador());
	}
}
