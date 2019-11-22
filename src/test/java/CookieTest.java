import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CookieTest {
    WebDriver driver;

    @BeforeClass
    public void before(){
        driver = new ChromeDriver();
    }

    @Test   //打印cookies
    public void cookieTest(){
        for(Cookie cookie:driver.manage().getCookies()){
            System.out.println(cookie.getName());
            System.out.println(cookie.getValue());
        }
    }

    @Test   //删除cookies
    public void deleteCookieTest(){
        driver.manage().deleteAllCookies();
    }

    @Test   //添加cookies
    public void addCookie(){
        Cookie cookie = new Cookie("","","/",null); //注意有四个变量需要传入
        driver.manage().addCookie(cookie);
    }



}
