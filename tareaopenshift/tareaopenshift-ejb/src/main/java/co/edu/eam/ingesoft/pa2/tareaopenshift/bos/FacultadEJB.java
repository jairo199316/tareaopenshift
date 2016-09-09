/**
 * 
 */
package co.edu.eam.ingesoft.pa2.tareaopenshift.bos;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote.FacultadRemoteEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.pa2.tareaopenshift.implementacion.EJBGenerico;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Facultad;

/**
 * @author Alejandro
 *
 */
@LocalBean
@Stateless
@Remote(FacultadRemoteEJB.class)
public class FacultadEJB extends EJBGenerico<Facultad> implements FacultadRemoteEJB {

	@Override
	public List<Facultad> listarFacultad() {
		return dao.ejecutarNamedQuery(Facultad.LISTA_FACULTADES);
	}

	public Facultad buscar(Object pk) {
		return dao.buscar(pk);
	}

	
	public void crear(Facultad facultad){
		if (buscar(facultad.getIdFacultad()) == null) {
			dao.crear(facultad);
		} else {
			throw new ExcepcionNegocio("La facultad ya se encuentra registrado");
		}
	}
	
	@Override
	public Class getClase() {
		// TODO Auto-generated method stub
		return Facultad.class;
	}

}
