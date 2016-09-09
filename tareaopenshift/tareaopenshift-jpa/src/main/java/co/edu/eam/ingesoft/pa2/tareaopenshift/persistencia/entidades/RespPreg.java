/**
 * 
 */
package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Alejandro
 *
 */
@Entity
@Table(name = "RespuestasPreg")
public class RespPreg implements Serializable {

	@Id
	@Column(name = "idRespuestasPreg")
	private int idRespPreg;

	@ManyToOne
	@JoinColumn(name = "idRespuesta")
	private Respuesta idRespuesta;

	@ManyToOne
	@JoinColumn(name = "idPregunta")
	private Pregunta idPregunta;

	@ManyToOne
	@JoinColumn(name = "idEvaluacion")
	private Evaluacion idEvaluacion;
	
	@Column(name = "calificacion")
	private double calificacion;

	// Constructor vacio
	public RespPreg() {
		super();
	}

	// Constructor
	public RespPreg(Respuesta idRespuesta, Pregunta idPregunta, Evaluacion idEvaluacion, double calificacion) {
		super();
		this.idRespuesta = idRespuesta;
		this.idPregunta = idPregunta;
		this.idEvaluacion = idEvaluacion;
		this.calificacion = calificacion;
	}

	// Accesores y modificadores

	public Respuesta getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(Respuesta idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	public Pregunta getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Pregunta idPregunta) {
		this.idPregunta = idPregunta;
	}

	public Evaluacion getIdEvaluacion() {
		return idEvaluacion;
	}

	public void setIdEvaluacion(Evaluacion idEvaluacion) {
		this.idEvaluacion = idEvaluacion;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
}
