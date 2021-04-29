package atda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoaded() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-email']"))).isDisplayed();
    }

    public void clickUneteAlClub() {
        driver.findElement(By.xpath("//span[contains(text(),'ÚNETE AL CLUB')]")).click();
    }
}
