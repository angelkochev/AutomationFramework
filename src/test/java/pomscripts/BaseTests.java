package pomscripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class BaseTests {

    WebDriver driver;
    BasePage basePage;
    DefaultPage defaultPage;
    LoginForm loginForm;
    HomePage homePage;
    ProfilePage profilePage;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        basePage = new BasePage(driver);
        defaultPage = new DefaultPage(driver);
        loginForm = new LoginForm(driver);
        homePage = new HomePage(driver);
        profilePage = new ProfilePage(driver);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @Test(priority = 1)
    public void loginTest(){
        driver.get("http://training.skillo-bg.com/");
        defaultPage.clickLoginButton();
        loginForm.enterUsername("angel131we");
        loginForm.enterPassword("Test123!");
        loginForm.clickSignIn();
        Assert.assertTrue(homePage.isNewPostButtonDisplayed());
        Assert.assertTrue(homePage.isLogoutButtonDisplayed()); //Not a good practice to have two hard assertions in one test.
    }

    /*
    // same as loginTest
    @Test
    public void signInTest(){
        driver.get("http://training.skillo-bg.com/");
        defaultPage.clickSignInButton();
        loginForm.enterUsername("angel131we");
        loginForm.enterPassword("Test123!");
        loginForm.clickSignIn();
        Assert.assertTrue(homePage.isNewPostButtonDisplayed());
    }
    */

    @Test(priority = 2)
    public void getAllUserPosts() throws InterruptedException {
        driver.get("http://training.skillo-bg.com/posts/all");
        homePage.clickProfileButton();
        Assert.assertTrue(profilePage.verifyUserName());
        Thread.sleep(2000);
    }
}
