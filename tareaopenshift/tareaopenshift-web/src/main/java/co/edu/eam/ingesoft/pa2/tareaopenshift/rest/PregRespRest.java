package co.edu.eam.ingesoft.pa2.tareaopenshift.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.PreguntaEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.RespuestaEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.dto.RespuestaDTO;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.dto.ResponderEvalDTO;
import co.edu.eam.ingesoft.pa2.tareaopenshift.seguridad.Secured;

@Secured
@Path("/pregresp")
public class PregRespRest {

	@EJB
	private PreguntaEJB preguntaEJB;

	@EJB
	private RespuestaEJB respuestaEJB;

	public PregRespRest() {
	}

	@GET
	@Path("/preguntas")
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaDTO listarPreguntas() {
		return new RespuestaDTO(preguntaEJB.listarPreguntas());
	}

	@PUT
	@Path("/respuesta")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void crearRespuesta(ResponderEvalDTO datosDto) {

		respuestaEJB.crear(datosDto);

	}

}
