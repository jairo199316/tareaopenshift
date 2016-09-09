package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.seguridad;

import java.io.Serializable;

public class UsuarioRolPK implements Serializable {

	private int usuario;

	private String rol;

	public UsuarioRolPK() {
		super();
	}

	public UsuarioRolPK(int usuario, String rol) {
		super();
		this.usuario = usuario;
		this.rol = rol;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rol == null) ? 0 : rol.hashCode());
		result = prime * result + ((String.valueOf(usuario) == null) ? 0 : String.valueOf(usuario).hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioRolPK other = (UsuarioRolPK) obj;
		if (rol == null) {
			if (other.rol != null)
				return false;
		} else if (!rol.equals(other.rol))
			return false;
		if (String.valueOf(usuario) == null) {
			if (String.valueOf(usuario) != null)
				return false;
		} else if (!String.valueOf(usuario).equals(other.usuario))
			return false;
		return true;
	}

}
