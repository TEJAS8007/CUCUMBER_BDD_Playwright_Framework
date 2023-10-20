package Com.QA.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/FeatureFiles/DemoStore.feature"},
    glue = {"Com.QA.StepDefinition"},
    tags = {"@HomePage,@Login"},
    plugin = {"pretty","html:target/Report/rep.html"},
    monochrome = true,
    dryRun = true
)
public class Runner {
}
