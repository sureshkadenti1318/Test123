package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "E:\\Training_Batches\\Cucumber_Maven_WorkSpace\\CucumberJava\\Features\\OrangeHRM.feature", 
		glue = "StepDefinitions",
		dryRun = true, 
		monochrome=true,
		plugin = {"pretty", "html:test-outout" ,"json:jsonReport.json"}
		)
public class TestRunner {

}
