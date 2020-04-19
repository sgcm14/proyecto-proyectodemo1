package poo.excepciones;

public class LanzarThrows {

	public static void main(String[] args) throws Exception {
		
		String nrocwfp = "L123";
		
		int r = 3-1;
		
		if(r == 0) {
			
			throw new Exception();
			
		}
		
		
		System.out.println("FIN");
		

	}
	
	public void calcular() {
		
		Test t = new Test();
		
		try {
			
			t.metodoSeguro();
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
