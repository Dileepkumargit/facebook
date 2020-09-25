package Reunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			
			features = {"C:\\Users\\abc\\eclipse-workspace\\Maven\\featurefiles\\amazon.feature"},
			glue    =  {"stepdef"})

public class Testrunner {

}
