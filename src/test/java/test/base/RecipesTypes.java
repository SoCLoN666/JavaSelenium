package test.base;

import Common.CommonActions;
import Common.UrlList;
import Common.selectors.SidebarSelectors;
import Pages.LoginPage;
import Pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RecipesTypes {
    protected WebDriver driver = CommonActions.createDriver();

    protected LoginPage loginPage = new LoginPage(driver);

    protected MainPage mainPage = new MainPage(driver);

    @DataProvider(name = "recipeTypeData")
    public Object [][] createData() {
        return new Object[][] {
                {SidebarSelectors.UKRAINIAN_RECIPES_BTN.selector, "https://recipe-application-pearl.vercel.app/ukrainian-kitchen"},
                {SidebarSelectors.ITALIAN_RECIPES_BTN.selector, "https://recipe-application-pearl.vercel.app/italian-kitchen"},
                {SidebarSelectors.FRENCH_RECIPES_BTN.selector, "https://recipe-application-pearl.vercel.app/french-kitchen"},
                {SidebarSelectors.JAPANESE_RECIPES_BTN.selector, "https://recipe-application-pearl.vercel.app/japanese-kitchen"},
                {SidebarSelectors.NO_CATEGORY_RECIPES_BTN.selector, "https://recipe-application-pearl.vercel.app/without-category"},
        };
    }

    @BeforeSuite
    public void setUp() {
        mainPage.open(UrlList.RECIPES);

        loginPage.login();
    }

    @Test(dataProvider = "recipeTypeData")
    public void verifyUserCanSelectRecipeTypeDataDriven(String recipeTypeBtnSelector, String expectedUrl) {
        WebElement recipyTypeBtn = driver.findElement(By.id(recipeTypeBtnSelector));
        recipyTypeBtn.click();

        String url = driver.getCurrentUrl();

        Assert.assertTrue(url.contains(expectedUrl));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }
}
