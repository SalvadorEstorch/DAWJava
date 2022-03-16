package com.itt.libreria;

public class Autor {
	private String nombre;
	private String biografia;
	
	//Constructores
	public Autor() { 
		this.nombre="";
		this.biografia="";
	}
	public Autor(String nom, String bio) {
		this.nombre=nom;
		this.biografia=bio;
	}
	
	//Getters y setters
	public void setNombre(String nom) {
		this.nombre=nom;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setBiogrfia(String bio) {
		this.biografia=bio;
	}
	public String getBiografia() {
		return this.biografia;
    }	
	
	
	/*Redefino el método toString que viene de la clase Object*/
	@Override
	public String toString() {
		return "Autor [nombre=" + this.getNombre() + ", biografia=" + this.getBiografia() + "]";
	}
}
