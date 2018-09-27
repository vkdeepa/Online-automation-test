package Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class )

@CucumberOptions(
features = {"src/main/Features/Login.feature","src/main/Features/AppStudio.feature","src/main/Features/CreateApp.feature","src/main/Features/Workspace.feature"},
glue = {"Execution" },
plugin = {"pretty", "html:output"},
				  tags= {"@Workspace","@AddRecord"},
				  monochrome = true
				  )
public class CucumberRunner {

}
