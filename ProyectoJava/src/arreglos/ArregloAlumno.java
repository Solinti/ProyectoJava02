package arreglos;

import clases.Alumno;

import java.util.ArrayList;

public class ArregloAlumno {
	
	private ArrayList<Alumno> alu;
    
	public ArregloAlumno() {
		alu = new ArrayList<>();
		//adicionar(new Alumno(202010001, "Alex","Fabian","12345678", 20, 9090900, "Registrado"));
	}
	
	public void adicionar(Alumno a) {
		alu.add(a);
	}
	
	public int tamano() {
		return alu.size();
	}
	
	public Alumno obtener(int i) {
		return alu.get(i);
	}
	
	public Alumno consultar(int cod) {
		for(int i=0;i<tamano();i++) {
	   		if(obtener(i).getCodAlumno()==cod)
	   			return obtener(i);
	   	}
	   	return null;
	}
	
	public void modificar(int i,Alumno a) {
		alu.set(i,a);
    }
	
	public void eliminar(Alumno a) {
	        alu.remove(a);
	}

	
}
