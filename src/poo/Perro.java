package poo;

public class Perro {
	
	private String nombre;
	private int edad;
	private String color = "";
	public final static String RAZA = "shitzut";
	
	//constructor
	public Perro() {
		this.color = "NEGRO";
	}
	
	public Perro(String color) {
//		this.color = color;
		this.nombre = color;
	}
	
	//m�todos
	public void comer(String nombre) {
//		System.out.println(this.nombre);
		System.out.println(nombre + " est� comiendo...");
	}
	
	public void comer(int cantidad) {
		System.out.println(nombre + " est� comiendo..."+cantidad);
	}
	
	public void besar(Perro perroBesador) {
		System.out.println(this.nombre+" est� corriendo con la: "+perroBesador.getNombre());
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		
		if(edad <= 0 || edad > 20) {
			System.out.println("ERROR: EDAD NO V�LIDA!");
		}else {
			this.edad = edad;
		}
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
