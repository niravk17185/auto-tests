package autotests.test.model.common;

import autotests.test.pageobjects.TestPageObject;
import static org.assertj.core.api.Assertions.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.security.auth.callback.CallbackHandler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class TestPageModel {
    public static ChromeDriver driver;
    public static TestPageObject tp =new TestPageObject();

    public void  search_bar(){
        tp.validateSearchBar();
    }
    public void  search_for_character(String searchChr){
        tp.searchForCharatcter(searchChr);
    }
    public void  validate_auto_suggest_features_max_result_count(int maxResult,String searchChr){
        List<WebElement> ls= tp.validateAutoSuggestFeature(searchChr);
        Assert.assertEquals(maxResult,ls.size());
    }
    public void  validate_auto_suggest_features_result_start_with_charc(String searchChr){
        List<WebElement> ls= tp.validateAutoSuggestFeature(searchChr);
        for(WebElement option : ls){
            System.out.println(option);
            tp.validatedFieldName(searchChr,option.getText());
        }
    }
    public void  validate_searchA_with_Searcha(String searchA,String searcha){
        List<WebElement> ls1= tp.validateAutoSuggestFeature(searchA);
        List<WebElement> ls2= tp.validateAutoSuggestFeature(searcha);
        for (WebElement expected: ls2) {
            assertThat(ls1).containsAll(Collections.singleton(expected));
        }
    }


}
