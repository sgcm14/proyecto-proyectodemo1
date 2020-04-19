package inicio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		String mensaje="";
		boolean error = false;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("====CALCULADORA====");
		
		System.out.println("Ingresa el primer número");
		
		double a = in.nextDouble();
		
		System.out.println("Ingresa el segundo número");
		
		double b = in.nextDouble();
		
		System.out.println("OPERACIÓN");
		System.out.println("(+) Sumar");
		System.out.println("(-) Restar");
		System.out.println("(*) Multiplicar");
		System.out.println("(/) Dividir");
		
		String operador = in.next();
		
		double resultado = 0;
		
		switch (operador) {
		case "+":
			resultado = a + b;

			break;
		case "-":
			resultado = a - b;

			break;
		case "*":
			resultado = a * b;

			break;
		case "/":
			if (b==0) {
				error = true;
				mensaje="NO SE PUEDE DIVIDIR ENTRE 0";
			}  
			else {
			resultado = a / b;

			}
			break;
			
			
		default:
			error = true;
			mensaje = "OPERADOR NO EXISTE!!";
			break;
		}
		
		//validacion del flag
		if(!error) {
			mensaje = "Resultado " + a + operador + b + " = " + resultado;
		}
		
		
		System.out.println(mensaje);
		
		

	}

}
