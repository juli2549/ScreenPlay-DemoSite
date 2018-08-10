package com.demoauto.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class DemoForm extends PageObject {
	
	public static final Target FNAME_TEXTBOX = Target.the("Textbox of First Name").located(By.xpath("//input[@type=\'text\' and @placeholder=\'First Name\']"));
	public static final Target LNAME_TEXTBOX = Target.the("Textbox of Last Name").located(By.xpath("//input[@type=\'text\' and @placeholder=\'Last Name\']"));
	public static final Target ADDRESS_TEXTBOX = Target.the("Textbox of ADDRESS").located(By.xpath("//textarea[@class=\'form-control ng-pristine ng-untouched ng-valid\' and @rows=\'3\']"));
	public static final Target EMAIL_TEXTBOX = Target.the("Textbox of EMAIL").located(By.xpath("//input[@type=\'email\' and @class=\'form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required\']"));
	public static final Target PHONE_TEXTBOX = Target.the("Textbox of PHONE").located(By.xpath("//input[@type=\'tel\' and @ng-model=\'Phone\']"));
	public static final Target GENDER_TEXTBOX = Target.the("Textbox of GENDER").located(By.xpath("//input[@type=\'radio\' and @ng-model=\'radiovalue\' and @value=\'Male\']"));
	public static final Target HOBBIES_TEXTBOX = Target.the("Textbox of HOBBIES").located(By.id("checkbox2"));
	public static final Target LANGUAGES_TEXTBOX = Target.the("Textbox of LANGUAGES").located(By.id("msdd"));
	public static final Target LANGUAGES2_LIST_ELEMENT = Target.the("List of LANGUAGES").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[7]/div/multi-select/div[2]/ul/li[7]/a"));
	public static final Target SKILLS_COMBOBOX = Target.the("List of Skills").located(By.id("Skills"));
	//public static final Target ELEMENT_SKILLS_COMBOBOX = Target.the("ELEMENT of Skills").located(By.xpath("//select[@id=\'Skills\']//option[@value=" + data.get(i).get(8).trim() + "]"));
	public static final Target COUNTRY_COMBOBOX = Target.the("List of Countries").located(By.id("countries"));
	//public static final Target SELECT_FIRST_COUNTRY = Target.the("Field of countries").located(By.xpath("//span[@class=\'select2 select2-container select2-container--default select2-container--below select2-container--open\' and @dir=\'ltr\']"));
	public static final Target SELECT_FIRST_COUNTRY = Target.the("Field of countries").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[10]/div/span/span[1]/span"));
	public static final Target SELECT_COUNTRY = Target.the("Select Countries").located(By.xpath("//input[@class=\'select2-search__field\']"));
	public static final Target YEAR_COMBOBOX = Target.the("List of year").located(By.id("yearbox"));
	public static final Target MONTH_COMBOBOX = Target.the("List of Month").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[11]/div[2]/select"));
	public static final Target DAY_COMBOBOX = Target.the("List of Days").located(By.id("daybox"));
	public static final Target PASSWORD_TEXTBOX = Target.the("Textbox of Password").located(By.id("firstpassword"));
	public static final Target PASSWORD_CONFIRM_TEXTBOX = Target.the("Textbox of Confirm Password").located(By.id("secondpassword"));
	public static final Target SUBMIT_BUTTON = Target.the("Button for submit form").located(By.id("submitbtn"));
	public static final Target WEBTABLE_LABEL = Target.the("Label of WebTable Screen").located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));
	
}
