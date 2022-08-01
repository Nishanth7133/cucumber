package org.cucumber;


	

	import org.maven.BaseClass;
	import org.pom.AmazonPojo;


	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class AmazonStep extends BaseClass {
		@Given("To launch the ChromeBrowser and hit the amazon url")
		public void toLaunchTheChromeBrowserAndHitTheAmazonUrl() {
		    launchBrowser();
		    launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		}

		@When("To pass the invalid credentials to userName field")
		public void toPassTheInvalidCredentialsToUserNameField() {
			AmazonPojo a = new AmazonPojo();
			sendValue(a.getUserName(), "nishanthmsundar@gmail.com");
	    
		}

		@When("click the continue button")
		public void clickTheContinueButton() {
			AmazonPojo a = new AmazonPojo();
		click(a.getContinue());
		   
		}

		@When("To pass the invalid crediantials to password field")
		public void toPassTheInvalidCrediantialsToPasswordField() {
			AmazonPojo a = new AmazonPojo();
			sendValue(a.getPassword(), "9876543210");
		}

		@When("click the signin button")
		public void clickTheSigninButton() {
			AmazonPojo a = new AmazonPojo();
			click(a.getSignIn());
		}

		@Then("close the browser")
		public void closeTheBrowser() {
			closeBrowser();
		    
		}

	}

