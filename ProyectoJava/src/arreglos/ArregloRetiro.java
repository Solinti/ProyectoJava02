package arreglos;

import clases.Retiro;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArregloRetiro {
	
	private ArrayList<Retiro> ret;
	private int numRetiro = 202010001;
    
	public ArregloRetiro() {
		ret = new ArrayList<>();
	}
	
	public void adicionar(Retiro r) {
		ret.add(r);
		numRetiro ++;
	}
	
	public int tamano() {
		return ret.size();
	}
	
	public Retiro obtener(int i) {
		return ret.get(i);
	}
}
