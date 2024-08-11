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
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterClass;


public class Navigation {
    protected WebDriver driver = CommonActions.createDriver();
    protected LoginPage loginPage = new LoginPage(driver);
    protected MainPage mainPage = new MainPage(driver);

    @BeforeSuite
    public void setUp() {
         mainPage.open(UrlList.RECIPES);

        loginPage.login();
    }

    @Test
    public void verifyUserCanCollapseSidebar() throws InterruptedException {
        mainPage.open(UrlList.RECIPES);

        WebElement sidebarToggle = driver.findElement(By.id(SidebarSelectors.TOGGLE_EXPANDED.selector));
        sidebarToggle.click();

        Boolean isSidebarHidden = mainPage.sidebar.checkSidebarIsHidden();

        Assert.assertTrue(isSidebarHidden);
    }

    @Test
    public void verifyUserCanExpandSidebar() {
        mainPage.open(UrlList.RECIPES);

        WebElement sidebarToggleExpanded = driver.findElement(By.id(SidebarSelectors.TOGGLE_EXPANDED.selector));

        sidebarToggleExpanded.click();
        WebElement sidebarToggleCollapsed = driver.findElement(By.id(SidebarSelectors.TOGGLE_COLLAPSED.selector));

        sidebarToggleCollapsed.click();
        Boolean isSidebarHidden = mainPage.sidebar.checkSidebarIsHidden();

        Assert.assertFalse(isSidebarHidden);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }
}
