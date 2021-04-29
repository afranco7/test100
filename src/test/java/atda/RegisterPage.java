package atda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.charset.Charset;
import java.util.Random;

public class RegisterPage {
    private final WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoaded() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']"))).isDisplayed();
    }

    public void fillRegistrationForm() {
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(getRandomString(8));
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(getRandomString(4));
        driver.findElement(By.xpath("//*[@id='date-of-birth-day']")).sendKeys("30");
        driver.findElement(By.xpath("//*[@id='date-of-birth-month']")).sendKeys("04");
        driver.findElement(By.xpath("//*[@id='date-of-birth-year']")).sendKeys("1986");

        driver.findElement(By.xpath("//span[text()='Hombre']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(getRandomString(8)+"@mailinator.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(getRandomString(6)+"1As");
        driver.findElement(By.xpath("//input[@name='terms']")).click();
    }

    private String getRandomString(int len) {
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
           for(int i = 0; i < len; i++)
                sb.append(AB.charAt(rnd.nextInt(AB.length())));
           return sb.toString();
    }

    public void clickRegisterButton() {
        driver.findElement(By.xpath("//button[@data-auto-id='registration-submit-button']")).click();
    }
}
