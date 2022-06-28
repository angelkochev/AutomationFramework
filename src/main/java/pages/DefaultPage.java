package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The first page which the user is landing on when the URL is hit
 */
public class DefaultPage extends BasePage {

    public DefaultPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    @FindBy(id = "nav-link-login")
    WebElement loginButton;

    @FindBy(id = "nav-link-login")
    WebElement signInButton;

    // Methods
    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public boolean isSignInButtonDisplayed() {
        return signInButton.isDisplayed();
    }
}
