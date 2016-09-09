package co.edu.eam.ingesoft.pa2.tareaopenshift.bos;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote.PreguntaRemoteEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.implementacion.EJBGenerico;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Pregunta;

@LocalBean
@Stateless
@Remote(PreguntaRemoteEJB.class)
public class PreguntaEJB extends EJBGenerico<Pregunta> implements PreguntaRemoteEJB {

	@Override
	public Class getClase() {
		// TODO Auto-generated method stub
		return Pregunta.class;
	}

	public void crear(Pregunta pregunta) {
		dao.crear(pregunta);
	}

	public Pregunta buscar(Object pk) {
		return dao.buscar(pk);
	}

	@Override
	public List<Pregunta> listarPreguntas(){
		return dao.ejecutarNamedQuery(Pregunta.LISTA_PREGUNTAS);
	}
}
