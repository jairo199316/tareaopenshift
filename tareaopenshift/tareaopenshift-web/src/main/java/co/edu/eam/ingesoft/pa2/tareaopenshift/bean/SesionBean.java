package co.edu.eam.ingesoft.pa2.tareaopenshift.bean;

import java.io.Serializable;


import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.omnifaces.util.Faces;

import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.SeguridadEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.UsuarioEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Usuario;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.seguridad.Acceso;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.seguridad.Rol;
import co.edu.eam.ingesoft.pa2.tareaopenshift.seguridad.MD5Util;

@Named("SesionBean")
@SessionScoped
public class SesionBean implements Serializable {

	
	@EJB
	private UsuarioEJB usuarioEJB;
	@EJB
	private SeguridadEJB seguridaEJB;
	private String user;
	private String password;
	private Usuario usuario;
	private List<Rol> roles;
	private List<Acceso> accesos;

	public String login() {

		Usuario usuario = null;
		if (!usuarioEJB.buscarPorUsuario(user).isEmpty()) {
			usuario = usuarioEJB.buscarPorUsuario(user).get(0);
		}
		password = MD5Util.code(password);

		if (usuario != null && password.equals(usuario.getPassword())) {
			this.usuario = usuario;
			roles = seguridaEJB.listarRolesPorUsuario(usuario);
			accesos = seguridaEJB.listarAccesosPorRol(roles);
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Se inicio seion con exito", null);
			FacesContext.getCurrentInstance().addMessage(null, message);
			return "/paginas/inicio.jsf?faces-redirect=true";
		} else {
			this.usuario = null;
			roles = null;
			accesos = null;
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario o contraseña incorrecto",
					null);
			FacesContext.getCurrentInstance().addMessage(null, message);
			return null;
		}
	}

	public boolean isLogged() {
		return this.usuario != null;
	}

	public String logOut() {
		Faces.getSession().invalidate();
		return "/index.jsf?faces-redirect=true";
	}

	public List<Acceso> getAccesos() {
		return accesos;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}
}
