package Recursos;

import java.util.ArrayList;

public class Control {
	
	private ArrayList<Usuario> usuarios;
	private ArrayList<Empresa> empresas;
	private ArrayList<Persona> personas;
	private ArrayList<SolicitudEmpresa> soliEmpresas;
	private ArrayList<SolicitudPersona> soliPersonas;

	public Control() {
		usuarios = new ArrayList<>();
		empresas = new ArrayList<>();
		personas = new ArrayList<>();
		soliEmpresas = new ArrayList<>();
		soliPersonas = new ArrayList<>();
		Usuario admin = new Usuario("Administrador", "admin", "admin");
		usuarios.add(admin);
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(ArrayList<Empresa> empresas) {
		this.empresas = empresas;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	public ArrayList<SolicitudEmpresa> getSoliEmpresas() {
		return soliEmpresas;
	}

	public void setSoliEmpresas(ArrayList<SolicitudEmpresa> soliEmpresas) {
		this.soliEmpresas = soliEmpresas;
	}

	public ArrayList<SolicitudPersona> getSoliPersonas() {
		return soliPersonas;
	}

	public void setSoliPersonas(ArrayList<SolicitudPersona> soliPersonas) {
		this.soliPersonas = soliPersonas;
	}
	
	public void BuscarPersona() {
		
	}
	
	public void BuscarEmpresa() {
		
	}
	
	public void GenerarConsultaPersona() {
		
	}
	
	public void GenerarSolicitudPersona() {
		
	}
	
	public void GenerarConsultaEmpresa() {
		 
	}
	
	public void GenerarSolicitudEmpresa() {
		 
	}

}
