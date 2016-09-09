package co.edu.eam.ingesoft.pa2.tareaopenshift.interfaces;

import co.edu.eam.ingesoft.pa2.tareaopenshift.excepciones.ExcepcionNegocio;

public interface InterfaceEJBGenerica<T> {

	public void editar(T entidad) throws ExcepcionNegocio;

	public T buscar(Object pk);

	public void eliminar(T entidad) throws ExcepcionNegocio;

	public void crear(T entidad) throws ExcepcionNegocio;
}
