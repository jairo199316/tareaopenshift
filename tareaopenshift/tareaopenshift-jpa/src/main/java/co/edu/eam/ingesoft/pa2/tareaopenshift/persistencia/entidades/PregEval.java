/**
 * 
 */
package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Alejandro
 *
 */
@Entity
@Table(name = "PreguntasEval")
@IdClass(value = PregEvalPK.class)
public class PregEval implements Serializable {

	@Id
	@ManyToOne
	@JoinColumn(name = "idPregunta")
	private Pregunta idPregunta;

	@Id
	@ManyToOne
	@JoinColumn(name = "idEvaluacion")
	private Evaluacion idEvaluacion;

	// Constructor vacio
	public PregEval() {
		super();
	}

	// Constructor
	public PregEval(Pregunta idPregunta, Evaluacion idEvalua) {
		super();
		this.idPregunta = idPregunta;
		this.idEvaluacion = idEvalua;
	}

	// Accesores y modificadores
	public Pregunta getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Pregunta idPregunta) {
		this.idPregunta = idPregunta;
	}

	public Evaluacion getIdEvaluacion() {
		return idEvaluacion;
	}

	public void setIdEvaluacion(Evaluacion idEvalua) {
		this.idEvaluacion = idEvalua;
	}

}
