package co.edu.eam.ingesoft.pa2.tareaopenshift.test;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.graphene.page.Location;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Location("paginas/preguntas.jsf")
public class PaginaPregunta {

	@Drone
	private WebDriver browser;

	@FindBy(id = "idPregunta")
	private WebElement idPregunta;

	@FindBy(id = "pregunta")
	private WebElement pregunta;

	@FindBy(id = "peso")
	private WebElement peso;

	@FindBy(id = "mensajes")
	private WebElement msj;

	@FindBy(id = "crear")
	private WebElement boton;

	public String crearPregunta() {
		idPregunta.sendKeys("1234");
		pregunta.sendKeys("¿Es puntual?");
		peso.sendKeys("30.0");

		Graphene.guardAjax(boton).click();
		Graphene.waitModel().until().element(msj).is().present();

		return msj.getText();
	}

}
