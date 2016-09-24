package co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote;


import co.edu.eam.ingesoft.pa2.tareaopenshift.interfaces.InterfaceEJBGenerica;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.dto.ResponderEvalDTO;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Respuesta;

public interface RespuestaRemoteEJB extends InterfaceEJBGenerica<Respuesta>{

	public void crear(ResponderEvalDTO datosDto);
}
