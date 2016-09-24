package co.edu.eam.ingesoft.pa2.tareaopenshift.bos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.xml.ws.BindingProvider;

import co.edu.eam.ingesoft.pa2.cliente.Curso;
import co.edu.eam.ingesoft.pa2.cliente.Estudiante;
import co.edu.eam.ingesoft.pa2.cliente.ServiciosAcademicos;
import co.edu.eam.ingesoft.pa2.cliente.ServiciosEducativosService;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Asignatura;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Docente;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Facultad;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Grupo;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Programa;

@LocalBean
@Stateless
public class PruebaWSLDEJB implements Serializable {

	/**
	 * EJB del docente
	 */
	@EJB
	private DocenteEJB docenteEJB;
	/**
	 * EJB del grupo
	 */
	@EJB
	private GrupoEJB grupoEJB;
	/**
	 * EJB de la facultad
	 */
	@EJB
	private FacultadEJB facultadEJB;

	/**
	 * EJB del programa
	 */
	@EJB
	private ProgramaEJB programaEJB;

	/**
	 * EJB de la asignatura
	 */
	@EJB
	private AsignaturaEJB asignaturaEJB;

	/**
	 * Objeto facultad
	 */
	private Facultad f;

	/**
	 * Objeto Programa
	 */
	private Programa pro;

	/**
	 * Objeto asignatura
	 */
	private Asignatura asignatura;

	/**
	 * Objeto docente
	 */
	private Docente docente;

	/**
	 * crea una asignatura, facultar y programa consumiendo recursos del
	 * estudiante en WSDL
	 * 
	 * @param cod
	 *            el codigo del estudiante
	 * @param ced
	 *            la cedula del estudiante
	 * @return true si se encuentra un registro del estudiante, de lo contrario
	 *         false
	 */
	public boolean crear(String cod, String ced) {
		try {
			ServiciosEducativosService cliente = new ServiciosEducativosService();
			ServiciosAcademicos servicio = cliente.getServiciosAcademicos();

			BindingProvider bp = (BindingProvider) servicio;
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
					"http://174.142.65.144:28080/eamweb/serviciosAcademicos");

			List<Curso> dto = servicio.consultarCursosEstudiante(cod, ced);
			for (int i = 0; i < dto.size(); i++) {

				if (facultadEJB.buscar(dto.get(i).getAsignatura().getPrograma().getFacultad().getCodigo()) != null) {
					f = facultadEJB.buscar(dto.get(i).getAsignatura().getPrograma().getFacultad().getCodigo());
				} else {
					f = new Facultad();
					f.setIdFacultad(dto.get(i).getAsignatura().getPrograma().getFacultad().getCodigo());
					f.setNombre(dto.get(i).getAsignatura().getPrograma().getFacultad().getNombre());
					facultadEJB.crear(f);
				}

				if (programaEJB.buscar(dto.get(i).getAsignatura().getPrograma().getCodigo()) != null) {
					pro = programaEJB.buscar(dto.get(i).getAsignatura().getPrograma().getCodigo());
				} else {
					pro = new Programa();
					pro.setIdFacultad(f);
					pro.setIdPrograma(dto.get(i).getAsignatura().getPrograma().getCodigo());
					pro.setNombrePrograma(dto.get(i).getAsignatura().getPrograma().getNombre());
					programaEJB.crear(pro);
				}

				if (asignaturaEJB.buscar(dto.get(i).getAsignatura().getCodigo()) == null) {
					asignatura = new Asignatura();
					asignatura.setIdAsignatura(dto.get(i).getAsignatura().getCodigo());
					asignatura.setIdPrograma(pro);
					asignatura.setNombreAsignatura(dto.get(i).getAsignatura().getNombre());
					asignaturaEJB.crear(asignatura);
				}

			}
			if (!dto.isEmpty()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	/**
	 * busca un estudiante consumiendo recursos de WSDL
	 * 
	 * @param cod
	 *            el codigo del estudiante a buscar
	 * @param ced
	 *            la cedula del estudiante a buscar
	 * @return true si encuantra un estudiante, de lo contrario false
	 */
	public boolean buscarEstudiante(String cod, String ced) {
		ServiciosEducativosService cliente = new ServiciosEducativosService();
		ServiciosAcademicos servicio = cliente.getServiciosAcademicos();

		BindingProvider bp = (BindingProvider) servicio;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"http://174.142.65.144:28080/eamweb/serviciosAcademicos");

		Estudiante estudiante = servicio.consultaEstudiante(cod, ced);

		if (estudiante != null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * lista los grupos de un estudiante por codigo y cedula del estudiante
	 * 
	 * @param cod
	 *            el codigo del estudiante
	 * @param ced
	 *            la cedula del estudiante
	 * @return los grupos de un estudiante
	 */
	public List<Grupo> listarGruposEstudiante(String cod, String ced) {
		ServiciosEducativosService cliente = new ServiciosEducativosService();
		ServiciosAcademicos servicio = cliente.getServiciosAcademicos();

		BindingProvider bp = (BindingProvider) servicio;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"http://174.142.65.144:28080/eamweb/serviciosAcademicos");

		List<Curso> dto = servicio.consultarCursosEstudiante(cod, ced);
		List<Grupo> listaGrupo = new ArrayList<>();
		for (int i = 0; i < dto.size(); i++) {

			f = facultadEJB.buscar(dto.get(i).getAsignatura().getPrograma().getFacultad().getCodigo());
			if (f == null) {
				f = new Facultad();
				f.setIdFacultad(dto.get(i).getAsignatura().getPrograma().getFacultad().getCodigo());
				f.setNombre(dto.get(i).getAsignatura().getPrograma().getFacultad().getNombre());
				facultadEJB.crear(f);
			}

			pro = programaEJB.buscar(dto.get(i).getAsignatura().getPrograma().getCodigo());
			if (pro == null) {
				pro = new Programa();
				pro.setIdFacultad(f);
				pro.setIdPrograma(dto.get(i).getAsignatura().getPrograma().getCodigo());
				pro.setNombrePrograma(dto.get(i).getAsignatura().getPrograma().getNombre());
				programaEJB.crear(pro);
			}

			asignatura = asignaturaEJB.buscar(dto.get(i).getAsignatura().getCodigo());
			if (asignatura == null) {
				asignatura = new Asignatura();
				asignatura.setIdAsignatura(dto.get(i).getAsignatura().getCodigo());
				asignatura.setIdPrograma(pro);
				asignatura.setNombreAsignatura(dto.get(i).getAsignatura().getNombre());
				asignaturaEJB.crear(asignatura);
			}

			Facultad fac = facultadEJB.buscar(dto.get(i).getDocente().getPrograma().getFacultad().getCodigo());
			if (fac == null) {
				fac = new Facultad();
				fac.setIdFacultad(dto.get(i).getDocente().getPrograma().getFacultad().getCodigo());
				fac.setNombre(dto.get(i).getDocente().getPrograma().getFacultad().getNombre());
				facultadEJB.crear(fac);
			}

			Programa programa = programaEJB.buscar(dto.get(i).getDocente().getPrograma().getCodigo());
			if (programa == null) {
				programa = new Programa();
				programa.setIdFacultad(fac);
				programa.setIdPrograma(dto.get(i).getDocente().getPrograma().getCodigo());
				programa.setNombrePrograma(dto.get(i).getDocente().getPrograma().getNombre());
				programaEJB.crear(programa);
			}

			docente = docenteEJB.buscar(dto.get(i).getDocente().getDocumentoidentificacion());
			if (docente == null) {
				docente = new Docente();
				docente.setApellido(dto.get(i).getDocente().getApellido());
				docente.setId(dto.get(i).getDocente().getDocumentoidentificacion());
				docente.setIdPrograma(programa);
				docente.setNombre(dto.get(i).getDocente().getNombre());
				docenteEJB.crear(docente);
			}

			Grupo g = grupoEJB.buscar(dto.get(i).getId());
			if (g == null) {
				g = new Grupo();
				g.setAnio(GregorianCalendar.getInstance().getTime());
				g.setGrupo(dto.get(i).getGrupo().toString());
				g.setIdAsignatura(asignatura);
				g.setIdDocente(docente);
				g.setIdGrupo(dto.get(i).getId());
				g.setPeriodo(2);
				grupoEJB.crear(g);
			}
			listaGrupo.add(g);
		}
		return listaGrupo;
	}

}
