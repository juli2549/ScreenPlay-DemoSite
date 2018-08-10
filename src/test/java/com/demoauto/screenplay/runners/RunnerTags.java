package com.demoauto.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/features/demoAutoSP.feature",glue="com.demoauto.screenplay.stepdefinitions" )
//@CucumberOptions (features = "src/test/resources/features/bdd.feature",glue="com.eltiempo.definitions", tags = "@CasoPrueba2")
public class RunnerTags {}