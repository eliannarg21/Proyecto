package Recursos;

import java.util.ArrayList;

public abstract class Persona {
	
	protected static String id;
	protected boolean status;
	protected static String nombre;
	protected static int edad;
	protected static String sexo;
	protected static int telefono;
	protected static String direccion;
	protected ArrayList<SolicitudPersona> misSolicitudes;

public Persona(String id, String nombre, int edad, String sexo, int telefono, String direccion) {
	super();
	Persona.id = id;
	this.status = false;
	Persona.nombre = nombre;
	Persona.edad = edad;
	Persona.sexo = sexo;
	Persona.telefono = telefono;
	Persona.direccion = direccion;
	this.misSolicitudes = new ArrayList<>();
}

public String getId() {
	return id;
}

public void setId(String id) {
	Persona.id = id;
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
	Persona.nombre = nombre;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	Persona.edad = edad;
}

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	Persona.sexo = sexo;
}

public int getTelefono() {
	return telefono;
}

public void setTelefono(int telefono) {
	Persona.telefono = telefono;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	Persona.direccion = direccion;
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

public String getArea() {
	// TODO Auto-generated method stub
	return null;
}

public String getTitulo() {
	// TODO Auto-generated method stub
	return null;
}

public ArrayList<String> getSkills() {
	// TODO Auto-generated method stub
	return null;
}


	
}


