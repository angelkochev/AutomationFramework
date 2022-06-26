package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginForm extends BasePage{

    public LoginForm(WebDriver driver) {
        super(driver);
    }

    // Locators
    By usernameField = By.id("defaultLoginFormUsername");
    By passwordField = By.id("defaultLoginFormPassword");
    By signInButton = By.id("sign-in-button");

    // Methods
    public void enterUsername(String username){
        driver.findElement(usernameField).clear(); //not needed here, but it is a good practice
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).clear(); //not needed here, but it is a good practice
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignIn(){
        driver.findElement(signInButton).click();
    }


}
