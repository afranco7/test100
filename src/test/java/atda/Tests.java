package atda;

import atda.PageObjects.*;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests
{
    private WebDriver driver;
    @BeforeEach
    public void setUp()
    {
        driver = getDriver();
    }

    @Ignore
    @Test
    public void testVideoPlaying() throws Exception {
            /*HomePage homePage = new HomePage(driver);
            DescubrirPage descubrirPage = new DescubrirPage(driver);
            homePage.open();
            assertTrue(homePage.isLoaded());

            homePage.clickDescubrirMasButton();
            assertTrue(descubrirPage.isLoaded());
            descubrirPage.closeModal();
            descubrirPage.clickPlayVideoButton();
            assertTrue(descubrirPage.isVideoPlaying());*/
        }
    @Test
    public void testAccountRegistration() throws Exception {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        WelcomePage welcomePage = new WelcomePage(driver);
        homePage.open();
        assertTrue(homePage.isLoaded());

        homePage.clickProfileIcon();
        assertTrue(loginPage.isLoaded());
        loginPage.clickUneteAlClub();
        assertTrue(registerPage.isLoaded());
        registerPage.fillRegistrationForm();
        registerPage.clickRegisterButton();
        assertTrue(welcomePage.isLoaded());
        assertEquals("https://www.adidas.co/my-account",driver.getCurrentUrl());
    }

    @AfterEach
    public void cleanUp()
    {
        driver.quit();
    }

    private WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        return (WebDriver) new ChromeDriver();
    }
}