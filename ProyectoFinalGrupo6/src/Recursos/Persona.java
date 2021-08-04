package Recursos;

import java.util.ArrayList;

public class Persona {
	
	protected String id;
	protected boolean status;
	protected String nombre;
	protected int edad;
	protected String sexo;
	protected String sexo2;
	protected String telefono;
	protected String direccion;
	protected String provincia;
	protected ArrayList<SolicitudPersona> misSolicitudes;

//arreglar con todas las variables que lleva
	public Persona(String nombre, String telefono, String id, String direccion, int edad, String sexo,String sexo2, String provincia) {
	super();
	this.id = id;
	this.status = false;
	this.nombre = nombre;
	this.edad = edad;
	this.sexo = sexo;
	this.telefono = telefono;
	this.direccion = direccion;
	this.provincia = provincia;
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

public String getSexo2() {
	return sexo2;
}

public void setSexo2(String sexo2) {
	this.sexo2 = sexo2;
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

public String getProvincia() {
	return provincia;
}

public void setProvincia(String provincia) {
	this.provincia = provincia;
}

public ArrayList<SolicitudPersona> getMisSolicitudes() {
	return misSolicitudes;
}

public void setMisSolicitudes(ArrayList<SolicitudPersona> misSolicitudes) {
	this.misSolicitudes = misSolicitudes;
}


}




