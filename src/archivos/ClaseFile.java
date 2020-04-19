package archivos;

import java.io.File;

public class ClaseFile {

	public static void main(String[] args) {
		
		//RUTAS ABOSULTAS: rutas completas : C:/Program files/java/file.exe
		//RUTAS RELATIVAS: desde la raiz del proyecto (carpeta actual) /imagenes/icon.png
		
		File file = new File("C:\\datos\\archivos\\cheque.xls");
		
		if(file.exists()) {
			
			System.out.println("El archivo existe: "+file.getName());
			
			
			if(file.isFile()) {
				System.out.println("Es un archivo");
			}else if(file.isDirectory()){
				System.out.println("Es una carpeta");
			}
			
			System.out.println("Tamaño archivo: "+file.length());
			
		}else {
			System.out.println("El archivo NO existe!!");
		}
		
		System.out.println("---------------------------");
		
		//imprime contenido de la carpeta
		File carpeta = new File("C:\\datos\\archivos");
		
		String[] nombres = carpeta.list();
		
		for (String n : nombres) {
			String nn = n.replace(".xls", "");
			System.out.println(nn);
		}
		
		
		

	}

}
