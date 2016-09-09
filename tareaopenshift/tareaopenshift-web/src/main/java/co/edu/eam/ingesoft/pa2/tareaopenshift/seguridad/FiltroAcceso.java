package co.edu.eam.ingesoft.pa2.tareaopenshift.seguridad;

import java.io.IOException;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import co.edu.eam.ingesoft.pa2.tareaopenshift.bean.SesionBean;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.seguridad.Acceso;

//@WebFilter(urlPatterns = "/paginas/*")
public class FiltroAcceso implements Filter {

	@Inject
	private SesionBean sesion;

	Logger logger = Logger.getLogger(FiltroAcceso.class);

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest resquest, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httppreq = (HttpServletRequest) resquest;
		HttpServletResponse httpresp = (HttpServletResponse) resp;

		String urlCompleta = httppreq.getRequestURI().toString();
		String contextpath = httppreq.getContextPath();

		logger.info("url=" + urlCompleta + ",path=" + contextpath);
		String url = urlCompleta.substring(contextpath.length());
		logger.info("URL a filtrar=" + url);

		if (sesion.isLogged()) {
			boolean exito = false;
			if (url.equals("/paginas/inicio.jsf")) {
				exito = true;
			} else {
				List<Acceso> accesos = sesion.getAccesos();
				for (Acceso acceso : accesos) {
					if (acceso.getUrl().equals(url)) {
						exito = true;
					}
				}
			}
			if (!exito) {
				httpresp.sendRedirect(httppreq.getContextPath() + "/paginas/inicio.jsf");
			} else {
				chain.doFilter(resquest, resp);
			}
		} else {
			httpresp.sendRedirect(httppreq.getContextPath());
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
