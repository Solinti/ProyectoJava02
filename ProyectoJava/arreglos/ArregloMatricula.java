package arreglos;

import clases.Matricula;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArregloMatricula {
	
	private ArrayList<Matricula> mat;
	private int numMatricula = 100001;
    
	public ArregloMatricula() {
		mat = new ArrayList<>();
	}
	
	public void adicionar(Matricula m) {
		mat.add(m);
		numMatricula ++;
	}
	
	public int tamano() {
		return mat.size();
	}
	
	public Matricula obtener(int i) {
		return mat.get(i);
	}
}
