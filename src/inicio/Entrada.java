package inicio;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre");
		
		String nombre = in.next();
		
		System.out.println("Ingresa tu edad");
		
		int edad = in.nextInt();
		
		System.out.println("Tu te llamas: " + nombre + ", tu edad es: " + edad);
		
		
	}

}
