package poo.herencia;

public class Prueba {

	public static void main(String[] args) {
		
		
		Cliente c1 = new Cliente();
		c1.setNombre("cliente1");
		c1.setCodigo("0001");
		c1.setApellido("ape2");
//		c1.ver();
//		c1.test();
		c1.show();
		
		Empleado e1 = new Empleado();
		e1.setNombre("empleado1");
		e1.setSueldo(9000);
//		e1.ver();
		
		Cliente c2 = new Cliente("abc", "def", "12345678", "AAAA");
		System.out.println(c1.toString());

	}

}
