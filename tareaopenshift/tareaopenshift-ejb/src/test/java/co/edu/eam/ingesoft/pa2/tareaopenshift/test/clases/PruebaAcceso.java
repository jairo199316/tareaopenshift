package co.edu.eam.ingesoft.pa2.tareaopenshift.test.clases;

import java.util.List;

import javax.ejb.EJB;

import org.caferrer.testdata.junit.ArquillianUtil;
import org.caferrer.testdata.junit.TestDataUtil;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.SeguridadEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.UsuarioEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Usuario;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.seguridad.Rol;

@RunWith(Arquillian.class)
public class PruebaAcceso {

	@EJB
	private SeguridadEJB seguridadEJB;
	@EJB
	private UsuarioEJB usuarioEJB;

	@Deployment
	public static EnterpriseArchive desplegar() {
		EnterpriseArchive ear = ArquillianUtil.createDeployment("../tareaopenshift-ear/target/tareaopenshift-ear.ear");
		ear.addAsLibraries(ShrinkWrap.create(JavaArchive.class).addClass(PruebaAcceso.class));
		return ear;
	}

	@Test
	public void rolTest() {
		Usuario u = usuarioEJB.buscarPorUsuario("admin").get(0);
		List<Rol> listaRoles = seguridadEJB.listarRolesPorUsuario(u);
		Assert.assertEquals(1, listaRoles.size());
	}

}
