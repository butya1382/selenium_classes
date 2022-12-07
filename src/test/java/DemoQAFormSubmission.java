import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;

public class DemoQAFormSubmission {
    @Test
    void demoQACheckRequiredFields(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        Actions actions = new Actions(webDriver);
        for (int i=10;i>0;i--){
            actions.keyDown(Keys.COMMAND).sendKeys("-");
        }
        webDriver.get("https://demoqa.com/automation-practice-form");
        WebElement submitButton = webDriver.findElement(By.id("Select"));

    }

}
