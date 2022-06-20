package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/** The first page which the user is landing on when the URL is hit*/
public class DefaultPage {

    WebDriver driver;

    // Constructor
    public DefaultPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By loginButton = By.id("nav-link-login");

    // Methods
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
}
