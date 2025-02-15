
package gui;

//import clases.Alumno;
import arreglos.ArregloAlumno;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Alumno extends JFrame {
		
    public static void main(String[] args) {
		Alumno a = new Alumno();
	}
	
	public Alumno () {
		JFrame frame = new JFrame("Alumno");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(490,500);
	
		JPanel panel = new JPanel();
		frame.setContentPane(panel);
		panel.setLayout(null);
		
		
		JLabel lblNombre = new JLabel("Nombres: ");
		lblNombre.setBounds(10, 10, 60, 20);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellidos: ");
		lblApellido.setBounds(10, 40, 60, 20);
		panel.add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setBounds(10, 70, 60, 20);
		panel.add(lblDni);
		
		JLabel lblEdad = new JLabel("Edad: ");
		lblEdad.setBounds(10, 100, 60, 20);
		panel.add(lblEdad);
		
		JLabel lblCel = new JLabel("Celular: ");
		lblCel.setBounds(10, 130, 60, 20);
		panel.add(lblCel);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setBounds(80, 10, 250, 20);
		panel.add(txtNombre);
		
		JTextField txtApellido = new JTextField();
		txtApellido.setBounds(80, 40, 250, 20);
		panel.add(txtApellido);
		
		JTextField txtDni = new JTextField();
		txtDni.setBounds(80, 70, 250, 20);
		panel.add(txtDni);
		
		JTextField txtEdad = new JTextField();
		txtEdad.setBounds(80, 100, 250, 20);
		panel.add(txtEdad);
		
		JTextField txtCel = new JTextField();
		txtCel.setBounds(80, 130, 250, 20);
		panel.add(txtCel);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(20, 161, 429, 289);
		panel.add(scroll);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scroll.setViewportView(txtArea);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(360, 21, 89, 23);
		panel.add(btnAdicionar);
		
		JButton btnRegistros = new JButton("Registros");
		btnRegistros.setBounds(360, 69, 89, 23);
		panel.add(btnRegistros);
		frame.setVisible(true);
	}
	
}
