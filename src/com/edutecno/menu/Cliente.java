package com.edutecno.menu;
import java.util.Date;

public class Cliente {
	private String nombre;
	private Date fechaNacimiento= new Date();
	private int rut;
	private int pass;
	private Cuenta cuenta;
	private TarjetaDeCredito tarjetadecredito;
	
	public Cliente(String nombre, Date fechaNacimiento, int rut, int pass, Cuenta cuenta, TarjetaDeCredito tarjetadecredito){
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
		this.rut=rut; 	
		this.pass=pass;
		this.cuenta=cuenta;
		this.tarjetadecredito=tarjetadecredito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public TarjetaDeCredito getTarjetadecredito() {
		return tarjetadecredito;
	}

	public void setTarjetadecredito(TarjetaDeCredito tarjetadecredito) {
		this.tarjetadecredito = tarjetadecredito;
	}
	
	
	
}
