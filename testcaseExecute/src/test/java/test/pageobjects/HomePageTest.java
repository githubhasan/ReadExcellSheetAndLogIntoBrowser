package test.pageobjects;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.HomePage;

public class HomePageTest {

    private WebDriver driver;

   HomePage objOfHomePage = null;

//    @BeforeMethod
//    public void initializationOfElements() {
//    objOfHomePage = PageFactory.initElements(driver, HomePage.class);
//    }

    @Test
    public void searchTest (){

    String actualText = objOfHomePage.search();
    Assert.assertEquals(actualText, "Innovera 20051 Compatible Ink");
    System.out.println("HomePage Search - Test Passed");

    }
}

