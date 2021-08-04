package Recursos;

import java.util.ArrayList;

public class Obrero extends Persona {
	
	private String skills;

	public Obrero(String nombre, String telefono, String id, String direccion, int edad, String sexo, String sexo2,
			String provincia, String skills) {
		super(nombre, telefono, id, direccion, edad, sexo, sexo2, provincia);
		this.skills = skills;
	}

	public Object getSkills() {
		// TODO Auto-generated method stub
		return null;
	}
}
	