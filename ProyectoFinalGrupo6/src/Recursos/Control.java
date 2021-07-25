package Recursos;


import java.util.ArrayList;
import java.util.Scanner;



public class Control {
	Scanner console = new Scanner(System.in);
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
	
	//Metodo para buscar empresa por su ID
	public Empresa BuscarEmpresa(String idEmpresa) 
	{
		for (Empresa e : empresas) {
			if(e.getIdEmpresa().equalsIgnoreCase(idEmpresa)) {
				return e;
			}
		}
		return null;
	}
	
	public void GenerarConsultaPersona() {
		
	}
	
	public void GenerarSolicitudPersona(String idPerson, SolicitudPersona nuevaSolicitud) {
	
	}

	public void GenerarConsultaEmpresa() {
		 
	}
	
	public void GenerarSolicitudEmpresa(String idEmpresa, SolicitudEmpresa newSolicitud) {
		 
	}
	//Metodo para buscar persona por su ID
	public Persona BuscarPersona(String id) {
		
		for (Persona p : personas)
		{
			if (p.getId().equalsIgnoreCase(id)){
				return p;
			}
		}
		return null;
	}
	//Registrar una nueva persona al sistema

	void RegistrarPersona(ArrayList<Persona> personas) 
	{
		int NumPersona = 0;
		int tipoEmpleado;
		System.out.print("Cuantos personas desea registrar?:");
		NumPersona = checkInt(NumPersona);
		for(int i = 0; i < NumPersona; i++)
		{
			System.out.println("\nQue tipo de empleado desea registrar?");
			System.out.print("Ingrese 1 para , 2 para tecnico, 3 para obrero: ");

			tipoEmpleado = checkIntRange(i);

			switch(tipoEmpleado)
			{
			case 1:
			{
				System.out.printf("Ingrese el nombre de la persona: ");
				Persona.nombre = console.next();
				
				System.out.printf("Ingrese el ID de la persona: ");
				Persona.id = console.next();
				
				System.out.printf("Ingrese el sexo de la persona: ");
				Persona.sexo = console.next();
				
			
				System.out.printf("Ingrese la edad de la persona: ");
				Persona.edad = console.nextInt();
			
				System.out.printf("Ingrese el telefono de la persona: ");
				Persona.telefono = console.nextInt();

				System.out.printf("Ingrese la direccion de la persona: ");
				Persona.direccion = console.next();
				

				System.out.printf("Ingrese el grado universitario de la persona: ");
				Universitario.titulo = console.next();
				
				personas.addAll(new ArrayList<Persona> ());
				break;	
			}
			}
			}
			}
	
// validar numero entero a ingresar.
	public int checkInt(int Num)
	{
		do {
			while(!console.hasNextInt())
			{
				System.out.println("No es un munero valido!");
				console.next();
			}
			Num = console.nextInt();
		}while (Num <= 0);

		return Num;
	}

	public int checkIntRange(int Num)
	{
		do {
			while(!console.hasNextInt())
			{
				System.out.println("No es un numero valido!");
				console.next();
			}
			Num = console.nextInt();
		}while (Num < 1 || Num > 3);

		return Num;
	}

	public int checkIntRange2(int Num)
	{
		do {
			while(!console.hasNextInt())
			{
				System.out.println("No es un numero valido!");
				console.next();
			}
			Num = console.nextInt();
		}while (Num < 1 || Num > 2);

		return Num;
	}

	public double checkDouble(double Double)
	{
		do {
			while(!console.hasNextDouble())
			{
				System.out.println("No es un numero valido!");
				console.next();
			}
			 Double = console.nextDouble();
		}while (Double <= 0);

		return Double;
	}   
//Fin del metodo validar numero entero a ingresar
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
	
	public void changeToDesempleado(Persona person) {
		if (person.isStatus()) {
			person.setStatus(false);
			for (SolicitudPersona solicitud : person.getMisSolicitudes()) {
				if (solicitud.getEstado().equalsIgnoreCase("En espera")) {
					solicitud.setEstado("Activa");
				}
			}
		}
	}
	
	public void changeToEmpleado(Persona person) {
		if (!person.isStatus()) {
			person.setStatus(true);
			for (SolicitudPersona solicitud : person.getMisSolicitudes()) {
				if (solicitud.getEstado().equalsIgnoreCase("Activa")) {
					solicitud.setEstado("En espera");
				}
			}
		}
	}


}
