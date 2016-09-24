package co.edu.eam.ingesoft.pa2.tareaopenshift.bos;

import java.util.GregorianCalendar;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote.RespPregRemoteEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote.RespuestaRemoteEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.pa2.tareaopenshift.implementacion.EJBGenerico;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.dto.ResponderEvalDTO;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Evaluacion;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Grupo;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.PregEval;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Pregunta;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.RespPreg;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Respuesta;

@LocalBean
@Stateless
@Remote(RespPregRemoteEJB.class)
public class RespuestaEJB extends EJBGenerico<Respuesta> implements RespuestaRemoteEJB {

	@EJB
	private EvaluacionEJB evaluacionEJB;

	@EJB
	private PregEvalEJB pregEvalEJB;

	@EJB
	private RespPregEJB respPregEJB;

	@EJB
	private GrupoEJB grupoEJB;

	@EJB
	private PreguntaEJB preguntaEJB;

	private PruebaWSLDEJB wsdlEJB;

	@Override
	public Class getClase() {
		// TODO Auto-generated method stub
		return Respuesta.class;
	}

	public void crear(Respuesta resp) {
		if (buscar(resp.getIdRespuestas()) == null) {
			dao.crear(resp);
		} else {
			throw new ExcepcionNegocio("Ya existe esta respuesta");
		}
	}

	public void crear(ResponderEvalDTO datosDto) {

		Pregunta p = preguntaEJB.buscar(datosDto.getPreg());

		Evaluacion e = evaluacionEJB.buscar(datosDto.getEva());

		Grupo g = grupoEJB.buscar(datosDto.getGrupo());

		PregEval pregEval = new PregEval(p, e);
		pregEvalEJB.crear(pregEval);

		Respuesta r = new Respuesta(2, g, GregorianCalendar.getInstance().getTime(), datosDto.getComentario());
		crear(r);

		RespPreg respPreg = new RespPreg(pregEval, r, datosDto.getCalificacion());
		respPregEJB.crear(respPreg);

	}

	public Respuesta buscar(Object pk) {
		return dao.buscar(pk);
	}
}
