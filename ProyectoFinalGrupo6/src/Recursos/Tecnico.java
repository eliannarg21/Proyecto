package Recursos;

public class Tecnico extends Persona{

	private String area;

	public Tecnico(String nombre, String telefono, String id, String direccion, int edad, String sexo, String sexo2,
			String provincia, String area) {
		super(nombre, telefono, id, direccion, edad, sexo, sexo2, provincia);
		this.area = area;
	}







	public String getArea() {
		// TODO Auto-generated method stub
		return null;
	}

}