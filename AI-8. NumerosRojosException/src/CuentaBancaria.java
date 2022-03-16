import java.util.ArrayList;

public class CuentaBancaria {
	private int numeroCuenta;
    private String cliente;
    private double saldo;
    private ArrayList<Movimiento> movimientos;
    
    public CuentaBancaria(int numeroCuenta, String cliente) {
    	this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = 0;
        this.movimientos = new ArrayList();
    }
    public void agregarMovimiento(String concepto, double cantidad) throws NumerosRojosException {
    	if(cantidad < -this.saldo && cantidad < 0) {
    		NumerosRojosException n=new NumerosRojosException("No puedes sacar más dinero del que tienes");
            throw n;
        }
    	else {
    		this.saldo = this.saldo + cantidad;
            this.movimientos.add(new Movimiento(concepto, cantidad,saldo));
        }
    }

    @Override
    public String toString() {
    	return "Número=" + numeroCuenta + ", Cliente=" + cliente + ",Saldo=" + saldo;
    }
    public String listarMovimientos() {
    	String listado = "";
    	for (Movimiento mov : this.movimientos) {
    		listado = listado + mov.toString()+"\n";
        }                          
        return listado;
    }

}