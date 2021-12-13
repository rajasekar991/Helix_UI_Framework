package stepDefinitions;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.helix.team.pages.HelixLoginPage;
import com.helix.team.pages.HelixRequestMeetingPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver=null;
	String tbx_username ="//input[@value='Email address']";
	String div_pwd = "//div[@id='ctl00_BodyContent_TextBoxPassword']";
	String tbx_password ="//input[@id='ctl00_BodyContent_TextBoxPassword_I_CLND']";
	String btn_Login ="//button[@value='Login']";
	
	HelixLoginPage helix_Login;
	HelixRequestMeetingPage helix_req_meeting_page;
	
	@Given("^I am on Helix login page$")
	public void i_am_on_Helix_login_page() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Helix_Project\\helix_ui_project\\src\\test\\java\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://3.6.26.96:8085/Default.aspx");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@When("title of the login page is {string}")
	public void title_of_the_page(String title)
	{
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), title);
	}
	
	@Then("I enter {string} and {string} and login")
	public void i_enter_UN_PWD(String username, String password) throws InterruptedException
	{
		helix_Login = new HelixLoginPage(driver);
		helix_Login.helixLogin(username, password);
	}
	
	

	
	@Then("I validate the login function with {string}")
	public void i_validate_the_login_function(String welcomeMessage)
	{
		helix_req_meeting_page = new HelixRequestMeetingPage(driver);
		helix_req_meeting_page.validateIsWelcomeDisplayed(welcomeMessage);
	}
	
	@And("I close the browswer")
	public void close()
	{
		driver.quit();
	}

}
