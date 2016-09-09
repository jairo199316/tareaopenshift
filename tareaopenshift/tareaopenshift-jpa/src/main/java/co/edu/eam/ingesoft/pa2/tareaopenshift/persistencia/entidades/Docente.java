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
@Table(name = "Docentes")
public class Docente implements Serializable {

	@Id
	@Column(name = "idDocente")
	private String id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@ManyToOne
	@JoinColumn(name = "idPrograma")
	private Programa idPrograma;

	// Constructor vacio
	public Docente() {
		super();
	}

	// Constructor
	public Docente(String id, String nombre, String apellido, Programa idPrograma) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.idPrograma = idPrograma;
	}

	// Metodos modificadores y accesores
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Programa getIdPrograma() {
		return idPrograma;
	}

	public void setIdPrograma(Programa idPrograma) {
		this.idPrograma = idPrograma;
	}

}
