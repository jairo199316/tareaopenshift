package co.edu.eam.ingesoft.pa2.tareaopenshift.test.clases;



import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.PreguntaEJB;
import co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades.Pregunta;

import javax.ejb.EJB;

import org.caferrer.testdata.junit.ArquillianUtil;
import org.caferrer.testdata.junit.TestDataUtil;

@RunWith(Arquillian.class)
public class PruebaPregunta {

	@EJB
	private PreguntaEJB preguntaEJB;

	@Deployment
	public static EnterpriseArchive desplegar() {
		EnterpriseArchive ear = ArquillianUtil.createDeployment("../tareaopenshift-ear/target/tareaopenshift-ear.ear");
		ear.addAsLibraries(ShrinkWrap.create(JavaArchive.class).addClass(PruebaPregunta.class));
		return ear;
	}

	@Test
	public void testPregunta() {
		Pregunta pregunta = new Pregunta();
		pregunta.setIdPregunta(1234);
		pregunta.setTexto("¿Es puntual?");
		pregunta.setValor(30.0);
		preguntaEJB.crear(pregunta);
		Pregunta p = preguntaEJB.buscar(1234);
		Assert.assertNotNull(p);

	}

	@AfterClass
	public static void finalizar() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-del.sql");
	}

}
