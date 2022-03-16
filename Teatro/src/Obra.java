
public class Obra {
	private String titulo;
	private String genero;
	private int minutosDuracion;
	
	//Constructores
	public Obra() {
		
	}
	public Obra(String tit,String gen,int minDu) {
		this.titulo=tit;
		this.genero=gen;
		this.minutosDuracion=minDu;
	}
	//Getters and setters
	public void setTitulo(String tit) {
		this.titulo=tit;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public void setGenero(String gen) {
		this.genero=gen;
	}
	public String getGenero() {
		return this.genero;
	}
	public void setMinutosDuracion(int minDu) {
		this.minutosDuracion=minDu;
	}
	public int getMintosDuracion() {
		return this.minutosDuracion;
	}
}
