
public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	
	//Constructores
	public Coche() {
		this.matricula="";
		this.marca="";
		this.modelo="";
	}
	public Coche(String matricula, String marca, String modelo) {
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
	}
	
	//Getters y Setters
	public void setMatricula(String matricula) {
		this.matricula=matricula;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	
	//Ver coche
	public String verCoche() {
		return "Matricula: "+this.getMatricula()+" Marca: "+this.getMarca()+" Modelo: "+this.getModelo();
	}
}
