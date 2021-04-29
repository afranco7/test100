package atda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.adidas.co/");
    }

    public boolean isLoaded() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button/span[contains(text(),'DESCUBRIR')])[1]"))).isDisplayed();
    }

    public void clickDescubrirMasButton() {
        driver.findElement(By.xpath("(//button/span[contains(text(),'DESCUBRIR')])[1]")).click();
    }

    public void clickProfileIcon() {
        driver.findElement(By.xpath("//button[@data-auto-id='profile-icon-header']")).click();
    }
}
