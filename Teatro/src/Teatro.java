import java.util.Scanner;
//Hereda de la clase Local
public class Teatro extends Local implements Sala {
	//Atributos
	private Obra obra;
	private double precio;
	//Array dos dimensiones
	private Espectador[][] localidades;
	//Ponemos a funcionar el Scanner
	Scanner lector = new Scanner(System.in);
	//Constructores
	public Teatro() {
		super("",0,0);
		this.obra=null;
		this.precio=0;
		this.localidades=new Espectador[5][10];
	}
	public Teatro(String domi, int metros, int accesos, Obra obra, double precio) {
		super(domi,metros,accesos);
		this.obra=obra;
		this.precio=precio;
		this.localidades=new Espectador[5][10];
	}
	//Getters y Setters
	public Obra getObra() {
		return this.obra;
	}
	public void setObra(Obra obra) {
		this.obra=obra;
	}
	public double getPrecio() {
		return this.precio;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	public Espectador[][] getLocalidades() {
		return this.localidades;
	}
	public void setLocalidades(Espectador[][] localidades) {
		this.localidades=localidades;
	}
	
	@Override
	public String verProgramacion() {
		return ("Hoy representamos"+obra.getTitulo()+", género: "+obra.getGenero()
		       +", duración: "+obra.getMintosDuracion()
		       +"\nEn "+this.getDomicilio()+", local de "+this.getMetros()+" metros, con "
		       +this.getAccesos()+" accesos.\nPrecio: "+this.getPrecio()+"€\n");
	}
	@Override
	public String verLocalidades() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String verLocalidadesOcupadas() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String venderLocalidad(int fila, int butaca, Espectador e) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String cancelarLocalidad(int fila, int butaca) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String consultarLocalidad(int fila, int butaca) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public double calcularRecaudacion() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
