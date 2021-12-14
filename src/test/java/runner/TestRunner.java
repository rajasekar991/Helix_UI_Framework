package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features", 
				 glue = {"stepDefinitions","ApplicationBasePage"},

				tags = "@AdminTools")
@Test
public class TestRunner {

}
