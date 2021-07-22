package Recursos;

import java.util.ArrayList;

public abstract class Persona {
	
	protected String id;
	protected boolean status;
	protected String nombre;
	protected int edad;
	protected String sexo;
	protected String telefono;
	protected String direccion;
	protected ArrayList<SolicitudPersona> misSolicitudes;

public Persona(String id, boolean status, String nombre, int edad, String sexo, String telefono, String direccion) {
	super();
	this.id = id;
	this.status = status;
	this.nombre = nombre;
	this.edad = edad;
	this.sexo = sexo;
	this.telefono = telefono;
	this.direccion = direccion;
	this.misSolicitudes = new ArrayList<>();
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public ArrayList<SolicitudPersona> getMisSolicitudes() {
	return misSolicitudes;
}

public void setMisSolicitudes(ArrayList<SolicitudPersona> misSolicitudes) {
	this.misSolicitudes = misSolicitudes;
}

public static void add(Persona nuevaPersona) {
	// TODO Auto-generated method stub
	
}

	
}


