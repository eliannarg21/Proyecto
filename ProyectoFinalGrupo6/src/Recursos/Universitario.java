package Recursos;

public class Universitario extends Persona{

	private String titulo;

	public Universitario(String id, boolean status, String nombre, int edad, String sexo, String telefono,
			String direccion, String titulo) {
		super(id, nombre, edad, sexo, telefono, direccion);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
