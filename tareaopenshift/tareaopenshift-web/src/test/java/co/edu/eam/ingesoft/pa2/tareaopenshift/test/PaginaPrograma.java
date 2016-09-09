package co.edu.eam.ingesoft.pa2.tareaopenshift.test;

import java.io.Serializable;

import org.jboss.arquillian.drone.api.annotation.Drone;

import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.graphene.page.Location;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@Location("/programa.jsf")
public class PaginaPrograma implements Serializable{

	@Drone
	private WebDriver browser;

	@FindBy(id = "nombre")
	private WebElement nombre;

	@FindBy(id = "idPrograma")
	private WebElement idPrograma;

	@FindBy(id = "facultad_input")
	private Select facultad_input;

	@FindBy(id = "idBoton")
	private WebElement idBoton;

	@FindBy(id = "mensajes")
	private WebElement msj;

	public String crearPrograma() {
		nombre.sendKeys("mecatronica");
		idPrograma.sendKeys("321");
		facultad_input.selectByIndex(1);

		Graphene.guardAjax(idBoton).click();
		Graphene.waitModel().until().element(msj).is().present();

		return msj.getText();
	}

}
