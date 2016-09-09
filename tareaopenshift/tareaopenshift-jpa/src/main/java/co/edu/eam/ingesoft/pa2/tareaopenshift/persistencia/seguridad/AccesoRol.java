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

@Entity
@IdClass(value = AccesoRolPK.class)
@Table(name = "AccesoRoles")
@NamedQueries({ @NamedQuery(name = AccesoRol.LISTAR_ACCESOS, query = "select aR.acceso from AccesoRol aR where aR.rol=?1") })
public class AccesoRol implements Serializable {

	public static final String LISTAR_ACCESOS = "AccesosRol.listarPorRol";
	
	@Id
	@ManyToOne
	@JoinColumn(name = "rol")
	private Rol rol;

	@Id
	@ManyToOne
	@JoinColumn(name = "acceso")
	private Acceso acceso;

	public AccesoRol() {
		super();
	}

	public AccesoRol(Rol rol, Acceso acceso) {
		super();
		this.rol = rol;
		this.acceso = acceso;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Acceso getAcceso() {
		return acceso;
	}

	public void setAcceso(Acceso acceso) {
		this.acceso = acceso;
	}

}
