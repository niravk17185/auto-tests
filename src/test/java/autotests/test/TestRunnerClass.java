package autotests.test;

import autotests.test.step_definitions.CommonSteps;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.image.PNGImageDecoder;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        glue = "autotests.test.step_definitions",
        tags = {"@smoke"}
)
public class TestRunnerClass {

    @AfterClass
    public static void afterAll() {

        ChromeDriver chromeDriver = CommonSteps.mydriver();
        chromeDriver.close();
        System.out.println("Finishing test run.");
    }

}