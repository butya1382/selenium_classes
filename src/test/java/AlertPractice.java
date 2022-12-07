import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class AlertPractice {

            System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
             WebDriver driver;
             @BeforeMethod
             void setUp(){
              System.setProperty("webdriver.chrome.driver","drivers/chromedrivers");

    }

}
