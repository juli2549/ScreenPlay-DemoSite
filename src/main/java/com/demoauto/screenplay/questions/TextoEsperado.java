package com.demoauto.screenplay.questions;

import com.demoauto.screenplay.ui.DemoForm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TextoEsperado implements Question<String> {

	public static TextoEsperado qtn() {
		return new TextoEsperado() ;
	}

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(DemoForm.WEBTABLE_LABEL).viewedBy(actor).asString();
	}

}
