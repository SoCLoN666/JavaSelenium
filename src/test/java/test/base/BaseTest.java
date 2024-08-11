package test.base;

import Common.CommonActions;
import Common.UrlList;
import Pages.BasePage;
import Pages.LoginPage;
import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();

    protected LoginPage loginPage = new LoginPage(driver);

    protected MainPage mainPage = new MainPage(driver);

    @Test
    public void verifyUserCanSearchUkraine(){
        mainPage.open(UrlList.RECIPES);

        loginPage.login();

        String url = driver.getCurrentUrl();

        Assert.assertTrue(url.contains("https://recipe-application-pearl.vercel.app/all-recipies"));


        driver.close();
    }
}
