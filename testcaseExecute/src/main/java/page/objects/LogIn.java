package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogIn extends ApplicationPageBase {


    private WebDriver driver;
    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Log In")
    private WebElement LogInBtn;

    @FindBy(how = How.ID, id = "username")
    private WebElement usernameBox;

    @FindBy(how = How.ID, id = "password")
    private WebElement passwordBox;

    @FindBy(how = How.CLASS_NAME, className= "SubmitLogin")
    private WebElement submitButton;

    public LogIn login (){


        //TestLogger.log("Sending keys to email box");

        sendKeys(usernameBox, "usernamebox", "shokat_hasan@yahoo.com");
        sendKeys(passwordBox, "passwordBox", "Test@1234");

        //usernameBox.sendKeys("shokat_hasan@yahoo.com");
        //passwordBox.sendKeys("Test@1234");
        return new LogIn();
    }

}


//    public void LogIn() throws InterruptedException {

//        driver.findElement(By.partialLinkText("Log In")).click();
//        Thread.sleep(500);
//        driver.findElement(By.id("username")).sendKeys("shokat_hasan@yahoo.com");
//        Thread.sleep(500);
//        driver.findElement(By.id("password")).sendKeys("Test@1234");
//        Thread.sleep(500);
//        driver.findElement(By.className("loginBtn")).click();
//        Thread.sleep(500);
//    }
//}
