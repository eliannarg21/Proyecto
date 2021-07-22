package Recursos;

public class Tecnico extends Persona{

	private String area;

	public Tecnico(String id, boolean status, String nombre, int edad, String sexo, String telefono, String direccion,
			String area) {
		super(id, status, nombre, edad, sexo, telefono, direccion);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	}

