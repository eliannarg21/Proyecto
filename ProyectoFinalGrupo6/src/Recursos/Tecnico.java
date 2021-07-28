package Recursos;

public class Tecnico extends Persona{

	private String area;

	public Tecnico(String id, String nombre, int edad, String sexo, String telefono, String direccion,
			String provincia, String area) {
		super(id, nombre, edad, sexo, telefono, direccion, provincia);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}


	}
	
	

