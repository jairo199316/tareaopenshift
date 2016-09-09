package co.edu.eam.ingesoft.pa2.tareaopenshift.test.clases;



import javax.ejb.EJB;
import javax.xml.ws.BindingProvider;

import org.caferrer.testdata.junit.ArquillianUtil;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import co.edu.eam.ingesoft.pa2.tareaopenshift.bos.PruebaWSLDEJB;

@RunWith(Arquillian.class)
public class PruebaAsignatura {

	@EJB
	private PruebaWSLDEJB wsdlEJB;

	@Deployment
	public static EnterpriseArchive desplegar() {
		EnterpriseArchive ear = ArquillianUtil.createDeployment("../tareaopenshift-ear/target/tareaopenshift-ear.ear");
		ear.addAsLibraries(ShrinkWrap.create(JavaArchive.class).addClass(PruebaAsignatura.class));
		return ear;
	}

	@Test
	public void buscarEstudiante() {
		Assert.assertTrue(wsdlEJB.buscarEstudiante("123", "123"));
	}

	@Test
	public void crear() {
		Assert.assertTrue(wsdlEJB.crear("123", "123"));
	}

}
