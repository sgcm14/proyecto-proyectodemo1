package inicio;

public class Arrays {

	public static void main(String[] args) {
		
		//tipo[] nombre = tamaño del array
		//[0][1][2][3]
		
		
		String perros = "Gordita";
		
		String[] perritos = {"Oso","Maylon","Gordita","Dukesa","Mota","Killer","Puka","Muñeca"};
		
//		System.out.println(perritos[0]);
//		System.out.println(perritos[4]);
//		System.out.println(perritos[8]);
		
		for (int i = 0; i < perritos.length; i++) {
//			System.out.println(perritos[i]);
		}
		
		//foreach
		for(String p : perritos) {
//			System.out.println(p);
		}
		
		String[] a1 = new String[2];
		
		a1[0] = "Sammy";
		a1[1] = "Ruben";
//		a1[2] = "Yana";
		
		int[] a2 = new int[5];
		
		//System.out.println(a2.length);
		
		for(int j = 0; j<a2.length; j++) {
			
			int v = 100 + j;
			a2[j] = v;
			
		}
		
		for(int x : a2) {
			System.out.println(x);
		}
		

	}

}
