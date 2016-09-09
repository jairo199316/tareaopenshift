package co.edu.eam.ingesoft.pa2.tareaopenshift.bos;

import java.util.ArrayList;


import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.eam.ingesoft.pa2.tareaopenshift.ejbremote.SeguridadRemoteEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Usuario;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.seguridad.Acceso;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.seguridad.AccesoRol;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.seguridad.Rol;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.seguridad.UsuarioRol;

@LocalBean
@Stateless
public class SeguridadEJB {

	@PersistenceContext
	private EntityManager em;

	public List<Rol> listarRolesPorUsuario(Usuario usuario) {
		Query q = em.createNamedQuery(UsuarioRol.LISTAR_ROL_USUARIO);
		q.setParameter(1, usuario);
		return q.getResultList();
	}

	
	
	
	
	
	
	
	public List<Acceso> listarAccesosPorRol(List<Rol> rol) {
		List<Acceso> listaAcceso = new ArrayList<>();
		if (!rol.isEmpty()) {
			for (int i = 0; i < rol.size(); i++) {
				Query q = em.createNamedQuery(AccesoRol.LISTAR_ACCESOS);
				q.setParameter(1, rol.get(i));
				List<Acceso> listaResul = q.getResultList();
				if (!listaResul.isEmpty()) {
					for (int j = 0; j < listaResul.size(); j++) {
						listaAcceso.add(listaResul.get(j));
					}
				}
			}
		}
		return listaAcceso;
	}
}
