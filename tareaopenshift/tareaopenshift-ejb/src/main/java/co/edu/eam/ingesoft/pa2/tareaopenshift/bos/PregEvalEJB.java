package co.edu.eam.ingesoft.pa2.tareaopenshift.bos;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote.PregEvalRemoteEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.implementacion.EJBGenerico;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.PregEval;

@LocalBean
@Stateless
@Remote(PregEvalRemoteEJB.class)
public class PregEvalEJB extends EJBGenerico<PregEval> implements PregEvalRemoteEJB {

	@Override
	public Class getClase() {
		// TODO Auto-generated method stub
		return PregEval.class;
	}

	public void crear(PregEval pregEval) {
		dao.crear(pregEval);
	}

}
