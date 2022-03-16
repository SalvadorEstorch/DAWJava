/*Añado el extends Persona para poder usar los atributos y sobrescribir los métodos.
 * De hecho, todos los métodos abstract que estén definidos en la clase abustracta Persona,
 * los tendré que sobrescribir luego en sus clases derivadas*/
public class Profesor extends Persona {
	private String competencias;
	
	//Constructores
	public Profesor()  {
		/*Llamos al constructor de la clase Persona con "super" porque esta clase extiende de ella.*/
		super("","","",""); 
		this.competencias="";
	}	

	public Profesor(String nif, String n, String d, String t, String c) {
		/*Cómo se vé puedo usar los dos constructores que tengo en Persona.
		 * El que inicializa a "". Y el que recibe valores por los parametros 
		 * formales de entrada.*/
		super(nif,n,d,t); 
		this.competencias=c;
	}
	
	//Getter y setter
	public void setCompetencias(String c) {
		this.competencias=c;
	}
	public String getCompetencias() {
		return this.competencias;
	}
	/*A continuación sobreescribo los métodos que tenía definidos en la case Persona.
	 * Este paso es obligatorio ya que las clases derivadas deben sobrescribir los métodos
	 * de la clase principal para adaptarlos a sus propias necesidades.
	 * De hecho, por eso ni siqueiera se codificar en la clase padre.*/
	//Método sobrescrito llamar
	@Override
	public String llamar(Persona per) {
		return this.getNombre()+" llamando a "+per.getNombre();
	}
	//Método sobrescrito trabajar
	@Override
	public String trabajar() {
		return "El profesor "+this.getNombre()+" va a impartir su clase";
	}
	//Método propio ponerNota
	/*Este método es propio, lo que significa que aplica sólo a esta clase y 
	 * no afecta a las demás*/
	public String ponerNota() {
		return "El profesor "+this.getNombre()+" va a corregir los exámenes";
	}
	/*Método sobrescirto toString con metodo toString de Persona concatenado.
	 *  También se podrían consegir los atributos de Persona con getters,
	 *  pero cómo queremos todos es mejor usar el método que ya existen en Persona*/
	@Override
	public String toString() {
		return "Profeso "+super.toString()+" Competencias: "+this.getCompetencias();
	}
	
}
