package runnerpackage;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"cucumberstepdefinition"},
monochrome=true,
plugin= {"html:Reports/HTMLReports", "json:Reports/JSONReports/cucumber.json", 
		"junit:Reports/XMLReports/cucu.xml"},
dryRun = true


)

public class runnerclass {



}