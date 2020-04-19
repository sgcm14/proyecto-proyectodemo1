package inicio;

public class Casting {
	
	public static void main(String[] args) {
		
		int n = 8;
		double d = n;
		
		System.out.println(n);
		System.out.println(d);
		
		System.out.println("-------------------");
		
		double precio = 15.9;
		int e = (int) precio;
		
		System.out.println(precio);
		System.out.println(e);
		
		System.out.println("-------------------");
		
		String cadena = "65";
		Integer ne;
		//int ne = (int) cadena;
		try {
			 ne = Integer.parseInt(cadena);
			} catch (Exception e2) {
			ne = 0;
		}
		
		
		System.out.println(ne);
		
		System.out.println("-------------------");
		
		int n2 = 199;
		String cad2 = String.valueOf(n2);
		System.out.println(cad2.length());
		
	}

}
