package clases;

public class Matricula {
	
	private int numMatrcula;
	private int codAlumno;
	private int codCurso;
	private String fecha; 
	private String hora;
	
	public Matricula(int numMatrcula, int codAlumno, int codCurso, String fecha, String hora) {
		this.numMatrcula = numMatrcula;
		this.codAlumno = codAlumno;
		this.codCurso = codCurso;
		this.fecha = fecha;
		this.hora = hora;
	}

	public int getNumMatrcula() {
		return numMatrcula;
	}

	public void setNumMatrcula(int numMatrcula) {
		this.numMatrcula = numMatrcula;
	}

	public int getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(int codAlumno) {
		this.codAlumno = codAlumno;
	}

	public int getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
	
}
