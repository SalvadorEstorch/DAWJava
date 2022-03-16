
public class Local {
	private String domicilio;
	private int metros;
	private int accesos;
	
	//Consturctores
	public Local(){
		
	}
	public Local(String domi, int metros, int acc) {
		this.domicilio=domi;
		this.metros=metros;
		this.accesos=acc;
	}
	//Getters and Setters
	public void setDomicilio(String domi) {
		this.domicilio=domi;
	}
	public String getDomicilio() {
		return this.domicilio;
	}
	public void setMetros(int metros) {
		this.metros=metros;
	}
	public int getMetros() {
		return this.metros;
	}
	public void setAccesos(int acc) {
		this.accesos=acc;
	}
	public int getAccesos() {
		return this.accesos;
	}
	@Override
	public String toString() {
		return "Local [Domicilio="+this.getDomicilio()+" Metros="+this.getMetros()+" Accessos"+this.getAccesos()+"]";
	}
}
