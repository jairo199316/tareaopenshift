package co.edu.eam.ingesoft.pa2.tareaopenshift.test;

import org.caferrer.testdata.junit.ArquillianUtil;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.InitialPage;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Arquillian.class)
public class PruebaPregunta {

	@Drone
	private WebDriver browser;

	@Deployment
	public static EnterpriseArchive desplegar() {
		EnterpriseArchive ear = ArquillianUtil.createDeployment("../tareaopenshift-ear/target/tareaopenshift-ear.ear");
		ear.addAsLibraries(ShrinkWrap.create(JavaArchive.class).addClass(PruebaPregunta.class));
		return ear;
	}

	@Test
	@RunAsClient
	public void testPregunta(@InitialPage PaginaPregunta pag) {
		String resp = pag.crearPregunta();
		ArquillianUtil.takeScreenshot(browser, "preguntas.jpg");
		Assert.assertEquals("se registro la pregunta con exito", resp);
	
	}

}
