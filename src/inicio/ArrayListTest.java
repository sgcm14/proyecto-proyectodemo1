package inicio;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		if(lista.isEmpty()) {
			System.out.println("Está vacio");
		}
		
		lista.add("Perro");
		lista.add("Gato");
		lista.add("Pericote");
		lista.add("Loro");
		
		System.out.println(lista.get(1));
		System.out.println(lista.size());
		System.out.println("------------------");
		
		lista.remove(0);
		
		System.out.println(lista.get(1));
		System.out.println(lista.size());
		System.out.println("------------------");
		
		if(!lista.isEmpty()) {
			System.out.println("Se llenó");
		}
		
		for(String a : lista) {
			System.out.println(a);
		}
		
		

	}

}
