
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoQASlect {
    @Test
    void demoQANotSelectDropDown(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
       String url = "https://demoqa.com/select-menu";
       webDriver.navigate().to(url);



    }

}
