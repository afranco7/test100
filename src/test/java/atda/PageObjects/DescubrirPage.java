package atda.PageObjects;

import atda.SeleniumActions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DescubrirPage {
    private final WebDriver driver;

    public DescubrirPage(WebDriver driver) {
        this.driver = driver;
    }

    By getCloseModalButtonBy() { return By.xpath("//*[@id='modal-root']/div/div/button"); }
    By getPlayVideoButtonBy() { return By.xpath("(//*[@class='gl-icon play-button__icon___3dVEt'])[1]"); }
    By getVideoBoxBy() { return By.xpath("(//video[@src])[1]"); }

    public boolean isLoaded() {
        return Actions.waitUntilElementIsDisplayed(driver,getCloseModalButtonBy(),10);
    }

    public void closeModal() throws Exception {
        Actions.clickOn(driver,getCloseModalButtonBy());
    }

    public void clickPlayVideoButton() throws Exception {
        Actions.clickOn(driver,getPlayVideoButtonBy());
    }

    public boolean isVideoPlaying() {
        return Actions.waitUntilElementIsDisplayed(driver,getVideoBoxBy(),10);
    }
}
