package co.edu.eam.ingesoft.pa2.tareaopenshift.seguridad;

import javax.ws.rs.core.Response;

import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import co.edu.eam.ingesoft.pa2.tareaopenshift.dto.RespuestaDTO;
import co.edu.eam.ingesoft.pa2.tareaopenshift.excepciones.ExcepcionNegocio;



@Provider
public class MenejadorExcepcion implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable exc) {
		if (exc instanceof ExcepcionNegocio) {
			ExcepcionNegocio excNegocio = (ExcepcionNegocio) exc;
			RespuestaDTO respuesta = new RespuestaDTO(null, excNegocio.getMessage(), "-1");
			exc.printStackTrace();
			return Response.status(500).entity(respuesta).build();
		} else {
			RespuestaDTO respuesta = new RespuestaDTO(null, "Error inesperado", "-2");
			exc.printStackTrace();
			return Response.status(500).entity(respuesta).build();
		}

	}

}
