package Recursos;

import java.util.ArrayList;

public class SolicitudPersona {

private String id;
private Persona person;
private int experiencia;
private float sueldoMinimo;
private String tipoTrabajo;
private String licenciaConducir;
private String movilidad;
private ArrayList<String> idiomas;

public SolicitudPersona(String id, Persona person, int experiencia, float sueldoMinimo, String tipoTrabajo,
		String licenciaConducir, String movilidad, ArrayList<String> idiomas) {
	super();
	this.id = id;
	this.person = person;
	this.experiencia = experiencia;
	this.sueldoMinimo = sueldoMinimo;
	this.tipoTrabajo = tipoTrabajo;
	this.licenciaConducir = licenciaConducir;
	this.movilidad = movilidad;
	this.idiomas = idiomas;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public Persona getPerson() {
	return person;
}

public void setPerson(Persona person) {
	this.person = person;
}

public int getExperiencia() {
	return experiencia;
}

public void setExperiencia(int experiencia) {
	this.experiencia = experiencia;
}

public float getSueldoMinimo() {
	return sueldoMinimo;
}

public void setSueldoMinimo(float sueldoMinimo) {
	this.sueldoMinimo = sueldoMinimo;
}

public String getTipoTrabajo() {
	return tipoTrabajo;
}

public void setTipoTrabajo(String tipoTrabajo) {
	this.tipoTrabajo = tipoTrabajo;
}

public String getLicenciaConducir() {
	return licenciaConducir;
}

public void setLicenciaConducir(String licenciaConducir) {
	this.licenciaConducir = licenciaConducir;
}

public String getMovilidad() {
	return movilidad;
}

public void setMovilidad(String movilidad) {
	this.movilidad = movilidad;
}

public ArrayList<String> getIdiomas() {
	return idiomas;
}

public void setIdiomas(ArrayList<String> idiomas) {
	this.idiomas = idiomas;
}

}
