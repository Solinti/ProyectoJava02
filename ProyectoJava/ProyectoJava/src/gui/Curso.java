package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Curso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Curso frame = new Curso();
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
	public Curso() {
		setTitle("Curso");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(10, 11, 46, 14);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(141, 8, 65, 20);
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
		
		textField = new JTextField();
		textField.setBounds(141, 83, 7, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		setVisible(true);
	}

}
