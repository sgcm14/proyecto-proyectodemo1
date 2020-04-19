package poo.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excepciones {
	
	static String cadena;
	static int nn;

	public static void main(String[] args) {
		
		//tipos de excepciones: checked y unchecked
		
		//unchecked
		try {
			
			int x = 5/1; 
			
			System.out.println(cadena.length());
			System.out.println(nn);
			
			
		}catch (ArithmeticException e) {
			System.out.println("Error division");
		}catch (NullPointerException e) {
			System.out.println("Nulo");
//			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("No sirve");
		}finally {
			//generalmente se usa para cerrar recursos
			//una conexion de BD, .close();
			System.out.println("Finally");
		}
		
		
		try {
			int arr[] = new int[3];
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error indice");
		}
		
		
		
		
		
		//checked
		try {
			
			File f = new File("C:/sadasd");
			Scanner sc = new Scanner(f);
			
		} catch (FileNotFoundException e) {			
			//e.printStackTrace();
			System.out.println("Archivo no existe");
		}
		
		System.out.println("FIN");

	}

}
