package org.testrunner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.cucumber",monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE)
public class TestRunner1 {

}
