package autotests.test.step_definitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;



public class Hooks {
    private CommonSteps commonSteps = new CommonSteps();
    private String getdir = System.getProperty("user.dir");
    public static Logger Log = Logger.getLogger(org.apache.commons.logging.Log.class.getName());
    public ChromeDriver chromeDriver;

    @Before
    public void openBrowser(){
        String browser = commonSteps.PropertiesUtil(getdir+"\\src\\test\\resources\\properties\\test.properties","browser");
        if(browser.equals("chrome")) {
            chromeDriver = commonSteps.mydriver();
        }
    }

    @Given("^user navigate to the Google landing page$")
    public void iNavigateToTheAmazonLandingPage() {
            String url = commonSteps.PropertiesUtil(getdir+"\\src\\test\\resources\\properties\\test.properties","test-url");
            Log.info(url + "Landing Page URL");
            chromeDriver.get(url);
    }

}