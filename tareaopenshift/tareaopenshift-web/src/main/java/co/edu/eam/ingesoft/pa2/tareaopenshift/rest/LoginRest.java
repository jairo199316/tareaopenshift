package co.edu.eam.ingesoft.pa2.tareaopenshift.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.PruebaWSLDEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.dto.RespuestaDTO;

@Path("/seguridad")
public class LoginRest {

	@EJB
	private PruebaWSLDEJB wsdlEJB;
	public static Map<String, String> tokens = new HashMap<>();

	@GET
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path("/validarlog")
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaDTO login(@QueryParam(value = "ced") String ced, @QueryParam(value = "cod") String cod) {
		if (wsdlEJB.buscarEstudiante(cod, ced)) {
			String token = UUID.randomUUID().toString();
			tokens.put(token, ced);
			return new RespuestaDTO(token);
		} else {
			return new RespuestaDTO(null, "NO AUTORIZADO", "-1");
		}

	}
	
	public static Map<String, String> getTokens() {
		return tokens;
	}
	
	public static void setTokens(Map<String, String> tokens) {
		LoginRest.tokens = tokens;
	}

}
