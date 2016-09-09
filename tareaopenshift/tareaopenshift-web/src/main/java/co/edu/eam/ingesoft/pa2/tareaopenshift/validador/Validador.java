package co.edu.eam.ingesoft.pa2.tareaopenshift.validador;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "validador")
public class Validador implements Validator {

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value) throws ValidatorException {
		if (value instanceof String) {
			String numero = (String) value;
			if (numero.matches("[0-9]")) {
				throw new ValidatorException(
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ha ingresado numeros", null));
			}
		} else if (value instanceof Integer) {
			Integer numero = (Integer) value;
			if (numero.toString().toLowerCase().matches("[a-z]")) {
				throw new ValidatorException(
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ha ingresado letras", null));
			}
		} else {
			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ha ingresado datos invalidos", null));

		}
	}
}
