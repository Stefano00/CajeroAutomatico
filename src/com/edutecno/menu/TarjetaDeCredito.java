package com.edutecno.menu;

import java.util.Date;

public class TarjetaDeCredito extends Cuenta {
	private int saldotarjeta;
	private int deudatarjeta;
	
	public TarjetaDeCredito(String nombreBanco, int cuenta, int saldo, int deuda){
		super(nombreBanco, cuenta, saldo, deuda);
		this.saldotarjeta=saldotarjeta;
		this.deudatarjeta=deudatarjeta;
	}

	public int getSaldotarjeta() {
		return saldotarjeta;
	}

	public void setSaldotarjeta(int saldotarjeta) {
		this.saldotarjeta = saldotarjeta;
	}

	public int getDeudatarjeta() {
		return deudatarjeta;
	}

	public void setDeudatarjeta(int deudatarjeta) {
		this.deudatarjeta = deudatarjeta;
	}
	

	

}
