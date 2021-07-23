package Recursos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Control {
	
	private ArrayList<Usuario> usuarios;
	private ArrayList<Empresa> empresas;
	private ArrayList<Persona> personas;
	private ArrayList<SolicitudEmpresa> soliEmpresas;
	private ArrayList<SolicitudPersona> soliPersonas;
	private static Control control = null;

	public Control() {
		usuarios = new ArrayList<>();
		empresas = new ArrayList<>();
		personas = new ArrayList<>();
		soliEmpresas = new ArrayList<>();
		soliPersonas = new ArrayList<>();
		Usuario admin = new Usuario("Administrador", "admin", "admin");
		usuarios.add(admin);
	}
	
	public static Control getInstance() {
		if (control == null) {
			control = new Control();
		}
		return control;
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
	
	
	public void BuscarEmpresa() {
		
	}
	
	public void GenerarConsultaPersona() {
		
	}
	
	public void GenerarSolicitudPersona(SolicitudPersona nuevaSolicitud) {
	
	}
	//Generar solicitud
	public void GenerarConsultaEmpresa() {
		 
	}
	
	public void GenerarSolicitudEmpresa() {
		 
	}
	public void RegistrarPersona(Persona nuevaPersona) {
		
		personas.add(nuevaPersona);
		
	}
	//Registrar una nueva persona al sistema
	public boolean BuscarPersona(String id) {
		boolean encontrado = false;
		int i =0;
		while(encontrado == false && i<personas.size()) {
			if (personas.get(i).getId().compareToIgnoreCase(id)==0) {
				encontrado = true;
			} else {
				i++;
			}
			
		}
		if (encontrado) {
			JOptionPane.showMessageDialog(null, "id: " + personas.get(i).getId()
					+"  Nombre: " + personas.get(i).getNombre()
					+"  Edad: " + personas.get(i).getEdad()
					+"  Sexo: " + personas.get(i).getSexo()
					+"  Telefono: "  + personas.get(i).getTelefono()
					+"  Direccion: " + personas.get(i).getDireccion()
					+"  Area: " + personas.get(i).getArea()
					+"  skills: " + personas.get(i).getSkills()
					+"  Titulo Universitario: " + personas.get(i).getTitulo()
				
				
					)
			;
			return false;
		} else {
			JOptionPane.showMessageDialog(null,"No existe el ID,intente nuevamente.");
			return true;
		}
	}
	//Metodo para buscar persona por su ID
	
	public Persona match() {
		Persona person = null;
		int mayor = 0;
		
		for (SolicitudEmpresa soliEmp : soliEmpresas) {
			for (SolicitudPersona soliPer : soliPersonas) {
				if (!soliPer.getPerson().isStatus() && soliEmp.isEstado()) {
					if (soliPer.getEstado().equalsIgnoreCase("Activa") && porcentaje(soliPer, soliEmp) >= 70 && porcentaje(soliPer, soliEmp) > mayor) {
						person = soliPer.getPerson();
						mayor = porcentaje(soliPer, soliEmp);
					}
				}
			}
		}
		return person;
	}

	public int porcentaje(SolicitudPersona soliPer, SolicitudEmpresa soliEmp) {
		int porciento = 0;
		
		if (soliPer.getExperiencia() >= soliEmp.getExperienciaSolicitud())
			porciento++;
		if (soliPer.getLicenciaConducir().equalsIgnoreCase(soliEmp.getLincenciaConducirSolicitud()))
			porciento++;
		if (soliPer.getSueldoMinimo() <= soliEmp.getSueldoMaximoSolicitud())
			porciento++;
		if (soliPer.getTipoTrabajo().equalsIgnoreCase(soliEmp.getTipoTrabajoSolicitud()))
			porciento++;
		if (soliPer.getPerson().getEdad() >= soliEmp.getEdadMinima())
			porciento++;
		
		if (soliPer.getPerson().getDireccion().equalsIgnoreCase(soliEmp.getMiEmpresa().getDireccionEmpresa()))
			porciento++;
		else if (soliPer.getMovilidad().equalsIgnoreCase("Si"))
			porciento++;
		
		for (String idioma : soliEmp.getIdiomasSolicitud()) {
			for (String idio : soliPer.getIdiomas()) {
				if (idioma.equalsIgnoreCase(idio)) {
					porciento++;
				}
			}
		}
		
		float size = 6 + soliEmp.getIdiomasSolicitud().size();
		return (int) ((porciento/size)*100);
	}


}
