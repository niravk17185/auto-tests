package autotests.test.pageobjects;

import autotests.test.step_definitions.CommonSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestPageObject {
    private CommonSteps commonSteps = new CommonSteps();
    private ChromeDriver chromeDriver=commonSteps.mydriver();




    public void validateSearchBar() {
        chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        new WebDriverWait(chromeDriver, 30)
                .until(wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
        WebElement searchBar = chromeDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
        Assert.assertEquals(true, searchBar.isDisplayed());
    }

    public void searchForCharatcter(String aCharatcter) {
        WebElement searchBar = chromeDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
        Assert.assertEquals(true, searchBar.isDisplayed());
        searchBar.sendKeys(aCharatcter);
    }
    public List validateAutoSuggestFeature(String searchCharacter){

        List<WebElement> list = chromeDriver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/ul/li"));
        int listSize = list.size();
        System.out.println(list.size());
        return list;
    }


    public void validatedFieldName(String firstChar, String fieldName) {
        String m_first_char = String.valueOf(fieldName.charAt(0));
        Assert.assertEquals(firstChar.toLowerCase(), m_first_char);
    }

}
