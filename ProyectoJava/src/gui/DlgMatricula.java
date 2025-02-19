package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JDialog;

public class DlgMatricula extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumMatricula;
	private JTextField txtCodAlumno;
	private JTextField txtCodCurso;
	private JTextField txtFecha;
	private JTextField txtHora;
	private JScrollPane scrollPane;
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
					DlgMatricula frame = new DlgMatricula();
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
	public DlgMatricula() {
		setTitle("Matrícula");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 660, 550);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero de matrícula:");
		lblNewLabel.setBounds(10, 11, 122, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Código del alumno:");
		lblNewLabel_1.setBounds(10, 43, 122, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Código del curso:");
		lblNewLabel_2.setBounds(10, 75, 122, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha:");
		lblNewLabel_3.setBounds(10, 107, 122, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hora:");
		lblNewLabel_4.setBounds(10, 139, 122, 14);
		contentPane.add(lblNewLabel_4);
		
		txtNumMatricula = new JTextField();
		txtNumMatricula.setBounds(142, 8, 100, 20);
		contentPane.add(txtNumMatricula);
		txtNumMatricula.setColumns(10);
		
		txtCodAlumno = new JTextField();
		txtCodAlumno.setBounds(142, 40, 100, 20);
		contentPane.add(txtCodAlumno);
		txtCodAlumno.setColumns(10);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setBounds(142, 72, 100, 20);
		contentPane.add(txtCodCurso);
		txtCodCurso.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(142, 104, 100, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		txtHora = new JTextField();
		txtHora.setBounds(142, 136, 100, 20);
		contentPane.add(txtHora);
		txtHora.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 164, 624, 336);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Numero de matr\u00EDcula", "C\u00F3digo del alumno", "C\u00F3digo del curso", "Fecha", "Hora"
			}
		));
		scrollPane.setViewportView(table);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(545, 8, 89, 23);
		contentPane.add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(545, 40, 89, 23);
		contentPane.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(545, 72, 89, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(545, 104, 89, 23);
		contentPane.add(btnEliminar);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
