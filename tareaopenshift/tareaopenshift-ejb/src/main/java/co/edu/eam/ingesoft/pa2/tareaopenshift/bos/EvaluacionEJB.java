package co.edu.eam.ingesoft.pa2.tareaopenshift.bos;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote.EvaluacionRemoteEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.pa2.tareaopenshift.implementacion.EJBGenerico;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Evaluacion;

@LocalBean
@Stateless
@Remote(EvaluacionRemoteEJB.class)
public class EvaluacionEJB extends EJBGenerico<Evaluacion> implements EvaluacionRemoteEJB {

	@Override
	public Class getClase() {
		// TODO Auto-generated method stub
		return Evaluacion.class;
	}

	public void crear(Evaluacion eva) {
		if (buscar(eva.getIdEvaluacion()) == null) {
			dao.crear(eva);
		} else {
			throw new ExcepcionNegocio("Ya se encuentra esta evaluacion");
		}
	}

	public Evaluacion buscar(Object pk) {
		return dao.buscar(pk);
	}

}
