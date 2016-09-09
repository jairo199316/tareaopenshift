/**
 * 
 */
package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades;


import java.io.Serializable;
import java.time.Year;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Alejandro
 *
 */
@Entity
@Table(name = "Evaluaciones")
public class Evaluacion implements Serializable {

	@Id
	@Column(name = "idEvaluacion")
	private int idEvaluacion;
	
	@Column(name = "fechaCreacion")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "anio")
	@Temporal(TemporalType.DATE)
	private Date anio;
	
	@Column(name = "periodo")
	private int periodo;

	// Constructor vacio
	public Evaluacion() {
		super();
	}

	// Constructor
	public Evaluacion(int idEvaluacion, Date fechaCreacion, String estado, Date anio, int periodo) {
		super();
		this.idEvaluacion = idEvaluacion;
		this.fechaCreacion = fechaCreacion;
		this.estado = estado;
		this.anio = anio;
		this.periodo = periodo;
	}

	// Accesores y modificadores
	public int getIdEvaluacion() {
		return idEvaluacion;
	}

	public void setIdEvaluacion(int idEvaluacion) {
		this.idEvaluacion = idEvaluacion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getAnio() {
		return anio;
	}

	public void setAnio(Date anio) {
		this.anio = anio;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
}
