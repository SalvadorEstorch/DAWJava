
public class Main {
	public static void main(String args []) {
		//Istancio un objeto de cada clase derivada.
		Profesor P1 = new Profesor("54928350S","Carlos Bargas","C/ Candeleda Nº 6","6432928174","Programación y BBDD");
		Alumno A1 = new Alumno("64922849E","Alejando Tejeda","C/ Descartes Nº 12","644328412","1º Daw");
		Administrativo Admin1 = new Administrativo("644234234F"
				,"Santiago Gómez","C/ Descartes Nº 12","6443453457","Gestion de matriculas y convalidaciones");
		//Ejecuto el método toString() sobre cada uno de ellos.
		System.out.println("------Ejecuto el método toString() sobre cada uno de ellos------");
		System.out.println(P1.toString());
		System.out.println(A1.toString());
		System.out.println(Admin1.toString());
		System.out.println("");
		//Ejecuto el método trabajar() sobre cada uno de ellos.
		System.out.println("------Ejecuto el método trabajar() sobre cada uno de ellos------");
		System.out.println(P1.trabajar());
		System.out.println(A1.trabajar());
		System.out.println(Admin1.trabajar());
		System.out.println("");
		//Ejecuto el método llamar(Persona p) para que el alumno llame al profesor.
		System.out.println("------Ejecuto el método llamar(Persona p) para que el alumno llame al profesor------");
		System.out.println(A1.llamar(P1));
		System.out.println("");
		//Ejecuta el método ponerNotas() del objeto Profesor.
		System.out.println("------Ejecuta el método ponerNotas() del objeto Profesor------");
		System.out.println(P1.ponerNota());
		System.out.println("");
		//Ejecuta el método hacerExamen() del objeto Alumno.
		System.out.println("------Ejecuta el método hacerExamen() del objeto Alumno------");
		System.out.println(A1.hacerExamen());
		System.out.println("");
		//Ejecuta el método gestionarMatricula() del objeto Administrativo.
		System.out.println("------Ejecuta el método gestionarMatricula() del objeto Administrativo------");
		System.out.println(Admin1.gestionarMatricula());
	}
}
