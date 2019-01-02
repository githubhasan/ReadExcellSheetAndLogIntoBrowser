package page.objects;
import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUsPage extends BrowserDriver {

    @FindBy(how = How.CLASS_NAME, className = "AG14")
    private  WebElement pageTitle;
    public String contactUs(){
    String getText = pageTitle.getText();
    return getText;
    }
}
