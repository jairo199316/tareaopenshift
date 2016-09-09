package co.edu.eam.ingesoft.pa2.tareaopenshift.controladores;

import java.io.Serializable;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.FacultadEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.ProgramaEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.UsuarioEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.interceptor.Secured;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Coordinador;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Decano;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Facultad;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Programa;
import co.edu.eam.ingesoft.pa2.tareaopenshift.seguridad.MD5Util;

@Named("usuarioWeb")
@ViewScoped

public class ControladorRegistrarUsuarioWeb implements Serializable {

	/**
	 * EJB de usuario
	 */
	@EJB
	private UsuarioEJB usuarioEJB;

	/**
	 * EJB Programa
	 */
	@EJB
	private ProgramaEJB programaEJB;

	/**
	 * EJB Facultad
	 */
	@EJB
	private FacultadEJB facultadEJB;

	/**
	 * Identificacion del usuario
	 */
	private int id;

	/**
	 * nombre del usuario
	 */
	private String nombre;

	/**
	 * apellido del usuario
	 */
	private String apellido;

	/**
	 * usuario del usuario
	 */
	private String user;

	/**
	 * contraseña del usuario
	 */
	private String password;

	/**
	 * El usuario Seleccionado
	 */
	private String usuarioSeleccionado;

	/**
	 * La lista de programas
	 */
	private List<Programa> programa;

	/**
	 * La lista de las facultades
	 */
	private List<Facultad> facultad;

	private Programa programaSelecccionado;
	private Facultad facultadSelecccionado;

	@PostConstruct
	public void inicializar() {
		usuarioSeleccionado = "0";
		programa = programaEJB.listarPrograma();
	}

	public void llenarListas() {
		if (usuarioSeleccionado.equals("0")) {
			programa = programaEJB.listarPrograma();
		} else {
			facultad = facultadEJB.listarFacultad();
		}

	}

	/**
	 * crea un usuario
	 */
	@Secured
	public void crear() {
		try {
			if (nombre != "" && apellido != "" && user != "" && password != "") {
				if (usuarioSeleccionado.equals("0")) {
					password = MD5Util.code(password);
					Coordinador c = new Coordinador(nombre, apellido, user, password, id, programaSelecccionado);
					usuarioEJB.crear(c);
					FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
							"se registro un coordinador registro con exito", null);
					FacesContext.getCurrentInstance().addMessage(null, message);
				} else {
					password = MD5Util.code(password);
					Decano d = new Decano(nombre, apellido, user, password, id, facultadSelecccionado);
					usuarioEJB.crear(d);
					FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
							"se registro un decano registro con exito", null);
					FacesContext.getCurrentInstance().addMessage(null, message);
				}
			} else {
				FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "LLene campos", null);
				FacesContext.getCurrentInstance().addMessage(null, message);
			}
		} catch (Exception e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), null);
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}

	public boolean comboProgama() {
		if (usuarioSeleccionado.equals("0")) {
			return true;
		}
		return false;
	}

	public boolean comboFacultad() {
		if (usuarioSeleccionado.equals("1")) {
			return true;
		}
		return false;
	}

	public String getApellido() {
		return apellido;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPassword() {
		return password;
	}

	public String getUser() {
		return user;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUsuarioSeleccionado() {
		return usuarioSeleccionado;
	}

	public void setUsuarioSeleccionado(String usuarioSeleccionado) {
		this.usuarioSeleccionado = usuarioSeleccionado;
	}

	public List<Programa> getPrograma() {
		return programa;
	}

	public void setPrograma(List<Programa> programa) {
		this.programa = programa;
	}

	public List<Facultad> getFacultad() {
		return facultad;
	}

	public void setFacultad(List<Facultad> facultad) {
		this.facultad = facultad;
	}

	public Facultad getFacultadSelecccionado() {
		return facultadSelecccionado;
	}

	public Programa getProgramaSelecccionado() {
		return programaSelecccionado;
	}

	public void setFacultadSelecccionado(Facultad facultadSelecccionado) {
		this.facultadSelecccionado = facultadSelecccionado;
	}

	public void setProgramaSelecccionado(Programa programaSelecccionado) {
		this.programaSelecccionado = programaSelecccionado;
	}

}
