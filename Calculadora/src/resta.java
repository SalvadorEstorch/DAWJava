
public class resta {
	/* 
	 * @author jairo.porras
	 *
	 */

	    /** 
	     * Método para hacer la resta de dos números reales
	     * @param num1 entrada primer número real a restar
	     * @param num2 entrada segundo número real a restar
	     * @return resultado real resta entre los dos números reales introducidos
	     * 
	     */
	    public float resta2Reales(float num1,float num2) {
	        float restaReal=num1-num2;
	        return restaReal;
	    }

	    /**
	     * Método para hacer la resta de dos números enteros
	     * @param num1 entrada primer número entero a restar
	     * @param num2 entrada segundo número entero a restar
	     * @return resultado entero de la resta entre los dos números enteros introducidos
	     * 
	     */
	    public float restaEnteros(int num1,int num2) {
	        int restaEntero=num1-num2;
	        return restaEntero;
	    }

	    /**
	     * Método para hacer la resta de tres números reales
	     * @param num1 entrada primer número real a restar
	     * @param num2 entrada segundo número real a restar
	     * @param num3 entrada tercer número real a restar
	     * @return resultado real resta entre los dos números reales introducidos
	     * 
	     */
	    public float resta3Reales(float num1,float num2,float num3) {
	        float restaReal=num1-num2-num3;
	        return restaReal;
	    }

	    /**
	     * Método para hacer la resta con un valor acumulado
	     * @param num valor de entrada que se acumula
	     * @return acumulador resultado de la resta de los valores acumulados
	     * 
	     */
	    public float restaAcum(int num) {
	        int acumulador=0;
	        acumulador=acumulador+num;
	        return acumulador;
	    }
}

