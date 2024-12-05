package Pages;

import Common.UrlList;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Environment.Timeouts.EXPLICIT_TIMEOUT;

public class BasePage {
    protected WebDriver driver;

    public  BasePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open the Recipes Page")
    public void open(UrlList pageUrl) {
        driver.get(pageUrl.url);
    }

    public WebElement waitForVisibilityOf(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_TIMEOUT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
