package co.edu.eam.ingesoft.pa2.tareaopenshift.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.UsuarioEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.dto.RespuestaDTO;
import co.edu.eam.ingesoft.pa2.tareaopenshift.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Usuario;

@Path("/usuario")
public class UsuarioRest {

	@EJB
	private UsuarioEJB usuarioEJB;

	public UsuarioRest() {
	}

	@GET
	@Path("/buscarusuario")
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaDTO buscarUsuario(@QueryParam(value = "ced") int ced) {
		Usuario usuario = usuarioEJB.buscar(ced);
		return new RespuestaDTO(usuario);
	}

	@PUT
	@Path("/crearusuario")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public RespuestaDTO crear(Usuario usuario) {
		if (usuarioEJB.buscar(usuario.getId()) == null) {
			usuarioEJB.crear(usuario);
			return new RespuestaDTO(true);
		} else {
			return new RespuestaDTO(false, "ya existe un usuario con la cedula ingresada", "11");
		}
	}

}
