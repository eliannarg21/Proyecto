package Recursos;

public class Universitario extends Persona{

	private String titulo;

	public Universitario(String nombre, String telefono, String id, String direccion, int edad, String sexo,
			String sexo2, String provincia, String titulo) {
		super(nombre, telefono, id, direccion, edad, sexo, sexo2, provincia);
		this.titulo = titulo;
	}

	public String getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}


}