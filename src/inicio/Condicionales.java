package inicio;

public class Condicionales {
	
	//psvm netbeans, main: eclipse
	
	public static void main(String[] args) {
		
		int a = 100;
		int b = 99;
		int mayor;
		
		if( a > b) {
			mayor = a;
		}else {
			mayor = b;
		}
		
//		System.out.println("El mayor es: " + mayor);
		
		int n1 = 5;
		
		// % 
		if(n1 % 2 == 0) {
//			System.out.println("es par");
		}else {
//			System.out.println("IMPAR");
		}
		
		int s = 1 + 2 ; //3
		
		String mensaje = (n1 % 2 == 0) ? "PAR" : "IMPAR";
//		System.out.println(mensaje);
		
		
		int mes = 70;
		String nombreMes = "";
		
		switch (mes) {
		case 1:
			nombreMes = "ENERO";
			break;
		case 2:
			nombreMes = "FEBRERO";
			break;
		case 7:
			nombreMes = "JULIO";
			break;

		}
		
		System.out.println("El mes es: " + nombreMes);
		
		
	}
		

}
