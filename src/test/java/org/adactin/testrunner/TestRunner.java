package org.adactin.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\org\\adactin\\feature\\adactinloginpage.feature", glue = "org.adactin.stepdefinition"

)
public class TestRunner {

}
