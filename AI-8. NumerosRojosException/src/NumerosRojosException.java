/*Las excepciones son objetos y por tanto para crear una hay que crear sus atributos,
 * constructores, getters y setters, métodos.
 */
public class NumerosRojosException extends Exception {
	private String argumento;
	
	//Constructores
	public NumerosRojosException() {
		this.argumento="";
	}
	public NumerosRojosException(String arg) {
		this.argumento=arg;
	}
	
	//Getters y Setters
	public void setArgumento(String arg) {
		this.argumento=arg;
	}
	public String getArgumento() {
		return this.argumento;
	}
	
}
