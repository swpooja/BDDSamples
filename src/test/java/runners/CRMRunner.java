package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//taggedFeatures//" ,
		glue = {"stepDefs"},
		dryRun = false,
		//monochrome = true,
		plugin = {
				"html:target//Report//HtmlReport.html" },
		//run scenarios which having tags smoke test
		//tags = "@SmokeTest",
		//tags = "@RegressionTest",
		//run scenarios which having tags smoke test or regression test
		//tags = "@SmokeTest or @RegressionTest",
		//run scenarios which having both tags smoke test and regression test
		//tags = "@SmokeTest and @RegressionTest",
		//run which having phasetwo tag it is on feature tag it will execute all scenarios in it
		//tags = "@PhaseTwo",
		//run which having phaseone feature tag and smokeTest testcase tag
		//tags = "@PhaseOne and @SmokeTest",
		//run which having phaseone feature tag and not smokeTest, other than smoketest it will run
		//tags = "@PhaseOne and not @SmokeTest",
		//run from phaseone tag ,those dont have smoke or regreesion tag
		//tags = "@PhaseOne and not (@SmokeTest or @RegressionTest)",
		//tags = "@PhaseOne and (@SmokeTest and @RegressionTest)"
		tags = "@PhaseTwo and (@SmokeTest or @RegressionTest)"
		)
public class CRMRunner extends AbstractTestNGCucumberTests {

}
