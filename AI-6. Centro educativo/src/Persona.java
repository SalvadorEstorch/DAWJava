/*La declaro c�mo abstract class porque se podr�a decir que tiene
 * que representar un grupo de objetos distintos que comparte una ra�z com�n.
 * C�mo en este caso, que cada uno tiene un trabajo pero todos comparten el hecho de ser personas.
 * Por eso tendr�s la mayor�a de atributos comunies y algunos especificos propios. Lo 
 * mismo pasa con los m�todos, comparten la mayor�a pero tiene alguno propio.*/
public abstract class Persona { 
	private String nif; 
	private String nombre;
	private String direccion;
	private String telefono;
	
	//Constructores
	public Persona() {
		this.nif="";
		this.nombre="";
		this.direccion="";
		this.telefono="";
	}
	public Persona(String nif, String n, String d, String t) {
		this.nif=nif;
		this.nombre=n;
		this.direccion=d;
		this.telefono=t;
	}
	
	//Getters y Setters
	public void setNif(String nif) {
		this.nif=nif;
	}
	public String getNif() {
		return this.nif;
	}
	public void setNombre(String n) {
		this.nombre=n;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setDireccion(String d) {
		this.direccion=d;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public void setTelefono(String t) {
		this.telefono=t;
	}
	public String getTelefono() {
		return this.telefono;
	}
	
	/*M�todo abstracto llamar. Tiene que ser sobrescrito en las clases derivadas.
	 * Tambi�n en las clases derivadas se le dar� su uso concreto. Por el momento nos
	 * limitamos a declararlo.*/
    public abstract String llamar(Persona per);
    
    /*M�todo abstracto trabajar. Funciona igual que el anterior, quitando el hecho de que
    este no va a recibir par�metros de entrada*/
    public abstract String trabajar();

    
    /*Metodo sobrescrito toString. Puede o no ser sobrescrito en las clases derivadas, 
     * porque no pertenece a esta clase sino a la clase Object. */
	@Override
	public String toString() {
		return "[nif=" + this.getNif() + ", nombre=" + this.getNombre() + ", direccion=" + this.getDireccion() + ", telefono=" + this.getTelefono()+ "]";
	}
}
