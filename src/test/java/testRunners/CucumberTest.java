package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources/AmazonTest.feature", glue = "src/test/java/stepsDefs/HomePageSteps.java")
public class CucumberTest {

}
