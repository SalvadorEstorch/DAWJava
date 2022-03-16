
public class Espectador {
	private String nombre;
	private String tel;
	private int edad;
	
	//Constructores
	public Espectador() {
		this.nombre="";
		this.tel="";
		this.edad=0;
	}
	public Espectador(String nombre, String tel, int edad ) {
		this.nombre=nombre;
		this.tel=tel;
		this.edad=edad;
	}
	//Getters y Setters
	public void setNombre(String nom) {
		this.nombre=nom;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setTel(String tel) {
		this.tel=tel;
	}
	public String getTel() {
		return this.tel;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public int getEdad() {
		return this.edad;
	}
	@Override
	public String toString() {
		return "Espectador: "+"Nombre="+this.getNombre()+" Teléfono="+this.getTel()+" Edad"+this.getEdad();
	}
	
}
