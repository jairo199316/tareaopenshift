package co.edu.eam.ingesoft.pa2.tareaopenshift.test.clases;

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

import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.UsuarioEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Decano;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Docente;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Usuario;

@RunWith(Arquillian.class)
public class PruebaUsuario {

	@EJB
	private UsuarioEJB usuarioEJB;

	@Deployment
	public static EnterpriseArchive desplegar() {
		EnterpriseArchive ear = ArquillianUtil.createDeployment("../tareaopenshift-ear/target/tareaopenshift-ear.ear");
		ear.addAsLibraries(ShrinkWrap.create(JavaArchive.class).addClass(PruebaUsuario.class));
		return ear;
	}

	@Test
	public void testUsuario() {

		Usuario usuario = new Usuario();
		usuario.setApellido("Rios");
		usuario.setNombre("Jairo");
		usuario.setId(1094935130);
		usuario.setPassword("1234");
		usuario.setUsuario("userPrueba");
		usuarioEJB.crear(usuario);

		Usuario us = usuarioEJB.buscar(1094935130);

		Assert.assertNotNull(us);

	}

	@AfterClass
	public static void finalizar() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-del.sql");
	}

}
