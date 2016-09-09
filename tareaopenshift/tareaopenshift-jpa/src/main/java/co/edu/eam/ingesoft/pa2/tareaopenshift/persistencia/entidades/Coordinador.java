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
@Table(name = "Coordinadores")
public class Coordinador extends Usuario implements Serializable {

	@ManyToOne
	@JoinColumn(name = "idPrograma")
	private Programa idPrograma;

	public Coordinador() {
		super();
	}

	// Constructor
	public Coordinador(String nombre, String apellido, String user, String password, int idUsuario,
			Programa idPrograma) {
		super(idUsuario, nombre, apellido, user, password);
		this.idPrograma = idPrograma;
	}

	public Programa getIdPrograma() {
		return idPrograma;
	}

	public void setIdPrograma(Programa idPrograma) {
		this.idPrograma = idPrograma;
	}

}
