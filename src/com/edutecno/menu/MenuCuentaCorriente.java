package com.edutecno.menu;

import java.util.Scanner;

public class MenuCuentaCorriente {
	
	public void menucuentacorriente(Cliente clientegenerico, Cuenta cuentagenerica) {
		Cliente cliente1 = new Cliente(clientegenerico.getNombre(), clientegenerico.getFechaNacimiento(), clientegenerico.getRut(), clientegenerico.getRut(), clientegenerico.getCuenta(), clientegenerico.getTarjetadecredito());
		Cuenta cuenta1=clientegenerico.getCuenta();
		Scanner sc = new Scanner(System.in);
		int saldoactualizado=0;
		int menu=0;
		while(menu!=1) {
			System.out.println("--------------------------------------------");
	    	System.out.println("Cuenta Corriente: " +  cliente1.getRut());	
	    	System.out.println("Saldo actual: " +  cuenta1.getSaldo());
	    	System.out.println("La deuda de su cuenta es: " + cuenta1.getDeuda());
	    	System.out.println("¿Qué desea hacer?");
			System.out.println("1- Volver al Menú");	
			System.out.println("2- Retirar dinero");
			System.out.println("3- Pagar mi deuda");
	    	System.out.println("--------------------------------------------");
	    	System.out.println("Eliga opción");
			menu=sc.nextInt();
			
			switch (menu) {
	        case 1:

	        break;

	        case 2:	
	        	System.out.println("Cuánto desea retirar ? (0 para cancelar)");	        	
			    menu=sc.nextInt();
			    int montosolicitado=menu;
			    if(montosolicitado<cuenta1.getSaldo()) {
			    	saldoactualizado=cuenta1.getSaldo()-montosolicitado;
			    	cuenta1.setSaldo(saldoactualizado);	
			    	System.out.println("Dinero retirado, volviendo al menú de cuenta corriente.");
			    	System.out.println("--------------------------------------------");		    	
			    }
			    		    
			    if(menu==0) {
			    	break;
			    }
	       
	        break;
	        
	        case 3:
	        	saldoactualizado=cuenta1.getSaldo()-cuenta1.getDeuda();
	        	cuenta1.setSaldo(saldoactualizado);
	        	cuenta1.setDeuda(0);
	        	System.out.println("Su deuda ha sido pagada, volviendo al menú de cuenta corriente");
	        	       
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
