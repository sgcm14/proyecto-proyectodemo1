package inicio;

public class Cadenas {

	public static void main(String[] args) {
		
		String cadena = "Hola mundo";
		String cadena2 = "Adios";
		String cadena3 = "MAYUSC";
		
		String resultado = cadena + " " + cadena2;
		
//		System.out.println(resultado);
		
		//tamaño
		
		int tamanio = cadena.length();
//		System.out.println("tamaño: "+tamanio);
		
		//comparar
		
		if(!cadena.equals(cadena2)) {
//			System.out.println("NO son iguales");
		}else {
//			System.out.println("son iguales");
		}
		
		//a mayusq
//		System.out.println(cadena.toUpperCase());
		
		//a minusq
//		System.out.println(cadena3.toLowerCase());
		
		//verificar si existe
		String texto = "Hace calor";
		
		boolean hay = texto.contains("x");
//		System.out.println("hay: " + hay);
		
		//reemplazar
		
		String otro = texto.replace("calor", "frio");
//		System.out.println("otro: "+otro);
		
		//extraer
		
		//TAREA
		//miarchivo.pdf/.jpg/.xls
		
//		String recorte = texto.substring(1,4);
		String recorte = texto.substring(7,10);
		System.out.println(recorte);
		

	}

}
