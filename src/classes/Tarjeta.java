package classes;

import java.time.LocalDate;

public abstract class Tarjeta {
	
	private long numero;
	private LocalDate fechaCad;
	private String titular;
	private Cuenta cuenta;
	private int PIN;
	
	public Tarjeta(long numero, LocalDate fechaCad, String titular, Cuenta cuenta) {
		super();
		this.numero = numero;
		this.fechaCad = fechaCad;
		this.titular = titular;
		this.cuenta = cuenta;
		PIN = (int)(Math.random()*10000);
	}
	
	public boolean pagoDebito(float cantidad ) {
		
		return cuenta.pagar(cantidad);
		
	}
	
	

}
