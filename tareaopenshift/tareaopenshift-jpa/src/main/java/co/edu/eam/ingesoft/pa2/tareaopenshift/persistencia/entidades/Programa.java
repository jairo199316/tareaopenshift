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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Alejandro
 *
 */
@Entity
@Table(name = "Programa")
@NamedQueries({ @NamedQuery(name = Programa.LISTA_PROGRAMAS, query = "select a from Programa a") })
public class Programa implements Serializable {

	public static final String LISTA_PROGRAMAS = "Programa.listar";

	@Id
	@Column(name = "idPrograma")
	private String idPrograma;

	@Column(name = "nombrePrograma")
	private String nombrePrograma;

	@ManyToOne
	@JoinColumn(name = "idFacultad")
	private Facultad idFacultad;

	// Constructor vacio
	public Programa() {
		super();
	}

	/**
	 * @param idPrograma
	 * @param nombrePrograma
	 * @param idFacultad
	 */
	public Programa(String idPrograma, String nombrePrograma, Facultad idFacultad) {
		super();
		this.idPrograma = idPrograma;
		this.nombrePrograma = nombrePrograma;
		this.idFacultad = idFacultad;
	}

	// Accesores y modificadores
	public String getIdPrograma() {
		return idPrograma;
	}

	public void setIdPrograma(String idPrograma) {
		this.idPrograma = idPrograma;
	}

	public String getNombrePrograma() {
		return nombrePrograma;
	}

	public void setNombrePrograma(String nombrePrograma) {
		this.nombrePrograma = nombrePrograma;
	}

	public Facultad getIdFacultad() {
		return idFacultad;
	}

	public void setIdFacultad(Facultad idFacultad) {
		this.idFacultad = idFacultad;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Programa) {
			Programa tmpProgama = (Programa) obj;
			if (this.nombrePrograma.equals(tmpProgama.nombrePrograma) && this.idPrograma.equals(tmpProgama.idPrograma)
					&& this.idFacultad.equals(tmpProgama.idFacultad)) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}
}
