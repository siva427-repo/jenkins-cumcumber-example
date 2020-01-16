package com.jenkins.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.jenkins.cucumber",
        format = {"json:target/cucumber.json"}
)
public class CucumberTest {
}
