package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades;

import java.io.Serializable;

public class PregEvalPK implements Serializable {

	private int idPregunta;

	private int idEvaluacion;

	public PregEvalPK() {
		// TODO Auto-generated constructor stub
	}

	public PregEvalPK(int idPregunta, int idEvalua) {
		super();
		this.idPregunta = idPregunta;
		this.idEvaluacion = idEvalua;
	}

	public int getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(int idPregunta) {
		this.idPregunta = idPregunta;
	}

	public int getIdEvaluacion() {
		return idEvaluacion;
	}

	public void setIdEvaluacion(int idEvaluacion) {
		this.idEvaluacion = idEvaluacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEvaluacion;
		result = prime * result + idPregunta;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PregEvalPK other = (PregEvalPK) obj;
		if (idEvaluacion != other.idEvaluacion)
			return false;
		if (idPregunta != other.idPregunta)
			return false;
		return true;
	}
	
	
}
