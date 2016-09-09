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

import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.FacultadEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.ProgramaEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Facultad;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Programa;

@RunWith(Arquillian.class)
public class PruebaPrograma {

	@EJB
	private ProgramaEJB programaEJB;
	@EJB
	private FacultadEJB facultadEJB;

	@Deployment
	public static EnterpriseArchive desplegar() {
		EnterpriseArchive ear = ArquillianUtil.createDeployment("../tareaopenshift-ear/target/tareaopenshift-ear.ear");
		ear.addAsLibraries(ShrinkWrap.create(JavaArchive.class).addClass(PruebaPrograma.class));
		return ear;
	}

	@Test
	public void pruebaPrograma() {
		Facultad f = new Facultad();
		f.setIdFacultad("321");
		f.setNombre("ingenieria");
		facultadEJB.crear(f);

		Programa p = new Programa();
		p.setIdFacultad(f);
		p.setIdPrograma("321");
		p.setNombrePrograma("mecatronica");
		programaEJB.crear(p);

		Programa pro = programaEJB.buscar("321");
		Assert.assertNotNull(pro);

	}

	@AfterClass
	public static void finalizar() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-del.sql");
	}
}
