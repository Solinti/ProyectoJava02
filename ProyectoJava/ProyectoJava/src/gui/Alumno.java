
package gui;

//import clases.Alumno;
import arreglos.ArregloAlumno;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Alumno extends JFrame implements ActionListener {
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JLabel lblEstado;
	private JButton btnBuscar;
	private JComboBox cboEstado;
	private JButton btnConsultar;
		
    public static void main(String[] args) {
		Alumno frame = new Alumno();
	}
	
	public Alumno () {
		JFrame frame = new JFrame("Alumno");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800,550);
	
		JPanel panel = new JPanel();
		frame.setContentPane(panel);
		panel.setLayout(null);
		
		
		JLabel lblNombre = new JLabel("Nombres: ");
		lblNombre.setBounds(10, 40, 60, 20);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellidos: ");
		lblApellido.setBounds(10, 71, 60, 20);
		panel.add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setBounds(10, 102, 60, 20);
		panel.add(lblDni);
		
		JLabel lblEdad = new JLabel("Edad: ");
		lblEdad.setBounds(10, 133, 60, 20);
		panel.add(lblEdad);
		
		JLabel lblCel = new JLabel("Celular: ");
		lblCel.setBounds(10, 164, 60, 20);
		panel.add(lblCel);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setBounds(80, 40, 224, 20);
		panel.add(txtNombre);
		
		JTextField txtApellido = new JTextField();
		txtApellido.setBounds(80, 71, 224, 20);
		panel.add(txtApellido);
		
		JTextField txtDni = new JTextField();
		txtDni.setBounds(80, 102, 125, 20);
		panel.add(txtDni);
		
		JTextField txtEdad = new JTextField();
		txtEdad.setBounds(80, 133, 65, 20);
		panel.add(txtEdad);
		
		JTextField txtCel = new JTextField();
		txtCel.setBounds(80, 164, 125, 20);
		panel.add(txtCel);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(10, 226, 764, 274);
		panel.add(scroll);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scroll.setViewportView(txtArea);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(685, 9, 89, 23);
		panel.add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(685, 39, 89, 23);
		panel.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(685, 69, 89, 23);
		panel.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(685, 99, 89, 23);
		panel.add(btnEliminar);
		
		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(10, 10, 60, 20);
		panel.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(80, 10, 125, 20);
		panel.add(txtCodigo);
		
		lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(10, 195, 60, 20);
		panel.add(lblEstado);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(215, 9, 89, 23);
		panel.add(btnBuscar);
		
		cboEstado = new JComboBox();
		cboEstado.addActionListener(this);
		cboEstado.setBounds(80, 193, 125, 22);
		panel.add(cboEstado);
		frame.setVisible(true);
	}
	
	ArregloAlumno aa = new ArregloAlumno();
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboEstado) {
			actionPerformedCboEstado(e);
		}
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
		if (e.getSource() == btnModificar) {
			actionPerformedBtnModificar(e);
		}
		if (e.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(e);
		}
		if (e.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(e);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent e) {
		
	}
	protected void actionPerformedBtnConsultar(ActionEvent e) {
	}
	protected void actionPerformedBtnModificar(ActionEvent e) {
	}
	protected void actionPerformedBtnEliminar(ActionEvent e) {
	}
	protected void actionPerformedCboEstado(ActionEvent e) {
	}
}
