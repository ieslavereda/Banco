package classes;

import java.time.LocalDate;

public class TarjetaDebito extends Tarjeta {

	private float cuota;
	
	public TarjetaDebito(long numero, LocalDate fechaCad, String titular, Cuenta cuenta) {
		super(numero, fechaCad, titular, cuenta);
		cuota=25;
	}
	
	public TarjetaDebito(long numero, LocalDate fechaCad, String titular, Cuenta cuenta,float cuota) {
		super(numero, fechaCad, titular, cuenta);
		this.cuota=cuota;
	}

}
