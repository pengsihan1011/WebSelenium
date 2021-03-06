// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
/*    @Test
    public void search() throws InterruptedException {
        driver.get("http://demo.cwledao.cn:9835/ld_uat/login.screen");
        Thread.sleep(5000);
        String parentHandle = driver.getWindowHandle();  //得到当前的windowhandle
        driver.findElement(By.cssSelector("#ext-gen4>input")).sendKeys("admin");
        driver.findElement(By.cssSelector("#ext-gen6>input")).sendKeys("ld@123");
        Thread.sleep(5000);
        driver.findElement(By.id("ext-gen8")).click();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);  //切换到新的windowhandle
        }
        Thread.sleep(3000);
        System.out.println(1);
    }*/
/*    @Test
    public void testSwitchWindow() throws InterruptedException {
        driver.get("https://hz.lianjia.com/");
        driver.manage().window().maximize();
        String handle1 = driver.getWindowHandle();
        System.out.println(handle1);
        for(WebElement e: driver.findElements(By.cssSelector(".home-nav a"))){
            if(e.findElement(By.tagName("b")).getText().equals("找二手房")){
                e.click();
                break;
            }
        }
        for(String handle: driver.getWindowHandles()){
            if(!handle.equals(handle1)){
                driver.switchTo().window(handle);
                Thread.sleep(5000);
                System.out.println(handle);
                break;
            }
        }
    }*/
    @Test
    public void testSwitchFrame() throws InterruptedException {
        driver.get("https://wwww.baidu.com");
        driver.manage().window().maximize();
        //System.out.println(driver.getPageSource());
        String handle1 = driver.getWindowHandle();
        System.out.println(1);
        for(WebElement e:driver.findElements(By.cssSelector("#u_sp a"))){
            if(e.getAttribute("class").equals("mnav")){
                e.click();
                break;
            }
        }

/*        for(WebElement e:driver.findElements(By.cssSelector("#u_sp a .mnav"))){
            if(e.getText().equals("新闻")){
                System.out.println(2);
                e.click();
                Thread.sleep(5000);
                break;
            }
        }*/
        for(String a:driver.getWindowHandles()){
            if(!a.equals(handle1)){
                driver.switchTo().window(a);
                Thread.sleep(5000);
            }
        }
/*        driver.switchTo().defaultContent();
        Thread.sleep(5000);*/
    }


}
