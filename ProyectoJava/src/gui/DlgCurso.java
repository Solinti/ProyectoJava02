package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import clases.Alumno;

import javax.swing.JButton;

public class DlgCurso extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtCreditos;
	private JTextField txtAsignatura;
	private JTextField txtHoras;
	private JTable table;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgCurso frame = new DlgCurso();
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
	public DlgCurso() {
		setTitle("Curso");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 550);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(10, 11, 46, 14);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(141, 8, 100, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblNewLabel = new JLabel("Asignatura:");
		lblNewLabel.setBounds(10, 36, 65, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Ciclo:");
		lblNewLabel_1.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Número de créditos:");
		lblNewLabel_2.setBounds(10, 86, 121, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Cantidad de horas");
		lblNewLabel_3.setBounds(10, 111, 121, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCreditos = new JTextField();
		txtCreditos.setBounds(141, 83, 65, 20);
		contentPane.add(txtCreditos);
		txtCreditos.setColumns(10);
		
		txtAsignatura = new JTextField();
		txtAsignatura.setColumns(10);
		txtAsignatura.setBounds(141, 33, 200, 20);
		contentPane.add(txtAsignatura);
		
		JComboBox cboCiclo = new JComboBox();
		cboCiclo.setModel(new DefaultComboBoxModel(new String[] {"Primero ", "Segundo", "Tercero", "Cuarto", "Quinto ", "Sexto"}));
		cboCiclo.setBounds(141, 57, 100, 22);
		contentPane.add(cboCiclo);
		
		txtHoras = new JTextField();
		txtHoras.setColumns(10);
		txtHoras.setBounds(141, 108, 65, 20);
		contentPane.add(txtHoras);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 136, 612, 364);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"C\u00F3digo", "Asignatura", "Ciclo", "N\u00FAmero de cr\u00E9ditos", "Cantidad de horas"
			}
		));
		scrollPane.setViewportView(table);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(533, 7, 89, 23);
		contentPane.add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(533, 32, 89, 23);
		contentPane.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(533, 57, 89, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(533, 82, 89, 23);
		contentPane.add(btnEliminar);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(e);
		}
		
	}
	
	protected void actionPerformedBtnAdicionar(ActionEvent e) {
	}
	
}
