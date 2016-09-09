package co.edu.eam.ingesoft.pa2.tareaopenshift.convertidores;

import javax.ejb.EJB;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.FacultadEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Facultad;

@Named
@FacesConverter(value = "facultad", forClass = Facultad.class)
public class FacultadConverter implements Converter {

	@EJB
	private FacultadEJB facultad;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String string) {

		if (string == null || string.trim().length() == 0) {
			return null;
		}
		return facultad.buscar(string);
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if (arg2 instanceof Facultad) {
			Facultad facultad = (Facultad) arg2;
			return facultad.getIdFacultad();
		}
		return null;
	}

}
