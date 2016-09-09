package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.seguridad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="Roles")
public class Rol implements Serializable {

	@Id
	@SequenceGenerator(name = "rol_seq", sequenceName = "rol_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="rol_seq")	
	@Column(name="id_rol")
	private String id;
	
	@Column(name="descripcion")
	private String descripcion;

	public Rol() {
		super();
	}

	public Rol(String id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getId() {
		return id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setId(String id) {
		this.id = id;
	}

}
