
package mantenimiento;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Adicionar {
    String nombre;
    String apellido;
    String dni;
    int edad;
    String celular;
    int estado;

    public Adicionar(String nombre, String apellido, String dni, int edad, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.celular = celular;
        this.estado = 0;
    }
}

public class Alumno extends JFrame {
	
	private ArrayList<Adicionar> alumnos;
    private ArrayList<String> dnisRegistrados;
    private int codigoCorrelativo;
    private JTable tblAlumno;
    private DefaultTableModel modelo;
	
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
		
		tblAlumno = new JTable();
		tblAlumno.setFillsViewportHeight(true);
		scroll.setViewportView(tblAlumno);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(360, 21, 89, 23);
		panel.add(btnGuardar);
		
		JButton btnRegistros = new JButton("Registros");
		btnRegistros.setBounds(360, 69, 89, 23);
		panel.add(btnRegistros);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("código");
		modelo.addColumn("nombre");
		modelo.addColumn("Apellido");
		modelo.addColumn("DNI");
		modelo.addColumn("Edad");
		modelo.addColumn("Celular");
		modelo.addColumn("Estado");
		tblAlumno.setModel(modelo);
				
		alumnos = new ArrayList<>();
        dnisRegistrados = new ArrayList<>();
        codigoCorrelativo = 202010001;
        
   
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String nombre = txtNombre.getText();
				String apellido = txtApellido.getText();
				String dni = txtDni.getText();
				int edad = Integer.parseInt(txtEdad.getText());
				String cel = txtCel.getText();
				int estado = Integer.parseInt(txtCel.getText());

				
				 if (dnisRegistrados.contains(dni)) {
	                    JOptionPane.showMessageDialog(null, "El DNI ya está registrado.");
	                    return;
	                }
				
				 Adicionar a = new Adicionar(nombre, apellido, dni, edad, cel);
				 	alumnos.add(a);
				 	dnisRegistrados.add(dni);
				 	
				 	
				 	codigoCorrelativo++;
				 	txtNombre.setText("");
				 	txtApellido.setText("");
				 	txtDni.setText("");
				 	txtEdad.setText("");
				 	txtCel.setText("");
				 	
				 	JOptionPane.showMessageDialog(null, "Alumno registrado");
			}	
				
		});
				
		/*btnRegistros.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                StringBuilder r = new StringBuilder();
	                for (Adicionar alumno : alumnos) {
	                    r.append("Código   :").append(codigoCorrelativo+"\n")
	                     .append("Nombre   :").append(alumno.nombre+"\n")
	                     .append("Apellido :").append(alumno.apellido+"\n")
	                     .append("DNI      :").append(alumno.dni+"\n")
	                     .append("Edad     :").append(alumno.edad+"\n")
	                     .append("Celular  :").append(alumno.celular+"\n")
	                     .append("Estado   :").append(alumno.estado+"\n")
	                     .append("\n");
	                    codigoCorrelativo++;
	                }
	                txtArea.setText(r.toString());
	            }
	        });*/
		
	 
		
		
		frame.setVisible(true);

	}
	
	void listar() {
		modelo.setRowCount(0);
		//for (int i=0; i< alumno ; i++) {
			Object[] fila = { aa.obtener(i).getCodigo(),
					          aa.obtener(i).getNombre(),
					          aa.obtener(i).getNota1(),
					          aa.obtener(i).getNota2(),
					          aa.obtener(i).promedio() };
			modelo.addRow(fila);
		}
	//}

}
