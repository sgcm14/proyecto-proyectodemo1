package archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

	public static void main(String[] args) {
		
		FileReader in;
		try {
			in = new FileReader("C:\\datos\\data.csv");
			BufferedReader b = new BufferedReader(in);
			
			String contenido;
//			String contenido = b.readLine();
			
			while((contenido = b.readLine()) != null) {
//			while(contenido != null) {
				//contenido = 001;SAMMY;40000000;99555555;FEMENINO
				//0: 001
				//1: SAMMY
				//2: 40000000
				
				String e[] = contenido.split(";");
				String id = e[0];
				String nombre = e[1];
				
//				System.out.println(contenido);
				System.out.println(nombre);
//				contenido = b.readLine();
				
			}
			
			b.close();
			
		} catch (FileNotFoundException  e) {
			System.out.println("ERROR: archivo no existe");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
