package archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class LeeryEscribir {
	
	
	
	
	
	public void listar() {
		
		List<String> palabras = leerArchivo();
		
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
		
	}
	
	public boolean yaExiste(String buscar) {
		
		boolean yaEsta = false;
		List<String> palabras = leerArchivo();
		
		for (String palabra : palabras) {
			if(palabra.equalsIgnoreCase(buscar)) {
				yaEsta = true;
				break;
			}
		}
		
		return yaEsta;
	}
	
	public List<String> leerArchivo(){
		String contenido="";
		FileReader in;
		BufferedReader b;
		List<String> palabras = new ArrayList<String>();
		try {
			in = new FileReader("C:\\datos\\nuevo2.txt");
			b = new BufferedReader(in);
			
			while((contenido = b.readLine()) != null) {
				
				palabras.add(contenido);
			}
			
			b.close();
			
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return palabras;	
		
	}
	
	public static void main(String[] args) {
		
		FileWriter f=null;
		PrintWriter p=null;
		String cadena="";
		
		try {
			
			
			f = new FileWriter("C:\\datos\\nuevo2.txt",true);
			p = new PrintWriter(f);
			
			LeeryEscribir ca=new LeeryEscribir();
			ca.listar();
			Scanner sc= new Scanner(System.in);
			System.out.println();
			do
			{	
				System.out.print("Ingrese texto a añadir: ");							
				cadena = sc.next();//texto que se guardará
				
				//aqui se debe validar cadena, si ya existe en el archivo mostrar mensaje de error
				if(ca.yaExiste(cadena)) {
					System.out.println("ERROR: El pais ya existe!!");
					sc.reset();
					
				}else {					
					
					if(!cadena.equalsIgnoreCase("FIN")) {
						p.println(cadena);
						p.flush();						
						System.out.println("----------");						
						System.out.println("Lista: ");
						System.out.println("----------");					
						ca.listar();
					}
					
				}
				
				//si tecleo FIN, sale del bucle y ya no pide q ingrese texto
			}while(!cadena.equalsIgnoreCase("FIN"));
			
			
			
					
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			p.close();
			
		}
		
		//TAREA: ingresar por consola texto y que se agreggue a un txt (append) y validar q no exista el elemento
		//ejem: ingresar una lista de paises (PERU,CHILE,ECUADOR---PERU(ERROR))
		
		
	}

}
