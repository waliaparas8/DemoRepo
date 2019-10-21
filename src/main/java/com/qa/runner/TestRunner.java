package com.qa.runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/paras/IdeaProjects/facebook_login/src/main/java/com/qa/features/facebook.feature"
        , glue="com/qa/stepDefinitions")
//              monochrome = true,
//              strict = true,
//              dryRun = false)

public class TestRunner
{

}
