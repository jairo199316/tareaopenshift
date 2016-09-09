package co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote;

import java.util.List;

import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Usuario;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.seguridad.Acceso;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.seguridad.Rol;

public interface SeguridadRemoteEJB {

	public List<Rol> listarRolesPorUsuario(Usuario usuario);

	public List<Acceso> listarAccesosPorRol(Rol rol);
}
