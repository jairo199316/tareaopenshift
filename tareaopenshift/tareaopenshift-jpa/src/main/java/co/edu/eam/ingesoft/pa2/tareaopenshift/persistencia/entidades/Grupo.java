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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Alejandro
 *
 */
@Entity
@Table(name = "Grupos")
public class Grupo implements Serializable {

	@Id
	@Column(name = "idGrupo")
	private String idGrupo;
	
	@ManyToOne
	@JoinColumn(name = "idAsignatura")
	private Asignatura idAsignatura;
	
	@ManyToOne
	@JoinColumn(name = "idDocente")
	private Docente idDocente;
	
	@Column(name = "grupo")
	private String grupo;
	
	@Column(name = "anio")
	@Temporal(TemporalType.DATE)
	private Date anio;
	
	@Column(name = "periodo")
	private int periodo;

	// Constructor vacio
	public Grupo() {
		super();
	}

	// Constructor
	public Grupo(String idGrupo, Asignatura idAsignatura, Docente idDocente, String grupo, Date anio, int periodo) {
		super();
		this.idGrupo = idGrupo;
		this.idAsignatura = idAsignatura;
		this.idDocente = idDocente;
		this.grupo = grupo;
		this.anio = anio;
		this.periodo = periodo;
	}

	// Accesores y modificadores
	public String getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(String idGrupo) {
		this.idGrupo = idGrupo;
	}

	public Asignatura getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(Asignatura idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public Docente getIdDocente() {
		return idDocente;
	}

	public void setIdDocente(Docente idDocente) {
		this.idDocente = idDocente;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
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
