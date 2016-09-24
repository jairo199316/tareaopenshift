package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades;

import java.io.Serializable;

public class GrupoEstudianteEvalPK implements Serializable{

	private String idGrupo;
	private String idEstudiante;

	public GrupoEstudianteEvalPK() {
		// TODO Auto-generated constructor stub
	}

	public GrupoEstudianteEvalPK(String idGrupo, String idEstudiante) {
		super();
		this.idGrupo = idGrupo;
		this.idEstudiante = idEstudiante;
	}

	public String getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(String idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(String idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEstudiante == null) ? 0 : idEstudiante.hashCode());
		result = prime * result + ((idGrupo == null) ? 0 : idGrupo.hashCode());
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
		GrupoEstudianteEvalPK other = (GrupoEstudianteEvalPK) obj;
		if (idEstudiante == null) {
			if (other.idEstudiante != null)
				return false;
		} else if (!idEstudiante.equals(other.idEstudiante))
			return false;
		if (idGrupo == null) {
			if (other.idGrupo != null)
				return false;
		} else if (!idGrupo.equals(other.idGrupo))
			return false;
		return true;
	}

}
