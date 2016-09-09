package co.edu.eam.ingesoft.pa2.tareaopenshift.interceptor;

import java.io.Serializable;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.apache.log4j.Logger;

import co.edu.eam.ingesoft.pa2.tareaopenshift.bean.SesionBean;
import co.edu.eam.ingesoft.pa2.tareaopenshift.excepciones.ExcepcionNegocio;

@Interceptor
@Secured
public class SecurityInterceptor implements Serializable {

	private static Logger logger = Logger.getLogger(SecurityInterceptor.class);

	@Inject
	private SesionBean sesion;

	@AroundInvoke
	public Object interceptar(InvocationContext ctx) throws Exception {
		if (ctx.getMethod().isAnnotationPresent(Secured.class)) {
			if (sesion.isLogged()) {
				Object res = ctx.proceed();
				return res;

			} else {
				throw new ExcepcionNegocio("No esta autorizado");
			}
		} else {
			Object res = ctx.proceed();
			return res;
		}

	}

}
