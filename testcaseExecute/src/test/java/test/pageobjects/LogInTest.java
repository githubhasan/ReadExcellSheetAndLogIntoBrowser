package test.pageobjects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.LogIn;


public class LogInTest extends ApplicationPageBase{
    LogIn objLogIn = null;
    HomePage objHomePage = null;

    @BeforeMethod
    public void initializationOfElements(){
        objLogIn = PageFactory.initElements(driver, LogIn.class);
        objHomePage = PageFactory.initElements(driver, HomePage.class);

    }

    @Test()
    public void invalidSignIn(){
        objHomePage.getLogIn();
        objLogIn.login();
    }
}






//public class LogInTest extends LogIn {
//    LogIn objOfLogIn = null;
//
//    @BeforeMethod
//    public void initializationOfElements() {
//
//        objOfLogIn = PageFactory.initElements(driver, LogIn.class);
//    }
//
//    @Test(priority = 3)
//    public void LogInTest() throws InterruptedException {
//        objOfLogIn.LogIn();
//        System.out.println("LogInPage - Test Passed");
//    }
//
//}

