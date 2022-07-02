package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);   //standard constructor
    }

    //we will locate the login elements in our homepage on the right top

    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginButton;





}