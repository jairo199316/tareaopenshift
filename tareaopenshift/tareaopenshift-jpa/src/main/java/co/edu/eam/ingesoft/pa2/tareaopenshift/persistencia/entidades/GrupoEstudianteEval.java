package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GruposEstudiantesEval")
@IdClass(GrupoEstudianteEvalPK.class)
public class GrupoEstudianteEval implements Serializable {

	@Id
	@ManyToOne
	@JoinColumn(name = "idGrupo")
	private Grupo idGrupo;

	@Id
	@Column(name = "idEstudiante")
	private String idEstudiante;

	@Column(name = "estado")
	private boolean estado;

	public GrupoEstudianteEval() {
		// TODO Auto-generated constructor stub
	}

	public GrupoEstudianteEval(Grupo grupo, String idEstudiante, boolean estado) {
		super();
		this.idGrupo = grupo;
		this.idEstudiante = idEstudiante;
		this.estado = estado;
	}

	public Grupo getGrupo() {
		return idGrupo;
	}

	public void setGrupo(Grupo grupo) {
		this.idGrupo = grupo;
	}

	public String getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(String idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
