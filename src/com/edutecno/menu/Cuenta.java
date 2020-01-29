package com.edutecno.menu;

import java.util.Date;

public class Cuenta {
	private String nombreBanco;
	private int cuenta;
	private int saldo;
	private int deuda;
	
	
	public Cuenta(String nombreBanco, int cuenta, int saldo, int deuda){
		this.nombreBanco=nombreBanco;
		this.cuenta=cuenta;
		this.saldo=saldo; 	
		this.deuda=deuda;
	}


	public String getNombreBanco() {
		return nombreBanco;
	}


	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}


	public int getCuenta() {
		return cuenta;
	}


	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public int getDeuda() {
		return deuda;
	}


	public void setDeuda(int deuda) {
		this.deuda = deuda;
	}

	
	

}
