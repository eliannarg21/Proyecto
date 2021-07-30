package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Recursos.Control;
import Recursos.Empresa;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Bolsa de Ubicacion Laboral");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Clientes");
		menuBar.add(mnNewMenu);
	
		
		JMenu mnNewMenu_3 = new JMenu("Personas");
		mnNewMenu.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Registrar");
		
		
		mntmNewMenuItem_3.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				RegistroPersona reg = new RegistroPersona();
				reg.setModal(true);
				reg.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_3);
		//Codigo Registro de persona.
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Listar");
		mnNewMenu_3.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_4 = new JMenu("Empresas");
		mnNewMenu.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Registrar");
		mnNewMenu_4.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_0 = new JMenuItem("Listar");
		mnNewMenu_4.add(mntmNewMenuItem_0);
		
		JMenu mnNewMenu_1 = new JMenu("Solicitudes");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_5 = new JMenu("Persona");
		mnNewMenu_1.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Realizar");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RealizarSolicitudPersona sp = new RealizarSolicitudPersona();
				sp.setModal(true);
				sp.setVisible(true);
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Listar");
		mnNewMenu_5.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_6 = new JMenu("Empresa");
		mnNewMenu_1.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Realizar");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RealizarSolicitudEmpresa soliEmp = new RealizarSolicitudEmpresa();
				soliEmp.setModal(true);
				soliEmp.setVisible(true);
			}
		});
		mnNewMenu_6.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Listar");
		mnNewMenu_6.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_2 = new JMenu("Administración");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_7 = new JMenu("Usuarios");
		mnNewMenu_2.add(mnNewMenu_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Registrar");
		mnNewMenu_7.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Listar");
		mnNewMenu_7.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Realizar match");
		mnNewMenu_2.add(mntmNewMenuItem_10);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
