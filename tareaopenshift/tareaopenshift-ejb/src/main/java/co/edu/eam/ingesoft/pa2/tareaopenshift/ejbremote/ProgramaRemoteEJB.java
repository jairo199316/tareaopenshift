/**
 * 
 */
package co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote;

import java.util.List;

import co.edu.eam.ingesoft.pa2.tareaopenshift.interfaces.InterfaceEJBGenerica;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Programa;

/**
 * @author Alejandro
 *
 */
public interface ProgramaRemoteEJB  extends InterfaceEJBGenerica<Programa>{

	public List<Programa> listarPrograma();
}
