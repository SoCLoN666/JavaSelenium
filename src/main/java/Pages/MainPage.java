package Pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

    public SidebarComponent sidebar;
    public MainPage(WebDriver driver){
        super(driver);

        sidebar = new SidebarComponent(driver);
    }
}


