package atda.PageObjects;

import atda.SeleniumActions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    By getJoinClubButtonBy() { return By.xpath("//span[contains(normalize-space(),'AL CLUB')]"); }
    By getLoginEmailBy() { return By.xpath("//*[@id='login-email']"); }

    public boolean isLoaded() {
        return Actions.waitUntilElementIsDisplayed(driver,getLoginEmailBy(),10);
    }

    public void clickUneteAlClub() throws Exception {
        Actions.clickOn(driver,getJoinClubButtonBy());
    }
}
