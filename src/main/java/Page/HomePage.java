package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage {
    @FindBy(partialLinkText = "登录")
    WebElement LinklogIn;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickLogIn(){
        LinklogIn.click();
        Reporter.log("click login",true);
    }
}
