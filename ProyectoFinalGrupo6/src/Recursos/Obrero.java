package Recursos;

import java.util.ArrayList;

public class Obrero extends Persona {
	
	private String skills;

	public Obrero(String id, String nombre, int edad, String sexo, String telefono, String direccion,
			String provincia, String skills) {
		super(id, nombre, edad, sexo, telefono, direccion, provincia);
		this.skills = skills;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

}
