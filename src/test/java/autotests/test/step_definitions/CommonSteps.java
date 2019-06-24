package autotests.test.step_definitions;

import autotests.test.model.common.TestPageModel;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import org.apache.log4j.Logger;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonSteps {
    private TestPageModel testPageModel = new TestPageModel();
    private static String getdir = System.getProperty("user.dir");
    private static Logger Log = Logger.getLogger(org.apache.commons.logging.Log.class.getName());
    private static String CHROME_DRIVER_PATH = getdir +"\\src\\test\\resources\\driver\\chromedriver.exe";
    private static ChromeDriver driver;

    public static ChromeDriver mydriver(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver",CHROME_DRIVER_PATH);
            driver = new ChromeDriver();
        }
        return driver;
    }



    public String PropertiesUtil(String filepath,String key) {
        File file = new File(filepath);
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();
        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Enumeration KeyValues = prop.keys();

        String value = prop.getProperty(key);
        System.out.println(key + ":- " + value);

        return value;
    }


}
