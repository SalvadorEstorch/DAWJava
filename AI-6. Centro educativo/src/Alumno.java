
public class Alumno extends Persona{
	private String curso;
	
    //Constructores
	public Alumno() {
		super("","","",""); 
		this.curso="";
	}
	public Alumno(String nif, String n, String d, String t,String c) {
		super(nif,n,d,t);
		this.curso=c;
	}
	
	//Getters y setters
	public void setCurso(String c) {
		this.curso=c;
	}
	public String getCurso() {
		return this.curso;
	}
	//M�todo sobrescrito llamar
	@Override
	public String llamar(Persona per) {
		return this.getNombre()+" llamando a "+per.getNombre();
	}
	//M�todo sobrescrito trabajar
	@Override
	public String trabajar() {
		return "El alumno "+this.getNombre()+" va a estudiar para el curso "+this.getCurso();
	}	
	//M�todo propio hacerExamen
	public String hacerExamen() {
		return "El alumno "+this.getNombre()+" va a hacer su examen";
	}
	//M�todo sobrescirto toString con metodo toString de Persona concatenado.
	@Override
	public String toString() {
		return "Alumno "+super.toString()+" Cursando: "+this.getCurso();
	}
}
