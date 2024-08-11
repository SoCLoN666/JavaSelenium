package Pages;

import Common.selectors.LoginPageSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    protected WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        WebElement usernameField = driver.findElement(By.cssSelector(LoginPageSelectors.USERNAME_FIELD.selector));
        usernameField.sendKeys("Oleg");
        WebElement passwordField = driver.findElement(By.cssSelector(LoginPageSelectors.PASSWORD_FIELD.selector));
        passwordField.sendKeys("123456789a");
        WebElement loginBtn = driver.findElement(By.cssSelector(LoginPageSelectors.LOGIN.selector));
        loginBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://recipe-application-pearl.vercel.app/all-recipies"));
    }
}
