package tareas;

import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;

public class FechaNac {
	
	public static void main(String[] args) {
		
		/*
        DateFormat dfDefault = DateFormat.getInstance();
        System.out.println("getInstance()=" + dfDefault.format(fecha));
        
        DateFormat dfDateInstance = DateFormat.getDateInstance();
        System.out.println("getDateInstance()=" + dfDateInstance.format(fecha));
        
        DateFormat dfDateShort = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("getDateInstance(DateFormat.SHORT)=" + dfDateShort.format(fecha));
        
        DateFormat dfDateMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("getDateInstance(DateFormat.MEDIUM)=" + dfDateMedium.format(fecha));
        
        DateFormat dfDateLong = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("getDateInstance(DateFormat.LONG)=" + dfDateLong.format(fecha));
        
        DateFormat dfDateFull = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("getDateInstance(DateFormat.FULL)=" + dfDateFull.format(fecha));
        */
		int edad=0,dn=0,mn=0,an=0,da=0,ma=0,aa=0;
		String fa="";
		String fechanac="";
		
		Date fechaactual = new Date();
		DateFormat dfDateMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
		fa=dfDateMedium.format(fechaactual);
		String dia = fa.substring(0,2);
		String mes = fa.substring(3,5);
		String anio = fa.substring(6,10);
		
		da = Integer.parseInt(dia);
		ma = Integer.parseInt(mes);
		aa = Integer.parseInt(anio);
		/*---------------------------------------------------------------------*/

        Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la fecha de su nacimiento (dd/MM/yyyy): ");
		fechanac = sc.next();
		String dian = fechanac.substring(0,2);
		String mesn = fechanac.substring(3,5);
		String anion = fechanac.substring(6,10);
		
		dn = Integer.parseInt(dian);
		mn = Integer.parseInt(mesn);
		an = Integer.parseInt(anion);
		//28-08-1988 //2020-1988=32-1
		//01-02-1990
		
		if(ma>mn || (ma==mn && da>=dn)){
			edad=aa-an;			
		}
		else {
			edad=(aa-an)-1;	
		}

		
        
       try {
            Date fecha = dfDateMedium.parse(fechanac);
            System.out.println("Su fecha de Nacimiento es: " + dfDateMedium.format(fecha));
            System.out.println("Usted tiene "+edad+" años.");
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
		
        
	}
}
