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
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Facultad;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Programa;

@Named("programaWeb")
@ViewScoped
public class ControladorRegistrarPrograma implements Serializable {

	@EJB
	private ProgramaEJB programaEJB;
	@EJB
	private FacultadEJB facultadEJB;

	private String nombre;

	private String idPrograma;
	private List<Facultad> facultades;

	private Facultad facultadSeleccionada;

	public void crearPrograma() {
		try {
			Programa pro = new Programa(idPrograma, nombre, facultadSeleccionada);
			programaEJB.crear(pro);
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Se creo el programa con exito", null);
			FacesContext.getCurrentInstance().addMessage(null, message);
		} catch (Exception e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), null);
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}

	@PostConstruct
	public void inicializar() {
		facultades = facultadEJB.listarFacultad();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Facultad> getFacultades() {
		return facultades;
	}

	public void setFacultades(List<Facultad> facultades) {
		this.facultades = facultades;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Facultad getFacultadSeleccionada() {
		return facultadSeleccionada;
	}

	public void setFacultadSeleccionada(Facultad facultadSeleccionada) {
		this.facultadSeleccionada = facultadSeleccionada;
	}

	public String getIdPrograma() {
		return idPrograma;
	}

	public void setIdPrograma(String idPrograma) {
		this.idPrograma = idPrograma;
	}
}
