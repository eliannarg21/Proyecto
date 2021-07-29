package Recursos;

public class Universitario extends Persona{

	private String titulo;

	public Universitario(String id, String nombre, int edad, String sexo, String telefono,
			String direccion, String provincia, String titulo) {
		super(id, nombre, edad, sexo, telefono, direccion, provincia);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
