
public class Main {
	public static void main(String args []) {
		//Istancio un objeto de cada clase derivada.
		Profesor P1 = new Profesor("54928350S","Carlos Bargas","C/ Candeleda N� 6","6432928174","Programaci�n y BBDD");
		Alumno A1 = new Alumno("64922849E","Alejando Tejeda","C/ Descartes N� 12","644328412","1� Daw");
		Administrativo Admin1 = new Administrativo("644234234F"
				,"Santiago G�mez","C/ Descartes N� 12","6443453457","Gestion de matriculas y convalidaciones");
		//Ejecuto el m�todo toString() sobre cada uno de ellos.
		System.out.println("------Ejecuto el m�todo toString() sobre cada uno de ellos------");
		System.out.println(P1.toString());
		System.out.println(A1.toString());
		System.out.println(Admin1.toString());
		System.out.println("");
		//Ejecuto el m�todo trabajar() sobre cada uno de ellos.
		System.out.println("------Ejecuto el m�todo trabajar() sobre cada uno de ellos------");
		System.out.println(P1.trabajar());
		System.out.println(A1.trabajar());
		System.out.println(Admin1.trabajar());
		System.out.println("");
		//Ejecuto el m�todo llamar(Persona p) para que el alumno llame al profesor.
		System.out.println("------Ejecuto el m�todo llamar(Persona p) para que el alumno llame al profesor------");
		System.out.println(A1.llamar(P1));
		System.out.println("");
		//Ejecuta el m�todo ponerNotas() del objeto Profesor.
		System.out.println("------Ejecuta el m�todo ponerNotas() del objeto Profesor------");
		System.out.println(P1.ponerNota());
		System.out.println("");
		//Ejecuta el m�todo hacerExamen() del objeto Alumno.
		System.out.println("------Ejecuta el m�todo hacerExamen() del objeto Alumno------");
		System.out.println(A1.hacerExamen());
		System.out.println("");
		//Ejecuta el m�todo gestionarMatricula() del objeto Administrativo.
		System.out.println("------Ejecuta el m�todo gestionarMatricula() del objeto Administrativo------");
		System.out.println(Admin1.gestionarMatricula());
	}
}
