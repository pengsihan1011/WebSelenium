import Page.HomePage;
import Page.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogInPO {
    WebDriver driver;

    @BeforeClass
    public void before(){
        driver = new ChromeDriver();
    }

    @Test
    public void logIn(){
        //在浏览器输入网址
        driver.get("https://testerhome.com");
        //点击登录连接
/*        driver.findElement(By.linkText("登录")).click();
        Reporter.log("点击登录！",true);*/
        HomePage homePage = new HomePage(driver);
        homePage.clickLogIn();
        //输入用户名
/*        WebDriverWait wait = new WebDriverWait(driver,30);    //异步加载的时候用的多
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login"))).sendKeys("xx");
        Reporter.log("输入用户名xx",true);*/
        LogInPage loginPage = new LogInPage(driver);
//        loginPage.inputUsername("xxx");

        //输入密码
/*        driver.findElement(By.id("user_password")).sendKeys("xxx");
        System.out.println("输入密码：xxx");*/
//        loginPage.inputPassword("xxxxxx");

        //输入用户名和密码
        loginPage.businessLogin("xx","xxxx");

        //点击链接
        driver.findElement(By.name("commit")).click();
        System.out.println("点击提交！");
        //打印判断是否成功
        System.out.println("passed!");
    }

    @AfterClass
    public void after(){
        driver.quit();
    }
}
