package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LogInPage {
    @FindBy(id = "user_login")
    WebElement InputUsername;

    @FindBy(id = "user_password")
    WebElement InputPassword;

    public LogInPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void inputUsername(String username){
        InputUsername.clear();
        InputUsername.sendKeys(username);
        Reporter.log("输入用户名",true);
    }

    public void inputPassword(String password){
        InputPassword.clear();
        InputPassword.sendKeys(password);
        Reporter.log("输入密码",true);
    }

    public void businessLogin(String username,String password){
        InputUsername.sendKeys(username);
        InputPassword.sendKeys(password);

    }


}
