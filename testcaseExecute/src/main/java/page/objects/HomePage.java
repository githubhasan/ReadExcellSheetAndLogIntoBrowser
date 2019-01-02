package page.objects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BrowserDriver {

    private WebDriver driver;

//    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Log In")
//    private WebElement LogInBtn;
//
//    @FindBy(how = How.ID, id = "username")
//    private WebElement usernameBox;
//
//    @FindBy(how = How.ID, id = "password")
//    private WebElement passwordBox;


    @FindBy(how = How.ID, using = "search_text")
    private WebElement searchBox;

    @FindBy(how = How.CLASS_NAME, className = "SubmitLogin")
    private WebElement submitButton;

    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Log In")
    private WebElement LogInBtn;

    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Contact Us")
    private WebElement contactUs;

    public void clickContactUs(){

        ApplicationPageBase.isEnableStatus(driver, contactUs);
        contactUs.click();
    }

    public LogIn getLogIn() {
        LogInBtn.click();
        return new LogIn();
    }

    public String search() {
        searchBox.sendKeys("Innovera 20051 Compatible Ink", Keys.ENTER);
        String actualText = driver.findElement(By.partialLinkText("Innovera 20051 Compatible Ink")).getText();
        return actualText;

    }
}






//public class HomePage extends BrowserDriver {
//
//    @FindBy(how = How.ID, using = "search_text")
//    private WebElement searchBox1;
//
//    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Contact Us")
//    private WebElement contactUs;
//    public void clickContactUs(){
//    contactUs.click();
//    }
//
//    public String search ()
//    {
//    searchBox1.sendKeys("Laptop Sleeve", Keys.ENTER);
//    String actualText = driver.findElement(By.partialLinkText("Kensington SP17 17\" Classic Laptop Sleeve")).getText();
//    return actualText;
//
//    }
//
//}

























/*public HomePage() {
      // BrowserDriver.getUrl());
       // this.driver=BrowserDriver.getDriver();
        PageFactory.initElements(driver, this);
    }
*/