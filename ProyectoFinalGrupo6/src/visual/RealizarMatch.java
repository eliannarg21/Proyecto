package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Recursos.Control;
import Recursos.Obrero;
import Recursos.Persona;
import Recursos.SolicitudEmpresa;
import Recursos.SolicitudPersona;
import Recursos.Tecnico;
import Recursos.Universitario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RealizarMatch extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static DefaultTableModel model;
	private static Object rows[];
	private SolicitudEmpresa selected = null;
	private JTable table;
	private JButton btnEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RealizarMatch dialog = new RealizarMatch();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RealizarMatch() {
		setTitle("Matching");
		setBounds(100, 100, 740, 430);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.setBounds(6, 6, 718, 341);
			panel.add(scrollPane);
			{
				model = new DefaultTableModel();
				String headers[] = {"Empresa", "Solicitud", "Empleado", "Porcentaje"};
				model.setColumnIdentifiers(headers);
				loadtable(0);
				table = new JTable();
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						int index = -1;
						index = table.getSelectedRow();
						if (index != -1) {
							btnEliminar.setEnabled(true);
							String id = (String)(model.getValueAt(index, 0));
							selected = Control.getInstance().BuscarSoliEmpresa(id);
						}
					}
				});
				table.setModel(model);
				scrollPane.setViewportView(table);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnEliminar = new JButton("Realizar");
				btnEliminar.setEnabled(false);
				btnEliminar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int option = JOptionPane.showConfirmDialog(null, "Desea eliminar la solicitud seleccionada: "+ selected.getIdSolicitud(), "Eliminar Solicitud Empresa", JOptionPane.YES_NO_OPTION);
						if (option == JOptionPane.YES_OPTION) {
							Control.getInstance().getSoliEmpresas().remove(selected);
							loadtable(0);
							btnEliminar.setEnabled(false);
						}
					}
				});
				btnEliminar.setActionCommand("OK");
				buttonPane.add(btnEliminar);
				getRootPane().setDefaultButton(btnEliminar);
			}
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

	private static void loadtable(int selection) {
		model.setRowCount(0);
		rows = new Object[model.getColumnCount()];
		
		for (SolicitudEmpresa se: Control.getInstance().getSoliEmpresas()) {
			SolicitudPersona p = Control.getInstance().match(se);
			rows[0] = se.getMiEmpresa().getNombreEmpresa();
			rows[1] = se.getIdSolicitud();
			rows[2] = p.getPerson().getNombre();
			rows[3] = Control.getInstance().porcentaje(p, se);
			model.addRow(rows);
		}
	}
}
