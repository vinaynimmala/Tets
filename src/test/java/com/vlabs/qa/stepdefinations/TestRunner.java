package com.vlabs.qa.stepdefinations;





import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Automation\\Projects\\EVO2\\src\\main\\java\\Features", glue="com.vlabs.qa.stepdefinations", format={"json:target/cucumber.json", "html:target/site/cucumber-pretty"})
//@CucumberOptions(features="D:\\Automation\\Projects\\EVO2\\src\\main\\java\\Features", glue="com.vlabs.qa.stepdefinations")
public class TestRunner extends AbstractTestNGCucumberTests{

}
