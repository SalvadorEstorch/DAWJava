package com.itt.libreria;

public class Libro {
	private String titulo;
	private String genero;
	/*Ademas de los atributos propios declaro uno de tipo Autor para poder
	 * luego aceder al autor desde la clase Libro*/
	private Autor autor; 
	
	//Constructores
	public Libro() {
		this.titulo="";
		this.genero="";
		/*Para inicilizar el Autor que no es una variable sino un objeto
		 *  tengo que llamar a su constructor*/
		this.autor=new Autor("","");	
	}
	public Libro(String tit, String gen, Autor aut) {
		this.titulo=tit;
		this.genero=gen;
		this.autor=aut;
	}
	
	//Getters y setters
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
	/*También necesito getters y setters para modificar o acceder atributos
	 * y métodos del objeto Autor desde Libro*/
	public void setAutor(Autor aut) {
		this.autor=aut;
	}
	public Autor getAutor() {
		return this.autor;
	}
	/*Redefino el método toString que viene de la clase Object*/
	@Override
	public String toString() {
		return "Libro [titulo= " + this.getTitulo() + ", genero= " + this.getGenero() + "] " + this.getAutor().toString();
	}
}
