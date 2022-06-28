package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/** The page which the user is landing on after successful login*/
public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Locators
    @FindBy(id = "nav-link-profile")
    WebElement profileButton;

    @FindBy(id = "nav-link-new-post")
    WebElement newPostButton;

    @FindBy(xpath = "//*[contains(@class, 'sign-out')]")
    WebElement logoutButton;

    // Methods
    public boolean isNewPostButtonDisplayed(){
        return newPostButton.isDisplayed();
    }

    public boolean isLogoutButtonDisplayed(){
        return logoutButton.isDisplayed();
    }

    public void clickProfileButton(){
        profileButton.click();
    }

    public void clickLogoutButton(){
        logoutButton.click();
    }

}
