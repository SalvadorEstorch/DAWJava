
public class Garaje {
	private String domicilio;
	private Coche[] plazas;
	
	//Constructors
	public Garaje() {
		this.domicilio="";
		this.plazas=new Coche[20];
	}
	public Garaje(String domicilio) {
		this.domicilio=domicilio;
		this.plazas=new Coche[20];
	}
	
	//Getters and Setters
	public void setDomicilio(String domi) {
		this.domicilio=domi;
	}
	public String getDomiciolio() {
		return this.domicilio;
	}
	
	//toString
	public String verGaraje() {
		String texto="El garaje con domicilio en "+this.getDomiciolio()+" tiene las siguientes plazas";
		texto=texto.concat("\n");
		for (int i=0; i<20; i++) {
			texto=texto.concat(" Plaza nº "+i+": ");
			String estado=(this.plazas[i]==null) ? "Libre" : this.plazas[i].verCoche();
			estado=estado.concat("\n");
			texto=texto.concat(estado);
		}
		return texto;
	}
	
	public int aparcar(Coche coche) {
		int i=0;
		while (!(this.plazas[i]==null)) {
			i++;
		}
		if (i<20) {
			this.plazas[i] = coche;
			return i;
		}
		else {
			return -1;
		}
	}
	
	public Coche desaparcar(int numeroPlaza) {
		if (this.plazas[numeroPlaza] == null) {
			return null;
		}
		else {
			Coche c=this.plazas[numeroPlaza];
			this.plazas[numeroPlaza] = null;
			return c;
		}
	}
		
}
	