package org.cucumber;

import java.util.List;

import java.util.Map;

import org.maven.BaseClass;
import org.openqa.selenium.UsernameAndPassword;
import org.pom.POM001;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefinition1 extends BaseClass {
	@Given("To launch the chromeBrowser and hit the facebook url")
	public void to_launch_the_chromeBrowser_and_hit_the_facebook_url() {
	   launchBrowser();
	   launchUrl("https://en-gb.facebook.com/");
	}

	@When("To pass the invalid credential to username field")
	public void to_pass_the_invalid_credential_to_username_field(DataTable d) {
		//List<String> al = d.asList();
		//String string = al.get(3);
	   POM001 p = new POM001();
	   Map<String, String> asMap = d.asMap(String.class, String.class);
	   String data = asMap.get("email4");
	   sendValue(p.getUserName(), data );
	}

	@When("To pass the invalid credential to password field")
	public void to_pass_the_invalid_credential_to_password_field(DataTable d) {
		List<Map<String, String>> asMaps = d.asMaps();
		String object = asMaps.get(2).get("pass2");
		//List<List<String>> al = d.asLists();
		//String string = al.get(2).get(2);
		POM001 p = new POM001();
		sendValue(p.getPassword(), object);  
	}

	@When("click the login button")
	public void click_the_login_button() throws InterruptedException {
		POM001 p = new POM001();
	  click(p.getLoginButton());
	  Thread.sleep(2000);
	}
	@When("to check the confirm button")
	public void to_check_the_confirm_button() {
System.out.println("to check");
	}
	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	   closeBrowser();
	}
	@When("To pass the bulk of data{string} to the userName field")
	public void to_pass_the_bulk_of_data_to_the_userName_field(String userName) {
		POM001 p = new POM001();
		sendValue(p.getUserName(), userName );
	}

	@When("To pass the bulk of data to the {string} password field")
	public void to_pass_the_bulk_of_data_to_the_password_field(String password) {
		POM001 p = new POM001();
		sendValue(p.getPassword(), password );
	}


}
