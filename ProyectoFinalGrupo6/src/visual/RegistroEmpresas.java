package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Recursos.Empresa;
import Recursos.Persona;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class RegistroEmpresas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JTextField nom;
	private JTextField cod;
	private JTextField tel;
	private JTextField direc;
	static ArrayList<Empresa> empresas;//
	private JTextField pro;
	private JTextField cat;
	private JPanel buttonPane;
	private JButton okButton;
	private JButton cancelButton;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroEmpresas dialog = new RegistroEmpresas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroEmpresas() {
		empresas = new ArrayList();//
		setTitle("Registro de empresas");
		setBounds(100, 100, 450, 329);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		{
			lblNewLabel = new JLabel("Nombre:");
		}
		JLabel lblNewLabel_1 = new JLabel("ID:");
		JLabel lblNewLabel_2 = new JLabel("Categoría:");
		JLabel lblNewLabel_3 = new JLabel("Teléfono:");
		JLabel lblNewLabel_4 = new JLabel("Dirección:");
		JLabel lblNewLabel_5 = new JLabel("Provincia:");
		nom = new JTextField();
		nom.setColumns(10);
		cod = new JTextField();
		cod.setColumns(10);
		tel = new JTextField();
		tel.setColumns(10);
		direc = new JTextField();
		direc.setColumns(10);
		
		pro = new JTextField();
		pro.setColumns(10);
		
		cat = new JTextField();
		cat.setColumns(10);
		{
			buttonPane = new JPanel();
			{
				okButton = new JButton("Registrar");
				okButton.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						
						String nombre = nom.getText();
						String telefono = tel.getText();
						String id = cod.getText();
						String direccion = direc.getText();
						String categoria =  pro.getText();
						String  provincia=  cat.getText();
						
						Empresa emp = new Empresa ( nombre,telefono,id,direccion,categoria,provincia);
						
						
						empresas.add(emp);
						
					}
				});
				okButton.setActionCommand("OK");
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
			}
		}
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tel, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(lblNewLabel_4)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(direc, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(lblNewLabel_5)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pro, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addComponent(lblNewLabel_1)
								.addGap(54)
								.addComponent(cod))
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addComponent(lblNewLabel)
								.addGap(18)
								.addComponent(nom, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))))
					.addGap(158))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap(6, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(11)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(17)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(12)
							.addComponent(cod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(cat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(tel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(direc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(pro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		contentPanel.setLayout(gl_contentPanel);
		
		btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i =0; i<empresas.size();i++) {
					
					
				}
				{
					MostrarEmpresas GUI = new MostrarEmpresas();
					GUI.setVisible(rootPaneCheckingEnabled);//
				}
			}
		});
		
		GroupLayout gl_buttonPane = new GroupLayout(buttonPane);
		gl_buttonPane.setHorizontalGroup(
			gl_buttonPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_buttonPane.createSequentialGroup()
					.addGap(134)
					.addComponent(cancelButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(okButton)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_buttonPane.setVerticalGroup(
			gl_buttonPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_buttonPane.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_buttonPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(cancelButton)
						.addComponent(okButton)
						.addComponent(btnNewButton))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		buttonPane.setLayout(gl_buttonPane);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(buttonPane, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(6)
					.addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(buttonPane, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
	}
}
//