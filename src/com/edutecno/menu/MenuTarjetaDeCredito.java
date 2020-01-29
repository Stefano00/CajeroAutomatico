package com.edutecno.menu;

import java.util.Scanner;

public class MenuTarjetaDeCredito {
	public void menutarjetadecredito(Cliente clientegenerico, TarjetaDeCredito tarjetadecredito) {
		Cliente cliente1 = new Cliente(clientegenerico.getNombre(), clientegenerico.getFechaNacimiento(), clientegenerico.getRut(), clientegenerico.getRut(), clientegenerico.getCuenta(), clientegenerico.getTarjetadecredito());
		TarjetaDeCredito cuenta1=clientegenerico.getTarjetadecredito();
		Scanner sc = new Scanner(System.in);
		int saldoactualizado=0;
		int menu=0;
		while(menu!=3) {
			System.out.println("--------------------------------------------");
	    	System.out.println("Tarjeta de crédito " +  cuenta1.getCuenta());	
	    	System.out.println("Saldo actual: " +  cuenta1.getSaldo()); //tarjeta de credito
	    	System.out.println("La deuda de su cuenta es: " + cuenta1.getDeuda());
	    	System.out.println("¿Qué desea hacer?");
			System.out.println("1- Pagar mi deuda completa");	
			System.out.println("2- Otro monto");
			System.out.println("3- Volver al Menú");
	    	System.out.println("--------------------------------------------");
	    	System.out.println("Eliga opción");
			menu=sc.nextInt();
			
			switch (menu) {
	        case 1:
	    		saldoactualizado=cuenta1.getSaldo()-cuenta1.getDeuda();
	        	cuenta1.setSaldo(saldoactualizado);
	        	cuenta1.setDeuda(0);
	        	System.out.println("Su deuda ha sido pagada, volviendo al menú de cuenta corriente");


	        break;
	        
	        case 2:
	        	System.out.println("Eliga monto");
				menu=sc.nextInt();			
	    		int montosolicitado=menu;
	    		if(montosolicitado<cuenta1.getSaldo()) {
	    			saldoactualizado=cuenta1.getSaldo()-montosolicitado;
	    			cuenta1.setSaldo(saldoactualizado);	
	    			cuenta1.setDeuda(cuenta1.getDeuda()-menu);
	    			System.out.println("Dinero retirado, volviendo al menú de cuenta corriente.");
	    			System.out.println("--------------------------------------------");		    	
	    		}
	        			   		
	        	        	       
	        break;
	        case 3:
	        	
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
