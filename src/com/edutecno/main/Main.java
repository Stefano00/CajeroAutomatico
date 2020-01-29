package com.edutecno.main;
import java.util.Date;
import java.util.Scanner;
import com.edutecno.menu.Cliente;
import com.edutecno.menu.Cuenta;
import com.edutecno.menu.Menu;
import com.edutecno.menu.TarjetaDeCredito;
import com.edutecno.menu.Vendedor;

public class Main {

	public static void main(String[] args) {
		boolean acceso=false;
		Date fechacliente1 = new Date(92, 0, 7);	
		Date fechavendedor = new Date(88, 5, 18);
		Cliente clienteGenerico;
		Cuenta cuentagenerica;
		Vendedor vendedor1;
		TarjetaDeCredito tarjetadecredito;
		tarjetadecredito= TarjetaDeCredito("Santander", 52202058, 25000, 15000);
		cuentagenerica = CreandoCuenta("Santander", 67680391, 50000, 30000);
		vendedor1=CreandoVendedor("Pablo Orellana", fechavendedor, 999981473, "Magallanes 3630, San Joaquín" );
		clienteGenerico  = CreandoCliente("Stefano Marín", fechacliente1, 17953245, 3043, cuentagenerica, tarjetadecredito);
		acceso = Login(clienteGenerico);
		if(acceso==true) {
			
			Menu menu = new Menu();	
			menu.menu(clienteGenerico, vendedor1);
		}	
	}
	

	private static boolean Login(Cliente clienteGenerico) {
		try {
			boolean acceso=false;
			Date fechaactual = new Date(120, 0, 22);  //para sacar edad
			Scanner scan = new Scanner(System.in);
			System.out.println("Ingrese su rut sin dv, sin puntos ni guión");
			int rut=scan.nextInt();
			if(rut==clienteGenerico.getRut()) {
				System.out.println("Ingrese su contraseña de cuatro digitos");
				Integer pass=scan.nextInt();
				String passenstring = pass.toString();		
			
				if(pass==clienteGenerico.getPass() && passenstring.length()==4) {
					acceso=true;
					System.out.println("Bienvenido " + clienteGenerico.getNombre() + " ("+EdadClientes(fechaactual,clienteGenerico.getFechaNacimiento())+") Años");				
				}
				else {
					acceso=false;
					System.out.println("Contraseña inválida");
				}
			//	scan.close();
			}
			else {
				acceso=false;
				System.out.println("Rut inválido");
			}
			//scan.close();
			return(acceso);		
		}
		catch(Exception otraExcepcion){
			System.out.println("Error al ingresar, vuelva a intentarlo");
			return(false);
		}			
	}
	
	private static Cliente CreandoCliente(String nombre, Date fecha, int rut, int pass, Cuenta cuenta, TarjetaDeCredito tarjetadecredito) {
		Cliente cliente1 = new Cliente(nombre, fecha, rut, pass, cuenta, tarjetadecredito);	
		return cliente1;
	}
	
	private static Vendedor CreandoVendedor(String nombre, Date fecha, int telefono, String direccion) {
		Vendedor vendedor1 = new Vendedor(nombre, fecha, telefono, direccion);	
		return vendedor1;
	}
	
	private static Cuenta CreandoCuenta(String nombreBanco, int cuenta1, int saldo, int deuda) {
		Cuenta cuenta = new Cuenta(nombreBanco, cuenta1, saldo, deuda);	
		return cuenta;
	}
	
	private static TarjetaDeCredito TarjetaDeCredito(String nombreBanco, int cuenta1, int saldo, int deuda) {
		TarjetaDeCredito tarjetadecredito = new TarjetaDeCredito(nombreBanco, cuenta1, saldo, deuda);	
		return tarjetadecredito;
	}
	
	
	private static int EdadClientes(Date fechaactual, Date fechacliente) {
		// edad de cliente

		int edadcliente = (fechaactual.getYear()) - fechacliente.getYear();
		if (edadcliente == 18) {
			edadcliente = (fechaactual.getMonth()) - fechacliente.getMonth();
			if (edadcliente >= 0) {
				edadcliente = (fechaactual.getDay()) - fechacliente.getDay();
				if (edadcliente >= 0) {
					edadcliente = 18;
				} else {
					edadcliente = 17;
				}
			} else {
				edadcliente = 17;
			}
		}
		return (edadcliente);
	}

}
