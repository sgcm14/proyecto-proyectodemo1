package inicio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fechas {

	public static void main(String[] args) {
		
		
		Date fechaActual = new Date();
		/*
		System.out.println(fecha.getMonth()); //mes , inicia en 0
		System.out.println(fecha.getDate()); //dia
		System.out.println(fecha.getYear()+1900);
		*/
		//yyyy-mm-dd
		
		
		Calendar cal = Calendar.getInstance();
		
		int mes = cal.get(Calendar.MONTH);
		int anio = cal.get(Calendar.YEAR);
		
		
//		System.out.println(mes);
//		System.out.println(anio);
		
		//sumar, restar dias, mes, años
		
		cal.setTime(fechaActual);
		cal.add(Calendar.DAY_OF_YEAR,-7);
		int x = 9;
		String d = "asdasd";
		
//		cal.add(Calendar.YEAR, 5);
		Date nuevaFecha = cal.getTime();
		
		System.out.println(nuevaFecha);
		
		//formatear fechas
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String fechaFormateada = format.format(nuevaFecha);
		System.out.println(fechaFormateada);
		
		//TAREA: hacer un código que ingrese una fecha de nacimiento y devuelva la edad
		//Investigar convertir string a Date, le pasas String "28-08-1988" = Date()
		

	}

}
