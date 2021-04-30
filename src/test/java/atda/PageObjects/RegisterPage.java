package atda.PageObjects;

import atda.SeleniumActions.Actions;
import atda.Utils.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private final WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By getFirstNameBy() { return By.xpath("//input[@name='firstName']"); }
    By getLastNameBy() { return By.xpath("//input[@name='lastName']"); }
    By getDayBy() { return By.xpath("//*[@id='date-of-birth-day']"); }
    By getMonthBy() { return By.xpath("//*[@id='date-of-birth-month']"); }
    By getYearBy() { return By.xpath("//*[@id='date-of-birth-year']"); }
    By getGenderBy() { return By.xpath("//span[text()='Hombre']"); }
    By getEmailBy() { return By.xpath("//input[@name='email']"); }
    By getPasswordBy() { return By.xpath("//input[@name='password']"); }
    By getTermsBy() { return By.xpath("//input[@data-auto-id='registration-terms-field']"); }
    By getRegisterButtonBy() { return By.xpath("//button[@data-auto-id='registration-submit-button']"); }

    public boolean isLoaded() {
        return Actions.waitUntilElementIsDisplayed(driver,getFirstNameBy(),10);
    }

    public void fillRegistrationForm() throws Exception {
        Actions.type(driver,getFirstNameBy(),Util.getRandomString(8));
        Actions.type(driver,getLastNameBy(),Util.getRandomString(4));
        Actions.type(driver,getDayBy(),"30");
        Actions.type(driver,getMonthBy(),"04");
        Actions.type(driver,getYearBy(),"1986");

        Actions.clickOn(driver,getGenderBy());
        Actions.type(driver,getEmailBy(),Util.getRandomString(8)+"@mailinator.com");
        Actions.type(driver,getPasswordBy(),Util.getRandomString(6)+"1As");
        Actions.clickOn(driver,getTermsBy());
    }

    public void clickRegisterButton() throws Exception {
        Actions.clickOn(driver,getRegisterButtonBy());
    }
}
