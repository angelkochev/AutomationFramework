package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(@class, 'profile-user-settings')]") //or xpath = "//h2[text()='nikidm-testing-user']"
    WebElement userName;

    @FindBy(xpath = "//*[contains(@class, 'btn-all')]")
    WebElement allPostsButton;

    @FindBy(xpath = "//strong[@class='profile-stat-count']")
    WebElement postsCount;

    public boolean isAllPostsButtonDisplayed(){
        return allPostsButton.isDisplayed();
    }

    public boolean isUserNameDisplayed() {
        return(userName).isDisplayed();
    }

    public boolean verifyUserName() {
        return userName.getText().equals("angel131we");
    }

}
