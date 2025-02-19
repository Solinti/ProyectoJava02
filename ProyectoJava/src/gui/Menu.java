
package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Menu extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem mntmSalir;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("Menu principal del sistema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mntmSalir.setIcon(new ImageIcon(Menu.class.getResource("/Img/salir.png")));
		mnArchivo.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmAlumno = new JMenuItem("Alumno");
		setLocationRelativeTo(null);
		mnMantenimiento.add(mntmAlumno);
		
		JMenuItem mntmCurso = new JMenuItem("Curso");
		mnMantenimiento.add(mntmCurso);
		
		JMenu mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		JMenuItem mntmMatricula = new JMenuItem("Matrícula");
		mnRegistro.add(mntmMatricula);
		
		JMenuItem mntmRetiro = new JMenuItem("Retiro");
		mnRegistro.add(mntmRetiro);
		
		JMenu mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		JMenuItem mntmAlumnosCons = new JMenuItem("Alumnos");
		mnConsulta.add(mntmAlumnosCons);
		
		JMenuItem mntmCursosCons = new JMenuItem("Cursos");
		mnConsulta.add(mntmCursosCons);
		
		JMenuItem mntmMatriculaCons = new JMenuItem("Matrículas");
		mnConsulta.add(mntmMatriculaCons);
		
		JMenuItem mntmRetirosCons = new JMenuItem("Retiros");
		mnConsulta.add(mntmRetirosCons);
		
		JMenu mnReporte = new JMenu("Reporte");
		menuBar.add(mnReporte);
		
		JMenuItem mntmMatriculaPendiente = new JMenuItem("Alumnos con matrícula pendiente");
		mnReporte.add(mntmMatriculaPendiente);
		
		JMenuItem mntmMatriculaVigente = new JMenuItem("Alumnos con matrícula vigente");
		mnReporte.add(mntmMatriculaVigente);
		
		JMenuItem mntmMatriculadosCurso = new JMenuItem("Alumnos matriculados por curso");
		mnReporte.add(mntmMatriculadosCurso);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		  // Vincular el JMenuItem con la clase
        mntmAlumno.addActionListener(e -> {
        	new DlgAlumno();
        });
        mntmCurso.addActionListener(e -> { 
        	new DlgCurso();
        });
        mntmMatricula.addActionListener(e -> { 
        	new DlgMatricula();
        });
        mntmRetiro.addActionListener(e -> { 
        	new DlgRetiro();
        });
        mntmAlumnosCons.addActionListener(e -> { 
        	new DlgConsAlumnos();
        });
        mntmCursosCons.addActionListener(e -> { 
        	new DlgConsCursos();
        });
        mntmMatriculaCons.addActionListener(e -> { 
        	new DlgConsMatricula();
        });
        mntmRetirosCons.addActionListener(e -> { 
        	new DlgConsRetiros();
        });
        mntmMatriculaPendiente.addActionListener(e -> { 
        	new DlgMatriculaPendiente();
        });
        mntmMatriculaVigente.addActionListener(e -> { 
        	new DlgMatriculaVigente();
        });
        mntmMatriculadosCurso.addActionListener(e -> { 
        	new DlgMatriculadosCurso();
        });
		
        
	}

	public void actionPerformed(ActionEvent e) {
		System.exit(0);	
	}


}
