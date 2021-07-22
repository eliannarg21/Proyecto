package Recursos;



import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		
		Tecnico p1 = 
				new Tecnico ("WFGPL-XX", false, "Jose Perez", 30, "Masculino", 809233900,  
						"Calle E #9, Jardines Metropolitanos  ", "Electricista");

      

		 Control control= new Control();
		 control.RegistrarPersona(p1);
	

		 



		 boolean valor = false;
		 do {
		 	String id = JOptionPane.showInputDialog("Ingrese el ID del cliente");
		 	valor = control.BuscarPersona(id);
		 } while(valor);
		 	}

		 }