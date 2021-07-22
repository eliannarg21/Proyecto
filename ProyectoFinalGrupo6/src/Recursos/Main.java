package Recursos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> idiomas = new ArrayList<>();
		idiomas.add("Espanol");
		idiomas.add("Ingles");
		
		ArrayList<String> idiomas2 = new ArrayList<>();
		idiomas2.add("Espanol");
		
		Universitario t1 = new Universitario("031", true, "Jose", 25, "Masculino", "809-888", "Santiago", "Ing Sistemas");
		Universitario t2 = new Universitario("032", true, "Juan", 35, "Masculino", "809-888", "Santo Domingo", "Ing SIstemas");
		
		SolicitudPersona s1 = new SolicitudPersona("S1", t1, 4, 18, "PartTime", "Si", "No", idiomas2);
		SolicitudPersona s2 = new SolicitudPersona("S2", t2, 3, 35, "PartTime", "si", "Si", idiomas);
		
		t1.getMisSolicitudes().add(s1);
		t2.getMisSolicitudes().add(s2);
		
		Empresa e1 = new Empresa("E1", "Homs", "Salud", "Santiago", "809");
		SolicitudEmpresa se1 = new SolicitudEmpresa("S3", e1, 1, 3, 35, "Completo", "Si", "Universitario", "Ing Sistemas", 25, idiomas);
		e1.getSolicitudes().add(se1);
		
		Control.getInstance().getPersonas().add(t1);
		Control.getInstance().getPersonas().add(t2);
		Control.getInstance().getSoliPersonas().add(s1);
		Control.getInstance().getSoliPersonas().add(s2);
		Control.getInstance().getEmpresas().add(e1);
		Control.getInstance().getSoliEmpresas().add(se1);
		
		Persona p = Control.getInstance().match();
		
		System.out.println(p.getNombre());
		System.out.println(Control.getInstance().porcentaje(s1, se1));
		System.out.println(Control.getInstance().porcentaje(s2, se1));
	}

}
