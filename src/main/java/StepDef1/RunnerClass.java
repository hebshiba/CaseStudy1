package StepDef1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/CaseStudy1/CaseStudy3.feature",
//glue="com.Demo",
plugin="json:target\\jsonreport.json")

public class RunnerClass {

}
