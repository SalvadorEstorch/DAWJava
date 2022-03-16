/*A�ado el extends Persona para poder usar los atributos y sobrescribir los m�todos.
 * De hecho, todos los m�todos abstract que est�n definidos en la clase abustracta Persona,
 * los tendr� que sobrescribir luego en sus clases derivadas*/
public class Profesor extends Persona {
	private String competencias;
	
	//Constructores
	public Profesor()  {
		/*Llamos al constructor de la clase Persona con "super" porque esta clase extiende de ella.*/
		super("","","",""); 
		this.competencias="";
	}	

	public Profesor(String nif, String n, String d, String t, String c) {
		/*C�mo se v� puedo usar los dos constructores que tengo en Persona.
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
	/*A continuaci�n sobreescribo los m�todos que ten�a definidos en la case Persona.
	 * Este paso es obligatorio ya que las clases derivadas deben sobrescribir los m�todos
	 * de la clase principal para adaptarlos a sus propias necesidades.
	 * De hecho, por eso ni siqueiera se codificar en la clase padre.*/
	//M�todo sobrescrito llamar
	@Override
	public String llamar(Persona per) {
		return this.getNombre()+" llamando a "+per.getNombre();
	}
	//M�todo sobrescrito trabajar
	@Override
	public String trabajar() {
		return "El profesor "+this.getNombre()+" va a impartir su clase";
	}
	//M�todo propio ponerNota
	/*Este m�todo es propio, lo que significa que aplica s�lo a esta clase y 
	 * no afecta a las dem�s*/
	public String ponerNota() {
		return "El profesor "+this.getNombre()+" va a corregir los ex�menes";
	}
	/*M�todo sobrescirto toString con metodo toString de Persona concatenado.
	 *  Tambi�n se podr�an consegir los atributos de Persona con getters,
	 *  pero c�mo queremos todos es mejor usar el m�todo que ya existen en Persona*/
	@Override
	public String toString() {
		return "Profeso "+super.toString()+" Competencias: "+this.getCompetencias();
	}
	
}
