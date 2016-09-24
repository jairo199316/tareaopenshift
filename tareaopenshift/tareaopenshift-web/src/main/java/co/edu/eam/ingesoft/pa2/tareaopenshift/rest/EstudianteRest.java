package co.edu.eam.ingesoft.pa2.tareaopenshift.rest;

import java.util.List;


import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.PruebaWSLDEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.dto.RespuestaDTO;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Grupo;
import co.edu.eam.ingesoft.pa2.tareaopenshift.seguridad.Secured;

@Secured
@Path("/estudiante")
public class EstudianteRest {

	@EJB
	private PruebaWSLDEJB wsdlEJB;

	public EstudianteRest() {
	}

	@GET
	@Path("/loginestudiante")
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaDTO login(@QueryParam(value = "ced") String ced, @QueryParam(value = "cod") String cod) {
		if (wsdlEJB.buscarEstudiante(cod, ced)) {
			return new RespuestaDTO(true);
		} else {
			return new RespuestaDTO(false, "No se encontro el estudiante", "11");
		}
	}

	@GET
	@Path("/cursoestudiante")
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaDTO listarGrupos(@QueryParam(value = "ced") String ced, @QueryParam(value = "cod") String cod) {
		List<Grupo> grupos = wsdlEJB.listarGruposEstudiante(cod, ced);
		if (!grupos.isEmpty()) {
			return new RespuestaDTO(grupos);
		} else {
			return new RespuestaDTO(null, "No se encontraron cursos el estudiante", "11");
		}
	}

}
