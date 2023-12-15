package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//Features//GoogleSearch.feature" ,
		glue = {"stepDefs"},
		//dryRun = false
		monochrome = true,
		plugin = {"pretty" ,
				"html:target//Report//HtmlReport.html",
//				"json:target//Report//JSONReport.json",
//				"usage:target//Report//UsageReport",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target//failedScenarios.txt"
	
		}
		)
public class GooglePageRunner extends AbstractTestNGCucumberTests {

}
