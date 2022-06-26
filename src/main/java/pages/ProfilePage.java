package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(@class, 'profile-user-settings')]")
    WebElement userName;

    /*
    public void verifyUserName(WebElement userName) {
        this.userName = userName;
    }
    */

    public boolean verifyUserName() {
        userName.getText().equals("angel131we");
        return true;
    }
}
