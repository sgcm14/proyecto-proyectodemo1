package tareas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 
 * @author sgcm14
 * 
 * Calcular la edad dada una fecha de nac. Java 8
 */
public class NewFecha {

	public static void main(String[] args) {
		
//		NewFecha nf = new NewFecha();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese su fecha de nacimiento: ");
		String fecNac = sc.next();
		int edad = getEdad(fecNac);
		System.out.println(edad);

	}
	

	public static int getEdad(String fecNac) {
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fNac = LocalDate.parse(fecNac,f);
		LocalDate ahora = LocalDate.now();
		
		Period per = Period.between(fNac, ahora);
		
//		System.out.println(ahora);
		return per.getYears();
	}
	

}
