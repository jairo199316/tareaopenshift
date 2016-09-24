package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.dto;

public class ResponderEvalDTO {

	private int preg;
	private int eva;
	private String grupo;
	private double calificacion;
	private String comentario;
	private String estudianete;

	public ResponderEvalDTO() {
		// TODO Auto-generated constructor stub
	}

	public ResponderEvalDTO(int preg, int eva, String grupo, double calificacion, String comentario,
			String estudianete) {
		super();
		this.preg = preg;
		this.eva = eva;
		this.grupo = grupo;
		this.calificacion = calificacion;
		this.comentario = comentario;
		this.estudianete = estudianete;
	}

	public int getPreg() {
		return preg;
	}

	public void setPreg(int preg) {
		this.preg = preg;
	}

	public int getEva() {
		return eva;
	}

	public void setEva(int eva) {
		this.eva = eva;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getEstudianete() {
		return estudianete;
	}

	public void setEstudianete(String estudianete) {
		this.estudianete = estudianete;
	}

}
