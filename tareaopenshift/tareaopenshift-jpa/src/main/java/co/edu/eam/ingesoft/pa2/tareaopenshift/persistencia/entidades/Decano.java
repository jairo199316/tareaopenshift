/**
 * 
 */
package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Alejandro
 *
 */
@Entity
@Table(name = "Decanos")
public class Decano extends Usuario implements Serializable {

	@ManyToOne
	@JoinColumn(name = "idFacultad")
	private Facultad idFacultad;

	public Decano() {
		super();
	}

	// Constructor
	public Decano(String nombre, String apellido, String user, String password, int idUsuario,
			Facultad idFacultad) {
		super(idUsuario, nombre, apellido, user, password);
		this.idFacultad = idFacultad;
	}

	// Accesores y modificadores

	public Facultad getIdFacultad() {
		return idFacultad;
	}

	public void setIdFacultad(Facultad idFacultad) {
		this.idFacultad = idFacultad;
	}

}
