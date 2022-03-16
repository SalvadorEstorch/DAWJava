import java.util.Scanner;

public class Principal {
	public static void main(String args[]) throws NumerosRojosException,NumberFormatException {
		Scanner lector = new Scanner(System.in);
		System.out.println("Vamos a crear una cuenta y realizar el primer ingreso de 100 euros");
		CuentaBancaria miCuenta = new CuentaBancaria(38143, "Amelia González");
		miCuenta.agregarMovimiento("Ingreso inicial", 100);
		System.out.println("Cuánto dinero deseas retirar: ");
		//Abro el try que engloba las lineas que pueden hacer saltar la exception.
		try {
			int dinero;
		    dinero = Integer.parseInt(lector.nextLine());
		    miCuenta.agregarMovimiento("Retirada de fondos", -dinero);
		    lector.close();
		} //Cierro try.
		//Abro catch para capturar "NumberFormatException" si la hay.
		catch (NumberFormatException e) {		
			System.out.println("El formato no es correcto");
			System.out.println(e.getMessage());
		}
		//Abro catch para capturar "NumerosRojosException" si la hay.
		catch (NumerosRojosException n) {
			n.getArgumento();
			System.out.println(n.getArgumento());
		}
		//Meto en el Finally el estado del objeto para que simpre informe de el al terminar.
		finally {
			System.out.println(miCuenta);
		    System.out.println(miCuenta.listarMovimientos());
		}
	}
}