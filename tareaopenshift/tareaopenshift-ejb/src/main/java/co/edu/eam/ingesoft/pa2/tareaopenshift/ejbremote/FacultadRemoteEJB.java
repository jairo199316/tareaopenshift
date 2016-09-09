/**
 * 
 */
package co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote;

import java.util.List;

import co.edu.eam.ingesoft.pa2.tareaopenshift.interfaces.InterfaceEJBGenerica;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Facultad;


/**
 * @author Alejandro
 *
 */
public interface FacultadRemoteEJB  extends InterfaceEJBGenerica<Facultad>{

	public List<Facultad>listarFacultad();
	
}
