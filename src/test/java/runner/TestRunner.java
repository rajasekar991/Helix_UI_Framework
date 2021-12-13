package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Helix_Workspaces\\Helix_UI_Framework\\src\\test\\resources\\features\\login.feature", 
				 glue = {"stepDefinitions"}
				)
public class TestRunner {

}
