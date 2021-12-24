package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Helix_Workspaces\\Helix_UI_Framework\\src\\test\\resources\\features\\",
				 glue = {"stepDefinitions"}
				)
public class TestRunner {


	static WebDriver driver = null;

	@BeforeClass
	public static void setUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Helix_Project\\helix_ui_project\\src\\test\\java\\webdrivers\\chromedriver.exe");
		driver = new
				ChromeDriver();
		driver.get("http://3.6.26.96:8085/Default.aspx");
		driver.manage().
				window().
				maximize();
		Thread.sleep(5000);

	}

	@AfterClass
	public static void tearDown(){

	}
}
