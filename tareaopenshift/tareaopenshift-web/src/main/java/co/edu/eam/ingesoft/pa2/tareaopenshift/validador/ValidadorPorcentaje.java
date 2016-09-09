package co.edu.eam.ingesoft.pa2.tareaopenshift.validador;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validadorPorcentaje")
public class ValidadorPorcentaje implements Validator {

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value) throws ValidatorException {
		if (value instanceof Double) {
			Double numero = (Double) value;
			if (numero.toString().toLowerCase().matches("[a-z]")) {
				throw new ValidatorException(
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ha ingresado letras", null));
			} else if (numero > 100 || numero < 1) {
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Debe ingresar un numero mayor a 0 y menor a 101", null));
			}
		} else {
			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ha ingresado datos invalidos", null));
		}
	}
}
