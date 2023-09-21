package com.IATF.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions( features="src/test/resources/IATF_features" ,glue= {"com/IATF/steps"},tags="@exploreoptions")
public class IATF_Runner {

}
