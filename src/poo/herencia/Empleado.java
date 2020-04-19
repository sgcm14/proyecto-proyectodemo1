package poo.herencia;

public class Empleado extends Persona{
	
	
	private String tipoContrato;
	private double sueldo;
	
	public Empleado(String nombre, String apellido, String dni, double sueldo) {
		super(nombre, apellido, dni);
		this.sueldo = sueldo;
	}
	
	public Empleado() {
		
	}
	
	public void ver() {
		 System.out.println("Sueldo: "+this.sueldo);
	 }
	
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	

}
