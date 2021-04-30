package atda.PageObjects;

import atda.SeleniumActions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
    private final WebDriver driver;

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
    }

    By getCloseSessionBy() { return By.xpath("//span[contains(text(),'Cerrar sesión')]"); }

    public boolean isLoaded() {
        return Actions.waitUntilElementIsDisplayed(driver,getCloseSessionBy(),10);
    }
}
