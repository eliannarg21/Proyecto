package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Recursos.Empresa;
import Recursos.Persona;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MostrarEmpresas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPanel buttonPane;
	private JButton OK;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField nom;
	private JTextField var;
	private JTextField pro;
	private JLabel d;
	private JTextField direc;
	private JLabel cate;
	private JTextField cat;
	private JTextField cod;
	private JLabel lblNewLabel_4;
	private JTextField tel;
	private JButton cancelButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MostrarEmpresas dialog = new MostrarEmpresas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MostrarEmpresas() {
		setBounds(100, 100, 450, 394);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		{
			buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		}
		{
			OK = new JButton("Buscar");
			OK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					boolean empresaEncontrada= false;
					String codigoBuscarStringE = cod.getText();
					
					for(Empresa emp : RegistroEmpresas.empresas) {
						
						if (emp.getIdEmpresa().equals(codigoBuscarStringE)) {
						cod.setText(emp.getIdEmpresa());
						nom.setText(emp.getNombreEmpresa());
						direc.setText(emp.getDireccionEmpresa());
						
						pro.setText(emp.getCategoria());
						cat.setText(emp.getProvincia());
						tel.setText(emp.getProvincia());
					
					
						empresaEncontrada = true;
						
						//
						}
					}
					if (empresaEncontrada==false) {
						JOptionPane.showMessageDialog(null, "No se encontro una persona con ese codigo");
					}
				
		
				}
			});
			OK.setActionCommand("OK");
			getRootPane().setDefaultButton(OK);
		}
		lblNewLabel = new JLabel("Código:");
		lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_3 = new JLabel("Categoría:");
		nom = new JTextField();
		nom.setColumns(10);
		var = new JTextField();
		var.setColumns(10);
		pro = new JTextField();
		pro.setColumns(10);
		d = new JLabel("Dirección:");
		direc = new JTextField();
		direc.setColumns(10);
		cate = new JLabel("Provincia:");
		cat = new JTextField();
		cat.setColumns(10);
		
		cod = new JTextField();
		cod.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Teléfono:");
		
		tel = new JTextField();
		tel.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(45)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel_4)
							.addGap(18)
							.addComponent(tel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(pro, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(d)
								.addComponent(cate))
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(37)
									.addComponent(cat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 164, Short.MAX_VALUE))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(18)
									.addComponent(direc))))
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel_2))
									.addGap(18)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPanel.createSequentialGroup()
											.addComponent(var, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
										.addComponent(nom, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(18)
									.addComponent(cod, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
							.addGap(18)
							.addComponent(OK)))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(OK)
						.addComponent(lblNewLabel)
						.addComponent(cod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(var, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(pro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(tel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(d)
						.addComponent(direc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(cat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cate)))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			cancelButton = new JButton("Cancel");
			cancelButton.setActionCommand("Cancel");
		}
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonPane, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(cancelButton)
					.addGap(16))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cancelButton)
					.addGap(18)
					.addComponent(buttonPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(15))
		);
		getContentPane().setLayout(groupLayout);
	}

}
