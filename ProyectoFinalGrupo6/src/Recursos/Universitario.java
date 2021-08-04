package Recursos;

public class Universitario extends Persona{

	private String titulo;


	public Universitario(String id, String nombre, String sexo, String telefono, String provincia, String direccion,
			int edad, String titulo) {
		super(id, nombre, sexo, telefono, provincia, direccion, edad);
		this.titulo = titulo;
	}


	public String getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
}
