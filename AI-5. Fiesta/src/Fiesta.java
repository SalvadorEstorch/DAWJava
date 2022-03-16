/*Declaraci�n de la clase y las variables de la misma encapsuladas para impedir todo acceso que no sea
 * a trav�s de los getteres y setters*/
public class Fiesta {
	private String tipo;
	private String fechaHora;
	private String direccion;
	private int invitados;
	private int bocadillos;
	private int bebidas;
	/*Variable para almacenar el numero de veces que se usan los constructores*/
	private static int contadorFiestas;
	//1� Constructor. Inicializa los valores a "" o 0.
	public Fiesta() { 
		this.tipo="";
		this.fechaHora="";
		this.direccion="";
		this.invitados=0;
		this.bocadillos=0;
		this.bebidas=0;
		contadorFiestas++; /*Aunmento en 1 la variable cuando se usa este constructor*/
	}
	/*2� Constructor. Permite meter valores a trav�s de los par�metros.*/
	public Fiesta(String tipo, String fecha_hora, String direccion, int invitados, int bocadillos, int bebidas ) {
		this.tipo=tipo;
		this.fechaHora=fecha_hora;
		this.direccion=direccion;
		this.invitados=invitados;
		this.bocadillos=bocadillos;
		this.bebidas=bebidas;
		contadorFiestas++; /*Aunmento en 1 la variable cuando se usa este constructor*/
    /*Getters y setters*/
	}
	public void setTipo(String tipo) { //Usa "void" porque no necesita devolver ning�n valor. S�lo modificarlo.
		this.tipo=tipo;
	}
	public String getTipo() { //Especifica el tipo que se va a devlover a trav�s de return. En este caso "String".
		return this.tipo;
	}
	public void setFechaHora(String fechaHora) {
		this.fechaHora=fechaHora;
	}
	public String getFechaHora() {
		return this.fechaHora;
	}
	public void setDireccion(String Direccion) {
		this.direccion=Direccion;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public void setInvitados(int invitados) {
		this.invitados=invitados;
	}
	public int getInvitados() {
		return this.invitados;
	}
	public void setBocadillos(int bocadillos) {
		this.bocadillos=bocadillos;
	}
	public int getBocadillos() {
		return this.bocadillos;
	}
	public void setBebidas(int bebidas) {
		this.bebidas=bebidas;
	}
	public int getBebidas() {
		return this.bebidas;
	}
	/*Concatena todos los getters del objeto y los devuelve a trav�s de "return".
	 * Tambi�n se podria hacer el m�todo "void" y cambiar "return" por "System.out.println()",
	 * para que se imprima directamente cuando llames al m�todo.
	 * El m�todo precioFiesta() es un ejemplo.*/
	public String consultar() {
		return "Nuestra fiesta es de "+this.getTipo()+". "
				+"Ser� el "+this.getFechaHora()+". " + "En "+this.getDireccion()+"."
				+" Hay "+this.getInvitados()+" personas invitadas."
				+" Tenemos "+this.getBocadillos()+" Bocadillos, y "
				+this.getBebidas()+" bebidas.";
	}
	//Aumenta en 1 el n�mero de la variable invitados.
	public void invitar() {
		this.invitados = this.invitados+1;	
	}
	/*Sobrecargo el m�todo invitar para poder invitar a m�s de una persona cada vez*/
	public void invitar(int n) {
		this.invitados = this.invitados+n;	
	}
	//Disminuye en uno el n�mero de la variable invitados.
	public void cancelarInvitaci�n() {
		this.invitados = this.invitados-1;
	}
	/*Hace el calculo del precio de la fiesta conforme a los valores de las variables en ese momento y lo imprime.
	 * Tambi�n se podr�a haber escrito c�mo el m�todo consultar(). Para que en lugar de imprimirse directamente 
	 * devolviese el valor por "return".*/
	public void precioFiesta() {
		System.out.println("El precio de la fiesta es de: "+(this.invitados*5+this.bebidas*2+this.bocadillos*3)+"�");
	}
	/*Recojo la suma de veces que se ha usado alguno de los contadores y lo devulevo con "return"*/
	public int sumaContador() {
		return contadorFiestas;
	}
}