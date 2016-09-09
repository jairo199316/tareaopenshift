package co.edu.eam.ingesoft.pa2.tareaopenshift.controladores;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.PreguntaEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.ProgramaEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.interceptor.Secured;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Pregunta;

@Named("preguntasWeb")
@ViewScoped
public class ControladorRegistroPreguntas implements Serializable {

	@EJB
	private PreguntaEJB preguntaEJB;

	/**
	 * Identificador de la pregunta
	 */
	private int idPregrunta;

	/**
	 * La pregunta
	 */
	private String pregunta;

	/**
	 * El valor de la pregunta
	 */
	private double peso;

	/**
	 * crea una pregunta
	 */
	@Secured
	public void crear() {
		try {
			if (pregunta != "") {
				idPregrunta = preguntaEJB.listarPreguntas().size();
				Pregunta p = new Pregunta(idPregrunta, pregunta, peso);
				preguntaEJB.crear(p);
				FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
						"se registro la pregunta con exito", null);
				FacesContext.getCurrentInstance().addMessage(null, message);
			} else {
				FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Señor usuario, todos los campos son obligatorios", null);
				FacesContext.getCurrentInstance().addMessage(null, message);
			}
		} catch (Exception e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, e.getMessage(), null);
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}

	public int getIdPregrunta() {
		return idPregrunta;
	}

	public double getPeso() {
		return peso;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setIdPregrunta(int idPregrunta) {
		this.idPregrunta = idPregrunta;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

}
