
package gui;

import clases.Alumno;
import arreglos.ArregloAlumno;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DlgAlumno extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JTextField txtEdad;
	private JLabel lblEstado;
	private JTextField txtCel;
	private JComboBox cboEstado;
	private JButton btnConsultar;
	private DefaultTableModel modelo;
	private JTable table;
		
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgAlumno frame = new DlgAlumno();;
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    
	public DlgAlumno () {
		setTitle("Alumno");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800,552);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
		JPanel panel = new JPanel();
		setContentPane(panel);
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
		
		txtNombre = new JTextField();
		txtNombre.setBounds(80, 40, 224, 20);
		panel.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(80, 71, 224, 20);
		panel.add(txtApellido);
		
		txtDni = new JTextField();
		txtDni.setBounds(80, 102, 125, 20);
		panel.add(txtDni);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(80, 133, 65, 20);
		panel.add(txtEdad);
		
		txtCel = new JTextField();
		txtCel.setBounds(80, 164, 125, 20);
		panel.add(txtCel);
		
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
		
		cboEstado = new JComboBox();
		cboEstado.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar estado", "Registrado", "Matriculado", "Retirado"}));
		cboEstado.setSelectedIndex(0);
		cboEstado.addActionListener(this);
		cboEstado.setBounds(80, 193, 140, 22);
		panel.add(cboEstado);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 226, 764, 274);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Codigo", "Nombres", "Apellidos", "DNI", "Edad", "Celular", "Estado"
			}
		));
		scrollPane.setViewportView(table);
		LeerInfo();
		listar();
		setVisible(true);
	}
	
	ArregloAlumno aa = new ArregloAlumno();
	
	
	public void actionPerformed(ActionEvent e) {
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
		
		if (!validarCampos()) {
	        if (cboEstado.getSelectedIndex() == 0) {
	            mensaje("Debe seleccionar uno de los estados.");
	        } 
	        else {
	            mensaje("Uno o mas campos estan vacios.");
	        }
	        return;
	    }    
		
		int cod = aa.tamano() + 202010001;
		
		String nom = leerNombre();
		String ape = leerApellido();
		String dni = leerDni();
		int ed = leerEdad();
		int cel = leerCelular();
		String est = leerEstado();
		
		boolean dniRepetido = false;
        for (int i = 0; i < aa.tamano(); i++) {
            if (aa.obtener(i).getDni().equals(dni)) {
                dniRepetido = true;
                break;
            }
        }
		
        if (dniRepetido) {
        	mensaje("El DNI ya está registrado.");
        } 
        else {
        	Alumno a = new Alumno(cod, nom, ape, dni, ed, cel, est);

            aa.adicionar(a);
            GuardarInfo();
            listar();
            
            limpiar();

        }
	}
	protected void actionPerformedBtnConsultar(ActionEvent e) {
		
		 String codAlumno = txtCodigo.getText();
	     String dni = txtDni.getText();
	     Alumno a = null;
	     
	     if (!codAlumno.isEmpty()) {
	            int codigo = Integer.parseInt(codAlumno);
	            a = aa.consultar(codigo);
	     } 
	     else if (!dni.isEmpty()) {
	         for (int i = 0; i < aa.tamano(); i++) {
	             if (aa.obtener(i).getDni().equals(dni)) {
	                 a = aa.obtener(i);
	                 break;
	             }
	         }
	     }
	        
	     if (a != null) {
	    	 leerCodigo();
	         txtNombre.setText(a.getNombre());
	         txtApellido.setText(a.getApellido());
	         txtDni.setText(a.getDni());
	         txtEdad.setText(String.valueOf(a.getEdad()));
	         txtCel.setText(String.valueOf(a.getCelular()));
	     }	     
	     else {
	    	 mensaje("Alumno no encontrado.");
	     }
		
	}
	protected void actionPerformedBtnModificar(ActionEvent e) {
		int codigo = leerCodigo();

        Alumno a = aa.consultar(codigo);

        if (a != null) {
        	String nom = leerNombre();
    		String ape = leerApellido();
    		int ed = leerEdad();
    		int cel = leerCelular();
    		String est = leerEstado();

            a.setNombre(nom);
            a.setApellido(ape);
            a.setEdad(ed);
            a.setCelular(cel);
            a.setEstado(est);
            
            GuardarInfo();
            listar();

            mensaje("Alumno modificado correctamente.");
        } 
        else {
            mensaje("Alumno no encontrado.");
        }
	}
	protected void actionPerformedBtnEliminar(ActionEvent e) {
		
		int codigo = leerCodigo();
		 
        Alumno a = aa.consultar(codigo);
        
        if (a != null) {
        	
            if (a.getEstado().equals("Registrado")) {

                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar al alumno?",  "Confirmar eliminación", 
                    JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    aa.eliminar(a);
                    
                    GuardarInfo();
                    listar();

                    limpiar();

                   mensaje("Alumno eliminado correctamente.");
                }
            } else {
            	mensaje("No se puede eliminar al alumno. Estado no permitido.");
            }
        } 
        else {
        	mensaje("Alumno no encontrado.");
        }
	}
	
	void limpiar() {
		txtNombre.setText("");
		txtApellido.setText("");
		txtDni.setText("");
		txtEdad.setText("");
		txtCel.setText("");
		txtCodigo.requestFocus();
	}
	
	void listar() {
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		modelo.setRowCount(0);
		for (int i=0; i < aa.tamano(); i++) {
			Object[] fila = {
				aa.obtener(i).getCodAlumno(),
				aa.obtener(i).getNombre(),
				aa.obtener(i).getApellido(),
				aa.obtener(i).getDni(),
				aa.obtener(i).getEdad(),
				aa.obtener(i).getCelular(),
				aa.obtener(i).getEstado()
			};
			modelo.addRow(fila);
		}
	}
	
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	
	int leerCodigo() {
		return Integer.parseInt(txtCodigo.getText().trim());
	}
	String leerNombre() {
		return txtNombre.getText().trim();
	}
	String leerApellido() {
		return txtApellido.getText().trim();
	}
	String leerDni() {
		return txtDni.getText().trim();
	}
	int leerEdad() {
		return Integer.parseInt(txtEdad.getText().trim());
	}
	int leerCelular() {
		return Integer.parseInt(txtCel.getText().trim());
	}
	String leerEstado() {
		if (cboEstado.getSelectedIndex() == 0) {
	        return null;
	    }
	    return cboEstado.getSelectedItem().toString();
	}
	
	boolean validarCampos() {
	    if (txtNombre.getText().trim().isEmpty() ||
	        txtApellido.getText().trim().isEmpty() ||
	        txtDni.getText().trim().isEmpty() ||
	        txtEdad.getText().trim().isEmpty() ||
	        txtCel.getText().trim().isEmpty() || 
	    	cboEstado.getSelectedIndex() == 0){
	        return false;
	    }
	    return true;
	}
	
	// Metodo para guardar datos en un archivo
    private void GuardarInfo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ManAlumnos.txt"))) {
        	for (int i = 0; i < aa.tamano(); i++) {
        		Alumno alu = aa.obtener(i);
        		writer.write(alu.getCodAlumno() + ", " +
        					 alu.getNombre() + ", " +
        					 alu.getApellido() + ", " +
        					 alu.getDni() + ", " +
        					 alu.getEdad() + ", " +
        					 alu.getCelular() + ", " +
        					 alu.getEstado());
        		writer.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Metodo para cargar datos desde un archivo
    private void LeerInfo() {
        try (BufferedReader reader = new BufferedReader(new FileReader("ManAlumnos.txt"))) {
        	aa = new ArregloAlumno();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(", ");
                Alumno alumno = new Alumno(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2],
                        data[3],
                        Integer.parseInt(data[4]),
                        Integer.parseInt(data[5]),
                        data[6]
                );
                aa.adicionar(alumno);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
	
}
