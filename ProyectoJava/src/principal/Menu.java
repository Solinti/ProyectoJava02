
package principal;

import mantenimiento.Alumno;
import mantenimiento.Curso;
import registro.Matricula;
import registro.Retiro;
import consulta.AlumnosCursos;
import consulta.MatriculaRetiros;
import reporte.MatriculaPendiente;
import reporte.MatriculaVigente;
import reporte.MatriculadosCurso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Menu principal del sistema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmAlumno = new JMenuItem("Alumno");
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
		
		JMenuItem mntmAlumnosCursos = new JMenuItem("Alumnos y cursos");
		mnConsulta.add(mntmAlumnosCursos);
		
		JMenuItem mntmMatriculaRetiros = new JMenuItem("Matrículas y retiros");
		mnConsulta.add(mntmMatriculaRetiros);
		
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
        	new Alumno();
        });
        mntmCurso.addActionListener(e -> { 
        	new Curso();
        });
        mntmMatricula.addActionListener(e -> { 
        	new Matricula();
        });
        mntmRetiro.addActionListener(e -> { 
        	new Retiro();
        });
        mntmAlumnosCursos.addActionListener(e -> { 
        	new AlumnosCursos();
        });
        mntmMatriculaRetiros.addActionListener(e -> { 
        	new MatriculaRetiros();
        });
        mntmMatriculaPendiente.addActionListener(e -> { 
        	new MatriculaPendiente();
        });
        mntmMatriculaVigente.addActionListener(e -> { 
        	new MatriculaVigente();
        });
        mntmMatriculadosCurso.addActionListener(e -> { 
        	new MatriculadosCurso();
        });
		
        
	}


}
