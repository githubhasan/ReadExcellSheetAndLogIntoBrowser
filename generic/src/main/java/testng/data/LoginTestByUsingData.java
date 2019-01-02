package testng.data;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.TestUtil;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginTestByUsingData extends TestUtil{
WebDriver driver;

    @BeforeMethod
    public void setup(){
System.setProperty("webdriver.chrome.driver", "../generic/drivers/mac/chromedriver");
driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // 20
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //35
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.buyonlinenow.com");
    }

    @DataProvider
    public Object[][] getLoginData() throws IOException, InvalidFormatException {
        Object data [][] = TestUtil.getTestData("AccessTestData.xls");
        return data;

    }


@Test(dataProvider = "getLoginData")
    public void LoginTestByUsingData(String username, String password) throws InterruptedException {
    driver.findElement(By.id("username")).sendKeys(username);
        Thread.sleep(500);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(500);
        driver.findElement(By.className("loginBtn")).click();
        Thread.sleep(500);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
