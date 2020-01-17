package classes;

public class Cuenta {
	
	private long numero;
	private float saldo;
	
	public Cuenta(long numero) {
		
		this.numero = numero;
	}
	
	public boolean ingresar(float cantidad) {
		if (cantidad>0) {
			saldo+=cantidad;
			return true;
		}
		return false;
	}
	public boolean pagar(float cantidad) {
		if (cantidad>0 && cantidad<=saldo) {
			saldo-=cantidad;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	
}
