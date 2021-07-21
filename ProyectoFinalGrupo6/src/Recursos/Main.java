package Recursos;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Persona p1 = new Persona ("WFGPL");


Control control= new Control();
control.RegistrarPersona(p1);

SolicitudPersona s1 = new SolicitudPersona ();



boolean valor = false;
do {
	String id = JOptionPane.showInputDialog("Ingrese el ID del cliente");
	valor = control.BuscarPersona(id);
} while(valor);
	}

}
