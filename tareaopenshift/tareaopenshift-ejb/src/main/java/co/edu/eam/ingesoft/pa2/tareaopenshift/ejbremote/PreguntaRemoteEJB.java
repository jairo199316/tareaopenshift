package co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote;

import java.util.List;

import co.edu.eam.ingesoft.pa2.tareaopenshift.interfaces.InterfaceEJBGenerica;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Pregunta;





public interface PreguntaRemoteEJB extends InterfaceEJBGenerica<Pregunta> {

	public List<Pregunta> listarPreguntas();
}
