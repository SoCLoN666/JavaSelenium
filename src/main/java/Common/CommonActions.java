package Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Common.Utils.PLATFORM_AND_BROWSER;
import static constants.Environment.Timeouts.IMPLICIT_TIMEOUT;

public class CommonActions {
    public static WebDriver createDriver() {
        WebDriver driver = null;

        switch(PLATFORM_AND_BROWSER) {
            case "win_chrome":
                 System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                 driver = new ChromeDriver();
                 break;
            default:
                Assert.fail("Incorrect platform or browser name");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_TIMEOUT);

        return driver;
    }
}
