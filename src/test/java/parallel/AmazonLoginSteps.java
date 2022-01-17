package parallel;

import com.pages.AmazonLoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
 * @Given("user is on login page")
	public void user_is_on_login_page() {

		DriverFactory.getDriver()
				.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLogin();
	}
	
 */

public class AmazonLoginSteps {

	private static boolean signinbuttonPresence;
	private static boolean emailtextpresence;
	private static String homepagetitle;
	private static boolean checkHomePage;
	
	private AmazonLoginPage loginPage = new AmazonLoginPage(DriverFactory.getDriver());
	/*
	 * Created loginpage class object and then call its methods like
	 * getLoginPageTitle, isForgotPwdLinkExist. All assertions has to be done in
	 * test class inside stepdefinitoons not in the main class.
	 * 
	 */

	@Given("user is on Amazon landing page")
	public void user_is_on_amazon_landing_page() {

		DriverFactory.getDriver().get("http://www.amazon.in");

	}

	@Given("Sign in button is present on screen")
	public void sign_in_button_is_present_on_screen() {

		// verify if the “Google Search” button is displayed and print the result
		signinbuttonPresence = loginPage.checksigninbutton();
		System.out.println(signinbuttonPresence);
//		System.out.println("Signin button is present");

	}

	@When("user clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickOnSignin();
	}

	@Then("user is displayed login screen")
	public void user_is_displayed_login_screen() {

		emailtextpresence = loginPage.checkemail();
		System.out.println(emailtextpresence);
//		System.out.println("email login screen is displayed");
	}

	@When("user enters {string} in username field")
	public void user_enters_in_username_field(String username) {
		loginPage.enterUserName(username);
//		System.out.println("user enters username");
	}

	@When("user clicks Continue button")
	public void user_clicks_continue_button() {
		loginPage.clickOnContinue();
//		System.out.println("user clicks on continue");
	}

	@When("user enters {string} in password field")
	public void user_enters_in_password_field(String pass) {
		loginPage.enterPassword(pass);
//		System.out.println("user enters password");
	}

	@When("user clicks Sign in submit button")
	public void user_clicks_sign_in_submit_button() {
		loginPage.clickOnSigninsubmit();
//		System.out.println("user enters on sign in button after entering credentials");
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
		checkHomePage = loginPage.checkHomePage();
		System.out.println(checkHomePage);
//		System.out.println("user enters home page");
	}

	@Then("title of home page is {string}")
	public void title_of_home_page_is(String string) {

		homepagetitle = loginPage.getHomePageTitle();
		System.out.println("homepagetitle title is: " + homepagetitle);
	

	}

}
