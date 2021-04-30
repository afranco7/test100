package atda.SeleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {
    public static void clickOn(WebDriver driver, By elementBy) throws Exception {
        try{
            driver.findElement(elementBy).click();
        }catch (Exception e){
            throw new Exception("clickOn method failed after waiting 10 secs." + e.getMessage());
        }

    }

    public static void type(WebDriver driver, By elementBy, String text) throws Exception {
        try{
            waitUntilElementIsDisplayed(driver,elementBy,10);
            driver.findElement(elementBy).sendKeys(text);
        }catch (Exception e){
            throw new Exception("type method failed after waiting 10 secs." + e.getMessage());
        }
    }

    public static boolean waitUntilElementIsDisplayed(WebDriver driver, By elementBy, int timeInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver,timeInSeconds);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy)).isDisplayed();
    }

    public static void navigateToPage(WebDriver driver, String webPage) {
        driver.get(webPage);
    }
}
