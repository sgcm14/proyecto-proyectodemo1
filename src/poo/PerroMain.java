package poo;

enum Color{
	BLANCO, NEGRO, BEIGE, MARRON
}

enum Dias{
	LUNES, MARTES, MIERCOLES
}
public class PerroMain {

	public static void main(String[] args) {
		 
		Perro perro1 = new Perro();
		Perro perro2 = new Perro();
		
		perro1.setNombre("Gordita");
		perro1.setEdad(2);
		perro1.setColor("Beige");
//		perro1.comer(perro1.getNombre());
		
		perro2.setNombre("Maylo");
		perro2.setEdad(3);
		perro2.setColor("Beige");
		
		perro1.comer(2);
		
		Perro perro3 = new Perro("Azul");
		System.out.println(perro3.getColor());
		
		
//		perro1.besar(perro2);
		
		Color color =Color.BEIGE;
		System.out.println(Color.BLANCO);
		
		if("BEIGE".equals(color.toString())) {
			System.out.println("verdadero");
		}else {
			System.out.println(color);
			System.out.println("falso");
		}
		
		switch (color) {
		case BEIGE:
			System.out.println("Gordita es beige");
			break;
		case NEGRO:
			System.out.println("Gordita es negrita");
			break;
		case BLANCO:
			System.out.println("Gordita es blanca");
			break;
		}
		
		//"Shitsu";
		
		String raza = Perro.RAZA;
		
		
		

	}

}
