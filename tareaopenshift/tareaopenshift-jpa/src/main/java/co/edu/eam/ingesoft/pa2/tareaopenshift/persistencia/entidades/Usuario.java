/**
 * 
 */
package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * @author JAIRO
 *
 */
@Entity
@Table(name = "Usuario")
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries({ @NamedQuery(name = Usuario.BUSCAR_USER, query = "select u from Usuario u where u.user=?1") })
@XmlSeeAlso({ Decano.class, Coordinador.class })
public class Usuario implements Serializable {

	public static final String BUSCAR_USER = "Usuario.buscar";
	@Id
	@Column(name = "idUsuario")
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "usuario")
	private String user;

	@Column(name = "password")
	private String password;

	public Usuario() {
		super();
	}

	public Usuario(int id, String nombre, String apellido, String usuario, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.user = usuario;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getUsuario() {
		return user;
	}

	public void setUsuario(String usuario) {
		this.user = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
