package com.demoauto.screenplay.tasks;

import com.demoauto.screenplay.tasks.Abrir;
import com.demoauto.screenplay.ui.DemoForm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
	
	private DemoForm demoForm;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(demoForm));
		
	}
	
	public static Abrir DemoSite() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Abrir.class);
	}

}
