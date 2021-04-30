package atda.PageObjects;

import atda.SeleniumActions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By getDescButtonBy() { return By.xpath("(//button/span[contains(text(),'DES')])[1]"); }
    By getProfileIconBy() { return By.xpath("//button[@data-auto-id='profile-icon-header']"); }

    public void open() {
        Actions.navigateToPage(driver,"https://www.adidas.co/");
    }

    public boolean isLoaded() {
        return Actions.waitUntilElementIsDisplayed(driver,getDescButtonBy(),10);
    }

    public void clickDescubrirMasButton() throws Exception {
        Actions.clickOn(driver,getDescButtonBy());
    }

    public void clickProfileIcon() throws Exception {
        Actions.clickOn(driver,getProfileIconBy());
    }
}
