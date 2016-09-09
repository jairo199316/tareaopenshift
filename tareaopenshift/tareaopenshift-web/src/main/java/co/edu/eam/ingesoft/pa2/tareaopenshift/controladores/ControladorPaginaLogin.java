package co.edu.eam.ingesoft.pa2.tareaopenshift.controladores;

import java.io.Serializable;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import co.edu.eam.ingesoft.pa2.tareaopenshift.bean.SesionBean;
import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.FacultadEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.ProgramaEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Facultad;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Programa;

@Named("pruebaLoginWeb")
@ViewScoped
public class ControladorPaginaLogin implements Serializable {

	/**
	 * EJB Facultad
	 */
	@EJB
	private FacultadEJB facultadEJB;

	/**
	 * EJB Programa
	 */
	@EJB
	private ProgramaEJB programaEJB;

	private Facultad facultad;

	private Programa programa;

	private List<Programa> programas;

	private List<Facultad> facultades;

	private boolean render = false;
	@Inject
	private SesionBean sesion;

	public boolean sinEstado() {
		return render;
	}

	public void login() {
		if (sesion.getUser().equals("Vice")) {

		} 
	}

	public boolean renderPrograma() {
		return true;
	}

	public boolean renderFacultad() {
		return true;
	}

	@PostConstruct
	public void inicializar() {
		facultades = facultadEJB.listarFacultad();
		programas = programaEJB.listarPrograma();

	}

	public Facultad getFacultad() {
		return facultad;
	}

	public Programa getPrograma() {
		return programa;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	public List<Programa> getProgramas() {
		return programas;
	}

	public List<Facultad> getFacultades() {
		return facultades;
	}

	public void setFacultades(List<Facultad> facultades) {
		this.facultades = facultades;
	}

	public void setProgramas(List<Programa> programas) {
		this.programas = programas;
	}
}
