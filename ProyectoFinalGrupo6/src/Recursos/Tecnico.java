package Recursos;

public class Tecnico extends Persona{

	private String area;

	public Tecnico(String id, boolean status, String nombre, int edad, String sexo, int telefono, String direccion,
			String area) {
		super(id, nombre, edad, sexo, telefono, direccion);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}


	}
	
	

