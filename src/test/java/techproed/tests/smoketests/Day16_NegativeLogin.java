package techproed.tests.smoketests;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.DefaultPage;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Day16_NegativeLogin {
    /*

Name:
Login screen error messages
Description:
User should see error message when user tries to login with incorrect credentials
Acceptance Criteria:
As admin or customer, I should be able to see error message, when I do not provide a correct email address or password in a pop up window
Error Message: invalid credentials
     */


    //dependenciese faker ekledik burda kullanmak icin


    HomePage homePage;
    LoginPage loginPage;
    Faker faker;
    DefaultPage defaultPage;



    @Test
    public void negativeLogin(){

        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        homePage = new HomePage();
        loginPage = new LoginPage();
        defaultPage=new DefaultPage();
        faker=new Faker();
        homePage.homeLoginButton.click();
        String fakeUsername=faker.internet().emailAddress();
        String fakePassword=faker.internet().password();
        System.out.println(fakeUsername);
        System.out.println(fakeUsername);
        loginPage.username.sendKeys(fakeUsername);
        loginPage.password.sendKeys(fakePassword);
        loginPage.loginButton.click();

        //      failed.wait issue
        //      Thread.sleep(1000);

        ReusableMethods.waitForVisibility(loginPage.invalidCredentialsErrorMessage,5);
        Assert.assertTrue(loginPage.invalidCredentialsErrorMessage.isDisplayed());


    }




}