package runner;




import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"json:target/cucumber.json" },
        features = "src/test/resources/features/singleGUiProjects.feature",
        glue = "stepDefinitions",
        monochrome = true,
        dryRun = false
         )

public class singleGUiRunner {
}
