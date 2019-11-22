import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestWeChatCookie {

    @Test
    public void testWeChatCookie1(){
        String url="https://work.weixin.qq.com/";
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); //隐式等待5秒钟，页面没有加载出来，即报错
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("企业登录")).click();

        System.out.println(driver.manage().getCookies());

        driver.manage().addCookie(new Cookie("wwrtx.refid","33902839002603252"));
        driver.manage().addCookie(new Cookie("wwrtx.sid","pFBM-3tNpawbO5Ik6-5yvIFF48dPpEUkn7ZHwqzpbdO8O70IqsXlg6qP0dGZMJ42"));

        System.out.println(driver.manage().getCookies());

        driver.navigate().refresh();  //刷新页面
    }

}
