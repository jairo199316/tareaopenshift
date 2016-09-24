package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades;

import java.io.Serializable;

public class RespPregPK implements Serializable {

	private PregEvalPK idPregEval;
	private int idRespuesta;

	public RespPregPK() {
		// TODO Auto-generated constructor stub
	}

	public RespPregPK(PregEvalPK idPregEval, int idRespuesta) {
		super();
		this.idPregEval = idPregEval;
		this.idRespuesta = idRespuesta;
	}

	public PregEvalPK getIdPregEval() {
		return idPregEval;
	}

	public void setIdPregEval(PregEvalPK idPregEval) {
		this.idPregEval = idPregEval;
	}

	public int getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(int idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPregEval == null) ? 0 : idPregEval.hashCode());
		result = prime * result + idRespuesta;
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
		RespPregPK other = (RespPregPK) obj;
		if (idPregEval == null) {
			if (other.idPregEval != null)
				return false;
		} else if (!idPregEval.equals(other.idPregEval))
			return false;
		if (idRespuesta != other.idRespuesta)
			return false;
		return true;
	}

	
}
