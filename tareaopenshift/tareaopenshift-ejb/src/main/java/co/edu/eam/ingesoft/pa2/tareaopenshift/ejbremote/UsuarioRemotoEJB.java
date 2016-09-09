package co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote;

import java.util.List;

import co.edu.eam.ingesoft.pa2.tareaopenshift.interfaces.InterfaceEJBGenerica;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Usuario;

public interface UsuarioRemotoEJB extends InterfaceEJBGenerica<Usuario> {
	/**
	 * busca un usuario por su user
	 * 
	 * @param user
	 *            el usr del usuario a buscar
	 * @return el usuario si lo encuentra, de lo contrario null
	 */
	public List<Usuario> buscarPorUsuario(String user);
}
