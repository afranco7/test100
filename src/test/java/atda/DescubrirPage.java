package atda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DescubrirPage {
    private final WebDriver driver;

    public DescubrirPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoaded() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='modal-root']/div/div/button"))).isDisplayed();
    }

    public void closeModal() {
        driver.findElement(By.xpath("//*[@id='modal-root']/div/div/button")).click();
    }

    public void clickPlayVideoButton() {
        driver.findElement(By.xpath("(//*[@class='gl-icon play-button__icon___3dVEt'])[1]")).click();
    }

    public boolean isVideoPlaying() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//video[@src])[1]"))).isDisplayed();

    }
}
