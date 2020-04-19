package poo.herencia;

public class Cliente extends Persona{
	
	 private String categoria;
	 private String codigo;
	 public String var1;
	 protected String var2;
	 int edad = 20;
	 

	public Cliente(String nombre, String apellido, String dni, String codigo) {
		super(nombre, apellido, dni);
		this.codigo = codigo;
	}
	
	public Cliente() {
		
	}
	
	public void show() {
		super.mensaje();
		mensaje();
		
	}
	
	public void mensaje() {
		System.out.println("Mensaje del cliente");
	}
	
	public void test() {
		System.out.println("edad persona: "+ super.edad);
	}

	public void ver() {
		 System.out.println("Codigo: "+this.codigo);
	 }
	 
	 
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		
		if(this.getApellido() == null) {
			
			return "Apellido no debe ser nulo";
			
		}else {
			
			return "Cliente [categoria=" + categoria + ", codigo=" + codigo + ", nombre=" + getNombre()
			+ ", apellido=" + getApellido() + "]";
			
		}
		
		
	}
	 
	 
	

}
