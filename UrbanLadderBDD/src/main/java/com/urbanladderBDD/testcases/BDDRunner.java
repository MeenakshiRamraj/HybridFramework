package com.urbanladderBDD.testcases;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\eclipse workspace\\UrbanLadderBDD\\src\\main\\java\\com\\urbanladderBDD\\features\\BDDFeature.feature",glue="com.urbanladderBDD.StepDefinition")
public class BDDRunner {

}
