package Pages;

import Common.selectors.SidebarSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SidebarComponent {

    protected WebDriver driver;

    public SidebarComponent(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkSidebarIsHidden() {
        WebElement sidebarToggle = driver.findElement(By.id(SidebarSelectors.ELEMENT.selector));
        String visibilityState = sidebarToggle.getCssValue("display");

        return visibilityState.equals("none");
    }
}
