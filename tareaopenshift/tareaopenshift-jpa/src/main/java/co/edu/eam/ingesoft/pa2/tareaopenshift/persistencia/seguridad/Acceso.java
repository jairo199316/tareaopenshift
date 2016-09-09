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
@Table(name = "Accesos")
public class Acceso implements Serializable {

	@Id
	@SequenceGenerator(name = "accesos_seq", sequenceName = "accesos_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accesos_seq")
	@Column(name = "idAcceso")
	private String id;

	@Column(name = "url")
	private String url;

	@Column(name = "nombre")
	private String nombre;

	public Acceso() {
		super();
	}

	public Acceso(String id, String url, String nombre) {
		super();
		this.id = id;
		this.url = url;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
