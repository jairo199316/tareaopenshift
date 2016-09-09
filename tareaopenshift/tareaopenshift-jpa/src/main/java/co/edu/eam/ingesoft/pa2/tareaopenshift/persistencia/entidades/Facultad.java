/**
 * 
 */
package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Alejandro
 *
 */
@Table(name = "Facultad")
@Entity
@NamedQueries({ @NamedQuery(name = Facultad.LISTA_FACULTADES, query = "select f from Facultad f") })
public class Facultad implements Serializable {

	public static final String LISTA_FACULTADES = "Facultad.listar";

	@Id
	@Column(name = "idFacultad")
	private String idFacultad;

	@Column(name = "nombre")
	private String nombre;

	// Constructor vacio
	public Facultad() {
		super();
	}

	// Constructor
	public Facultad(String idFacultad, String nombre) {
		super();
		this.idFacultad = idFacultad;
		this.nombre = nombre;
	}

	// Accesores y modificadores
	public String getIdFacultad() {
		return idFacultad;
	}

	public void setIdFacultad(String idFacultad) {
		this.idFacultad = idFacultad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Facultad) {
			Facultad tmpPersona = (Facultad) obj;
			if (this.nombre.equals(tmpPersona.nombre) && this.idFacultad.equals(tmpPersona.idFacultad)) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

}
