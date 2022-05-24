package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions (
        features = "src/test/resources/features",
        glue = {"steps"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        publish = true
)

public class TestRunner extends AbstractTestNGCucumberTests {

    public TestRunner(){}

    @AfterClass
    public static void writeExtentReport() {

    }
}
