/**
 * 
 */
package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Alejandro
 *
 */
@Entity
@Table(name = "RespuestasPreg")
@IdClass(value = RespPregPK.class)
public class RespPreg implements Serializable {

	@Id
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "idPregunta", referencedColumnName = "idPregunta"),
			@JoinColumn(name = "idEvaluacion", referencedColumnName = "idEvaluacion") })
	private PregEval idPregEval;

	@Id
	@ManyToOne
	@JoinColumn(name = "idRespuesta")
	private Respuesta idRespuesta;

	@Column(name = "calificacion")
	private double calificacion;

	// Constructor vacio
	public RespPreg() {
		super();
	}

	public RespPreg(PregEval idPregEval, Respuesta idRespuesta, double calificacion) {
		super();
		this.idPregEval = idPregEval;
		this.idRespuesta = idRespuesta;
		this.calificacion = calificacion;
	}

	public PregEval getIdPregEval() {
		return idPregEval;
	}

	public void setIdPregEval(PregEval idPregEval) {
		this.idPregEval = idPregEval;
	}

	public Respuesta getIdEvaluacion() {
		return idRespuesta;
	}

	public void setIdEvaluacion(Respuesta idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	
}
