package inicio;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		String[] nombres = new String[4];
		double[] notas = new double[4];
		double sumatoria=0;
		
		for (int i = 0; i < nombres.length; i++) {
			Scanner sc = new Scanner(System.in);
			int c = i+1;
			System.out.print("Alumno "+c+": ");
			nombres[i] = sc.next();
			System.out.print("Nota "+c+": ");
			notas[i] = sc.nextDouble();
			sumatoria=sumatoria+notas[i];
		}
		
		//----------------------
		//El promedio de notas es: 999
		System.out.println("El promedio de las notas es: "+ sumatoria/nombres.length);
		

	}

}
