package atda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage {
    private final WebDriver driver;

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoaded() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Cerrar sesión')]"))).isDisplayed();
    }
}
