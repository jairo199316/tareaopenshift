package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.seguridad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Usuario;

@Entity
@IdClass(value = UsuarioRolPK.class)
@Table(name = "UsuarioRol")
@NamedQueries({
		@NamedQuery(name = UsuarioRol.LISTAR_ROL_USUARIO, query = "select uR.rol from UsuarioRol uR where uR.usuario=?1") })
public class UsuarioRol implements Serializable {

	public static final String LISTAR_ROL_USUARIO = "usuarioRol.listar";

	@Id
	@ManyToOne
	@JoinColumn(name = "usuario")
	private Usuario usuario;

	@Id
	@ManyToOne
	@JoinColumn(name = "rol")
	private Rol rol;

	public UsuarioRol() {
		super();
	}

	public UsuarioRol(Usuario usuario, Rol rol) {
		super();
		this.usuario = usuario;
		this.rol = rol;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}
