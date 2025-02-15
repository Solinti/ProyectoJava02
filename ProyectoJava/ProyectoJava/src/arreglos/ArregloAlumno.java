package arreglos;

import clases.Alumno;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArregloAlumno {
	
	private ArrayList<Alumno> alu;
	private int codAlumno = 202010001;
    
	public ArregloAlumno() {
		alu = new ArrayList<>();
		adicionar(new Alumno(codAlumno, "alex","fabian","7040", 20, 9090900));
	}
	
	public void adicionar(Alumno a) {
		alu.add(a);
		codAlumno++;
	}
	
	public int tamano() {
		return alu.size();
	}
	
	public Alumno obtener(int i) {
		return alu.get(i);
	}
	
	
	
}
