package inicio;

public class For {

	public static void main(String[] args) {
		
		for(int i = 1; i<=20; i++) {
			
			//System.out.println(i);
			 if(i ==10) {
				break;
			}
		}
		
		for(int j = 20; j>0; j--) {
	//		System.out.println(j);
		}
//--------------------------------------------------------------------------------------		
		//*suma de los 20 primeros números pares
		double suma=0;
		for(int i = 1; i<=40; i++) {
			
			
			 if(i%2==0) {
				suma=suma+i;
	//			System.out.println(i);
			}
			 
		}
	//	System.out.println("La suma de los 20 numeros pares son: "+suma);
		
		System.out.println("--------------------------------------------");
//--------------------------------------------------------------------------------------			
		//*tabla de multiplicar
		double n=3,multiplica=0;
		for(int j = 1; j<=n; j++) {
			for(int i = 1; i<=12; i++) {
				multiplica=j*i;
				System.out.println(j +"  * "+i+" = "+multiplica);
			}
		}

	}

}
