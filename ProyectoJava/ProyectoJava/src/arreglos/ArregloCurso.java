package arreglos;

import clases.Curso;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArregloCurso {
	 
	private ArrayList<Curso> cur;
	
	public ArregloCurso() {
		cur = new ArrayList<>();
	}
	
	public void adicionar(Curso c) {
		cur.add(c);
	}
	
	public int tamano() {
		return cur.size();
	}
	
	public Curso obtener(int i) {
		return cur.get(i);
	}
	
}
