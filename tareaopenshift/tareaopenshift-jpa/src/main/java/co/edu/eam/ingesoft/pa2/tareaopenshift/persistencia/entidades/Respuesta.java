package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades;


/**
 * @author Alejandro
 *
 */
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;

@Entity
@Table(name = "Respuestas")
public class Respuesta implements Serializable {
	
	@Id
	@Column(name = "idRespuestas")
	private int idRespuestas;

	@ManyToOne
	@JoinColumn(name = "idGrupo")
	private Grupo idGrupo;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date fecha_Hora;
	
	@Column(name = "comentario")
	private String comentario;

	// Constructor vacio
	public Respuesta() {
		super();
	}

	// Constructor
	public Respuesta(int idRespuestas, Grupo idGrupo, Date fecha_Hora, String comentario) {
		super();
		this.idRespuestas = idRespuestas;
		this.idGrupo = idGrupo;
		this.fecha_Hora = fecha_Hora;
		this.comentario = comentario;
	}

	// Accesores y modificadores
	public int getIdRespuestas() {
		return idRespuestas;
	}

	public void setIdRespuestas(int idRespuestas) {
		this.idRespuestas = idRespuestas;
	}

	public Grupo getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Grupo idGrupo) {
		this.idGrupo = idGrupo;
	}

	public Date getFecha_Hora() {
		return fecha_Hora;
	}

	public void setFecha_Hora(Date fecha_Hora) {
		this.fecha_Hora = fecha_Hora;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
