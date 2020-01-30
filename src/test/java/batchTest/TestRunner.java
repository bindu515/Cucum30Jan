package batchTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="demoCucumber.feature",glue= {"stepDef"},tags= {"@datadriven"},
plugin="json:target/cucumber-report.json")

public class TestRunner {
}
