package com.demoauto.screenplay.tasks;

import java.util.List;

import org.openqa.selenium.Keys;

import com.demoauto.screenplay.ui.DemoForm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromTarget;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromElement;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValue;


public class DiligenciarForm implements Task {

	
	private int i;
	private List<List<String>> data;

	public DiligenciarForm(List<List<String>> data, int i) {
		super();
		this.data = data;
		this.i = i;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(data.get(i).get(0).trim()).into(DemoForm.FNAME_TEXTBOX));
		actor.attemptsTo(Enter.theValue(data.get(i).get(1).trim()).into(DemoForm.LNAME_TEXTBOX));
		actor.attemptsTo(Enter.theValue(data.get(i).get(2).trim()).into(DemoForm.ADDRESS_TEXTBOX));
		actor.attemptsTo(Enter.theValue(data.get(i).get(3).trim()).into(DemoForm.EMAIL_TEXTBOX));
		actor.attemptsTo(Enter.theValue(data.get(i).get(4).trim()).into(DemoForm.PHONE_TEXTBOX));
		actor.attemptsTo(Click.on(DemoForm.GENDER_TEXTBOX));
		actor.attemptsTo(Click.on(DemoForm.HOBBIES_TEXTBOX));
		actor.attemptsTo(Click.on(DemoForm.LANGUAGES_TEXTBOX));
		actor.attemptsTo(Click.on(DemoForm.LANGUAGES2_LIST_ELEMENT));
		actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(i).get(8).trim()).from(DemoForm.SKILLS_COMBOBOX));
		actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(i).get(9).trim()).from(DemoForm.COUNTRY_COMBOBOX));
		actor.attemptsTo(Click.on(DemoForm.SELECT_FIRST_COUNTRY));
		actor.attemptsTo(Enter.theValue(data.get(i).get(10).trim()).into(DemoForm.SELECT_COUNTRY).thenHit(Keys.ENTER));
		actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(i).get(11).trim()).from(DemoForm.YEAR_COMBOBOX));
		actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(i).get(12).trim()).from(DemoForm.MONTH_COMBOBOX));
		actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(i).get(13).trim()).from(DemoForm.DAY_COMBOBOX));
		actor.attemptsTo(Enter.theValue(data.get(i).get(14).trim()).into(DemoForm.PASSWORD_TEXTBOX));
		actor.attemptsTo(Enter.theValue(data.get(i).get(15).trim()).into(DemoForm.PASSWORD_CONFIRM_TEXTBOX));
		actor.attemptsTo(Click.on(DemoForm.SUBMIT_BUTTON));
		
	}
	
	public static DiligenciarForm Formulario(List<List<String>> data, int i) {
		
		return Tasks.instrumented(DiligenciarForm.class, data, i);
	}

	
	

}
