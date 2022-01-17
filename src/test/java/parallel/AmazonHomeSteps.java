package parallel;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.pages.AmazonHomePage;
import com.pages.AmazonLoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*

  public class AccountsPageSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	private AccountsPage accountsPage;

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {
		


		List<Map<String, String>> credList = credTable.asMaps();

		String userName = credList.get(0).get("username");

public AccountsPage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInButton).click();
		return new AccountsPage(driver);


		

		String password = credList.get(0).get("password");

		DriverFactory.getDriver()
				.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		accountsPage = loginPage.doLogin(userName, password);

	}

	@Given("user is on Accounts page")
	public void user_is_on_accounts_page() {
		String title = accountsPage.getAccountsPageTitle();
		//Calling accountpagetitle method.
		System.out.println("Accounts Page title is: " + title);
	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable sectionsTable) {

		List<String> expAccountSectionsList = sectionsTable.asList();
	
		
		
		System.out.println("Expected accounts section list: " + expAccountSectionsList);

		List<String> actualAccountSectionsList = accountsPage.getAccountsSectionsList();
		
		System.out.println("Actual accounts section list: " + actualAccountSectionsList);

		Assert.assertTrue(expAccountSectionsList.containsAll(actualAccountSectionsList));

	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer expectedSectionCount) {
		Assert.assertTrue(accountsPage.getAccountsSectionCount() == expectedSectionCount);
	}

}

*/
public class AmazonHomeSteps {

	private AmazonLoginPage amazonloginpage = new AmazonLoginPage(DriverFactory.getDriver());
	private AmazonHomePage amazonhomepage;

	@Given("user has already logged in to the application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {
		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("http://www.amazon.in");
		amazonhomepage = amazonloginpage.doLogin(userName, password);

	}

	@Given("user is on Amazon home page")
	public void user_is_on_amazon_home_page() {

		String title = amazonhomepage.getHomePageTitle();
		// Calling accountpagetitle method.
		System.out.println("amazon home Page title is: " + title);

	}

	@Then("user gets a Amazon search field")
	public void user_gets_a_amazon_search_field() {

		boolean searchbuttoncheck = amazonhomepage.searchbuttoncheck();
		System.out.println(searchbuttoncheck);
//		System.out.println("search button is displayed");
	}

	@Then("username is also displayed next to search field")
	public void username_is_also_displayed_next_to_search_field() {

		boolean usernamecheck = amazonhomepage.usernamecheck();
		System.out.println(usernamecheck);
//		System.out.println("username is displayed for user");

	}

	@Then("Amazon logo is also displayed")
	public void amazon_logo_is_also_displayed() {

		boolean logocheck = amazonhomepage.logocheck();
		System.out.println(logocheck);
//		System.out.println("logo is displayed for amazon");
	}

	@Then("Cart link is also displayed")
	public void cart_link_is_also_displayed() {
		// span[normalize-space()='2']

		boolean cartcheck = amazonhomepage.cartcheck();
		System.out.println(cartcheck);
//		System.out.println("cart is displayed for amazon");
	}
	
	@When("user clicks on Accounts & Lists links")
	public void user_clicks_on_accounts_lists_links() {
		
		
		amazonhomepage.clickonAccountsLists();
//		System.out.println("user clicks on accounts and list link");
	}

	@When("clicks on Your Orders link")
	public void clicks_on_your_orders_link() {
	
		
		amazonhomepage.clickonYourOrders();
//		System.out.println("user clicks on Your Orders link");
	}
	
	@When("clicks on Orders link")
	public void clicks_on_orders_link() {
		
		
		amazonhomepage.clickonPastOrders();
//		System.out.println("user clicks on Past Orders link");
	}

	@Then("user checks the previous order detials")
	public void user_checks_the_previous_order_detials() {
	
		
		amazonhomepage.checksPastOrders();
//		System.out.println("user checks the list of Past Orders ");
	}

	@When("user clicks on Cancelled Orders link")
	public void user_clicks_on_cancelled_orders_link() throws InterruptedException {
		
		
		amazonhomepage.clickonCancelledOrders();
//		System.out.println("user clicks on Cancelled Orders link");
	}

	@Then("user checks the cancelled order details")
	public void user_checks_the_cancelled_order_details() {
		
		
		amazonhomepage.checksCancelledOrders();
//		System.out.println("user checks list of Cancelled Orders ");
	}

}