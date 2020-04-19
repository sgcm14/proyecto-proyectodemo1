package inicio;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(i<=20) {
			
//			System.out.println("Sammy "+i);
			i++;
			
		}
		
		String nombreOk = "Sammy";
		String nombre = "";
		
		while(!nombre.equals(nombreOk)) {
			System.out.print("Ingresa el nombre: ");
			Scanner sc = new Scanner(System.in);
			nombre = sc.next();
			if(!nombre.equals(nombreOk))
			System.out.println("Nombre incorrecto");
		}
		
		System.out.println("Bienvenida Sammy");

	}

}
