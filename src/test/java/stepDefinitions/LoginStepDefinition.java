package stepDefinitions;


import com.helix.team.factory.DriverFactory;
import com.helix.team.pages.HelixLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
//	WebDriver driver=null;
//	String tbx_username ="//input[@value='Email address']";
//	String div_pwd = "//div[@id='ctl00_BodyContent_TextBoxPassword']";
//	String tbx_password ="//input[@id='ctl00_BodyContent_TextBoxPassword_I_CLND']";
//	String btn_Login ="//button[@value='Login']";
	
	private HelixLoginPage helix_Login = new HelixLoginPage(DriverFactory.getDriver());
	private static String actualtitle;
	
	@Given("User is on Helix login page")
	public void user_is_on_Helix_login_page() throws InterruptedException
	{
		DriverFactory.getDriver().get("http://3.6.26.96:8083/Logon.aspx");
		Thread.sleep(4000);
	}
	
	@When("User gets the title of the login page")
	public void user_gets_the_title_of_the_login_page()
	{
		actualtitle = helix_Login.getHelixloginPageTitle();
		System.out.println("The title of the page is "+actualtitle);
	}
	
	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle)
	{
		Assert.assertTrue(actualtitle.contains(expectedTitle));
	}
	
	@Then("Forgot your password link should be displayed as {string}")
	public void forgot_pwd_link(String expectedLinkName)
	{
		String actualName = helix_Login.isForgotPasswordLinkExists();
		Assert.assertEquals(actualName, expectedLinkName);
		System.out.println("Link is displyaed");
	}
//	@Given("^I am on Helix login page$")
//	public void i_am_on_Helix_login_page() throws InterruptedException
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Helix_Project\\helix_ui_project\\src\\test\\java\\webdrivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("http://3.6.26.96:8085/Default.aspx");
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
//	}
//	
	@When("title of the login page is {string}")
	public void title_of_the_page(String expectedtitle)
	{
		Assert.assertEquals(expectedtitle, helix_Login.getHelixloginPageTitle());
	}
	
	@Then("I enter {string} and {string} and login")
	public void i_enter_UN_PWD(String username, String password) throws InterruptedException
	{
		helix_Login.enterUN(username);
		helix_Login.enterPassword(password);
	}
//	
//	
//
//	
//	@Then("I validate the login function with {string}")
//	public void i_validate_the_login_function(String welcomeMessage)
//	{
//		helix_req_meeting_page = new HelixRequestMeetingPage(driver);
//		helix_req_meeting_page.validateIsWelcomeDisplayed(welcomeMessage);
//	}
//	
//	@And("I close the browswer")
//	public void close()
//	{
//		driver.quit();
//	}

}
