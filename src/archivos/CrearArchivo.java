package archivos;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class CrearArchivo {

	public static void main(String[] args) {

		FileWriter f=null;
		PrintWriter p=null;
		String cadena="";
		
		
		try {
						
			f = new FileWriter("C:\\datos\\nuevo.txt",true);
			p = new PrintWriter(f);
			
			
			System.out.println("Ingrese texto a añadir: ");
			Scanner sc= new Scanner(System.in);
				
			cadena = sc.next();//texto que se guardará
			
			p.println(cadena);
			p.flush();
			
			System.out.println("SE MODIFICO");

			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			p.close();
			
		}
		
	}

}
