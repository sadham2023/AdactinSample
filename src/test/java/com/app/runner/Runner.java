package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sadham\\Selenium-workspace-New\\CucumberAdactinPractice\\src\\test\\java\\feature",
glue= {"com.app.stepdefenition"},
dryRun=false,
monochrome=false,
publish=true
//,tags="@sce4"
)
public class Runner {

}
