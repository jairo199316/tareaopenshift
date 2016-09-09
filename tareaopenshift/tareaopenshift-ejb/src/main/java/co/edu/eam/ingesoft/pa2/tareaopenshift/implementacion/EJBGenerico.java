package co.edu.eam.ingesoft.pa2.tareaopenshift.implementacion;

import javax.annotation.PostConstruct;




import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.eam.ingesoft.pa2.tareaopenshift.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.dao.DAOGenerico;



public abstract class EJBGenerico<T> {
	
	@PersistenceContext
	private EntityManager em;
	
	protected DAOGenerico dao;
	
	
	
	@PostConstruct
	public void inicializar(){
		dao = new DAOGenerico(em, getClase()); 
	}
	
	public void editar(T entidad)throws ExcepcionNegocio{
		dao.editar(entidad);
	}
	
	
	public T buscar(Object pk){
		return dao.buscar(pk);
	}
	
	public void eliminar(T entidad) throws ExcepcionNegocio{
		dao.eliminar(entidad);
	}
	
	public void crear(T entidad) throws ExcepcionNegocio {
		dao.crear(entidad);
	}
	
	public abstract Class getClase();
	
}
