package ArrayListExamples;

public class Triangulo {
	private float lado1;
	private float lado2;
	private float lado3;
	//Constructores
	public Triangulo() {
		this.lado1='0';
		this.lado2='0';
		this.lado3='0';
	}
	public Triangulo(float lado1, float lado2, float lado3) {
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	
	//Getters and Setters
	public void setLado1(float lado1) {
		this.lado1=lado1;
	}
	public float getLado1() {
		return this.lado1;
	}
	public void setLado2(float lado2) {
		this.lado2=lado2;
	}
	public float getLado2() {
		return this.lado2;
	}
	public void setLado3(float lado3) {
		this.lado3=lado3;
	}
	public float getLado3() {
		return this.lado3;
	}
	@Override
	public String toString() {
		return "Triangulo: "+"Lado1="+this.getLado1()+" Lado2="+this.getLado2()+" Lado3="+this.getLado3();
	}
	public String tipo() {
		if (this.getLado1()==this.getLado2() && this.getLado2()==this.getLado3()) {
			return "Equilatero";
		} else if (this.getLado1()==this.getLado2() || this.getLado1()==this.getLado3()
				|| this.getLado2()==this.getLado3()) {
			return "Isosceles";
		} else {
			return "Escaleno";
		}
		
	}
}
