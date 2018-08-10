package com.demoauto.screenplay.stepdefinitions;

import java.util.List;

import static org.hamcrest.Matchers.containsString;
import org.openqa.selenium.WebDriver;

import com.demoauto.screenplay.questions.TextoEsperado;
import com.demoauto.screenplay.tasks.Abrir;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import com.demoauto.screenplay.tasks.Abrir;
import com.demoauto.screenplay.tasks.DiligenciarForm;

public class DemoDefinition {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor julian = Actor.named("Julian");

	@Before
	public void configuracionInicial() {
		julian.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^Carlos wants to access the Web Automation demonstration site$")
	public void carlos_wants_to_access_the_Web_Automation_demonstration_site() throws Exception {
		julian.wasAbleTo(Abrir.DemoSite());
	}

	@When("^he performs the registration on the page using the following data$")
	public void he_performs_the_registration_on_the_page_using_the_following_data(DataTable dtDatosForm1) {
		List<List<String>> data = dtDatosForm1.raw();
		
		for(int i=1;i<data.size(); i++) {
			julian.attemptsTo(DiligenciarForm.Formulario(data, i));
		}
	}

	@Then("^he verifies that the screen is loaded with text (.*)$")
	public void he_verifies_that_the_screen_is_loaded_with_text_Double_Click_on_Edit_Icon_to_EDIT_the_Table_Row(String WebT_label) {
		julian.should(seeThat(TextoEsperado.qtn(), containsString(WebT_label)));
	}

	
}
