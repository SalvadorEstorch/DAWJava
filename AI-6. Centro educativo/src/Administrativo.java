
public class Administrativo extends Persona {
	private String tareas;
	
	//Constructores
	public Administrativo() {
		super("","","",""); 
		this.tareas="";
	}
	public Administrativo(String nif, String n, String d, String t,String tar) {
		super(nif,n,d,t);
		this.tareas=tar;
	}
	
	//Getter y setter
	public void setTareas(String t) {
		this.tareas=t;
	}
	public String getTareas() {
		return this.tareas;
	}
	//M�todo sobrescrito llamar
	@Override
	public String llamar(Persona per) {
		return this.getNombre()+" llamando a "+per.getNombre();
	}	
	//M�todo sobrescrito trabajar
	@Override
	public String trabajar() {
		return "El administrativo "+this.getNombre()+" va a realizar estas tareas: "+this.getTareas();
	}	
	//M�todo propio gestionarMatricula
	public String gestionarMatricula() {
		return "El adminstrativo "+this.getNombre()+" va a gestionar una matr�cula";
	}
	//M�todo sobrescirto toString con metodo toString de Persona concatenado.
	@Override
	public String toString() {
		return "Administrativo "+super.toString()+" Tareas: "+this.getTareas();
	}
}
