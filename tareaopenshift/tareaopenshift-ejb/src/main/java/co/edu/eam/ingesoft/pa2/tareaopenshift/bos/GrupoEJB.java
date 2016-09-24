package co.edu.eam.ingesoft.pa2.tareaopenshift.bos;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote.GrupoRemoteEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.pa2.tareaopenshift.implementacion.EJBGenerico;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Grupo;

@LocalBean
@Stateless
@Remote(GrupoRemoteEJB.class)
public class GrupoEJB extends EJBGenerico<Grupo> implements GrupoRemoteEJB {

	@Override
	public Class getClase() {
		// TODO Auto-generated method stub
		return Grupo.class;
	}

	public void crear(Grupo g) {
		if (buscar(g.getIdGrupo()) == null) {
			dao.crear(g);
		} else {
			throw new ExcepcionNegocio("Ya existe este grupo");
		}
	}

	public Grupo buscar(Object pk) {
		return dao.buscar(pk);
	}
}
