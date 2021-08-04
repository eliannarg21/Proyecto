package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Recursos.Control;
import Recursos.Persona;
import Recursos.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class MostrarPerson extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JTextField varcedula;
	private JTextField varnombre;
	private JTextField varid;
	private JTextField vartelefono;
	private JTextField vardireccion;
	private JTextField varedad;
	private JTextField varsexo;
	private JButton okButton;
	private JTextField varprovincia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MostrarPerson dialog = new MostrarPerson();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MostrarPerson() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			lblNewLabel = new JLabel("Nombre:");
		}
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		
		JLabel lblNewLabel_2 = new JLabel("Teléfono:");
		
		JLabel lblNewLabel_3 = new JLabel("Dirección:");
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		
		JLabel lblNewLabel_5 = new JLabel("Consultar cédula:");
		
		varcedula = new JTextField();
		varcedula.setColumns(10);
		
		varnombre = new JTextField();
		varnombre.setColumns(10);
		
		varid = new JTextField();
		varid.setColumns(10);
		
		vartelefono = new JTextField();
		vartelefono.setColumns(10);
		
		vardireccion = new JTextField();
		vardireccion.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Edad:");
		
		varedad = new JTextField();
		varedad.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Sexo:");
		
		varsexo = new JTextField();
		varsexo.setColumns(10);
		{
			okButton = new JButton("Buscar");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					boolean personaEncontrada= false;
					String codigoBuscarString = varcedula.getText();
					
					for(Persona persona : RegistroPersona.personas) {
						
						if (persona.getId().equals(codigoBuscarString)) {
						varcedula.setText(persona.getId());
						varnombre.setText(persona.getNombre());
						varid.setText(persona.getId());
						varedad.setText(" "+ persona.getEdad());
						varprovincia.setText(persona.getProvincia());
						varsexo.setText(persona.getSexo());
						vartelefono.setText(persona.getTelefono());
						vardireccion.setText(persona.getDireccion());
						personaEncontrada = true;
						
						//
						}
					}
					if (personaEncontrada==false) {
						JOptionPane.showMessageDialog(null, "No se encontro una persona con ese codigo");
					}
				}
			});
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		
		JLabel lblNewLabel_8 = new JLabel("Provincia:");
		
		varprovincia = new JTextField();
		varprovincia.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel_3)
										.addComponent(lblNewLabel_6)
										.addComponent(lblNewLabel_2)))
								.addComponent(lblNewLabel_5))
							.addGap(18)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(varcedula, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(okButton, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(varid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPanel.createSequentialGroup()
											.addComponent(varedad, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblNewLabel_7)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(varsexo, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPanel.createSequentialGroup()
											.addComponent(vartelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblNewLabel_8))
										.addComponent(vardireccion)
										.addComponent(varnombre))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(varprovincia, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))))
					.addGap(9))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(varcedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(okButton))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(varnombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(varid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(varedad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7)
						.addComponent(varsexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(vartelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_8)
						.addComponent(varprovincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(vardireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addComponent(lblNewLabel_4)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	
}
}
