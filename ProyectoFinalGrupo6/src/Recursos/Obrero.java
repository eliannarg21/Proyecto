package Recursos;

import java.util.ArrayList;

public class Obrero extends Persona {
	
	private ArrayList<String> skills;

	public Obrero(String id, boolean status, String nombre, int edad, String sexo, String telefono, String direccion,
			ArrayList<String> skills) {
		super(id, status, nombre, edad, sexo, telefono, direccion);
		this.skills = skills;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

}
