/**
 * 
 */
package  co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades;


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
@Table(name = "Asiganaturas")
public class Asignatura implements Serializable {
	
	@Id
	@Column(name = "idAsiganatura")
	private String idAsignatura;
	
	@Column(name = "nombre")
	private String nombreAsignatura;
	
	@ManyToOne
	@JoinColumn(name = "idPrograma")
	private Programa idPrograma;

	// Constructor vacio
	public Asignatura() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param idAsignatura
	 * @param nombreAsignatura
	 * @param idPrograma
	 */
	public Asignatura(String idAsignatura, String nombreAsignatura, Programa idPrograma) {
		super();
		this.idAsignatura = idAsignatura;
		this.nombreAsignatura = nombreAsignatura;
		this.idPrograma = idPrograma;
	}

	// Accesores y modificadores

	public String getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(String idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public Programa getIdPrograma() {
		return idPrograma;
	}

	public void setIdPrograma(Programa idPrograma) {
		this.idPrograma = idPrograma;
	}

}
