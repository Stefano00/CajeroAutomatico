package com.edutecno.menu;

import java.util.Date;

public class Vendedor {
	private String nombre;
	private Date fechaNacimiento= new Date();
	private int telefono;
	private String direccion;
	
	public Vendedor(String nombre, Date fechaNacimiento, int telefono, String direccion){
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
		this.telefono=telefono; 	
		this.direccion=direccion;
		
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono
				+ ", direccion=" + direccion + "]";
	}
	
	
	

}
