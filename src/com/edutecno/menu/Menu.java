package com.edutecno.menu;
import com.edutecno.menu.Cliente;
import com.edutecno.menu.Cuenta;
import java.util.Date;
import java.util.Scanner;

public class Menu {
	
	public void menu(Cliente clientegenerico, Vendedor vendedor1) {
		Vendedor vendedor = new Vendedor(vendedor1.getNombre(), vendedor1.getFechaNacimiento(), vendedor1.getTelefono(), vendedor1.getDireccion());
		Cliente cliente1 = new Cliente(clientegenerico.getNombre(), clientegenerico.getFechaNacimiento(), clientegenerico.getRut(), clientegenerico.getPass(), clientegenerico.getCuenta(), clientegenerico.getTarjetadecredito());
		Cuenta cuenta1=clientegenerico.getCuenta();
		TarjetaDeCredito tarjetadecredito = clientegenerico.getTarjetadecredito();
		Scanner sc = new Scanner(System.in);
		int menu=0;
		while(menu!=4) {
			System.out.println("¿Qué desea hacer?");
			System.out.println("1- Menu Cuenta Corriente");	
			System.out.println("2- Menu Tarjeta de Credito");
			System.out.println("3- Ver datos de mi ejecutivo");
			System.out.println("4- Salir");
			System.out.println("Eliga opción");
			menu=sc.nextInt();
		    switch (menu) {
	        case 1:
	        	MenuCuentaCorriente cuentacorriente = new MenuCuentaCorriente();
	        	cuentacorriente.menucuentacorriente(cliente1,cuenta1);

	        break;

	        case 2:
	        	MenuTarjetaDeCredito menutarjetadecredito = new MenuTarjetaDeCredito();
	        	menutarjetadecredito.menutarjetadecredito(cliente1, tarjetadecredito);
	        break;
	        
	        case 3:
	        	System.out.println("--------------------------------------------");
	        	System.out.println("Datos de tu ejecutivo:");
	        	System.out.println(vendedor1.toString());   // uso de toString();
	        	System.out.println("Volviendo al menú principal:"); 
	        	System.out.println("--------------------------------------------");
	               	
	        break;
	        
	        case 4:
	        	System.out.println("--------------------------------------------");
	        	System.out.println("Salir del programa");
	        	System.out.println("--------------------------------------------");
	        break;

	        default:
	        	System.out.println("--------------------------------------------");
	        	System.out.println("Opción invalida, vuelva a intentarlo");
	        	System.out.println("--------------------------------------------");

	        break;
			}
		    		
		}	
	}		
}
