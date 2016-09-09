package co.edu.eam.ingesoft.pa2.tareaopenshift.bos;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote.AsignaturaRemoteEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.pa2.tareaopenshift.implementacion.EJBGenerico;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Asignatura;

@LocalBean
@Stateless
@Remote(AsignaturaRemoteEJB.class)
public class AsignaturaEJB extends EJBGenerico<Asignatura> implements AsignaturaRemoteEJB {

	@Override
	public Class getClase() {
		// TODO Auto-generated method stub
		return Asignatura.class;
	}

	public void crear(Asignatura asignatura) {
		if (buscar(asignatura.getIdAsignatura()) == null) {
			dao.crear(asignatura);
		} else {
			throw new ExcepcionNegocio("Ya se encuentra esta asignatura");
		}
	}

	public Asignatura buscar(Object pk) {
		return dao.buscar(pk);
	}

}
