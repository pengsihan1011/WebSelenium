import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptTest {
    WebDriver driver;

    @BeforeClass
    public void before(){
        driver = new ChromeDriver();
    }

/*    @Test //设置元素的某个属性值
    public void javascriptTest1(){
        driver.get("https://testerhome.com/");

        WebElement element = driver.findElement(By.cssSelector(".navbar-brand"));
        String style = "background:yellow";
        String js = "arguments[0].setAttribute('style',arguments[1])";
        ((JavascriptExecutor)driver).executeScript(js,element,style);
    }*/

/*    @Test   //将某元素滚动到屏幕可视区，顶部or底部与视图对齐
    public void javascriptTest2(){
        driver.get("https://testerhome.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.cssSelector("div.item.item5"));
        String js = "arguments[0].scrollIntoView(true);";
        ((JavascriptExecutor)driver).executeScript(js,element);
    }*/

/*    @Test   //scroll
    public void javaScriptTest3(){
        driver.get("https://testerhome.com/");
        String js = "document.documentElement.scrollTop = 1000";
        ((JavascriptExecutor)driver).executeScript(js);
    }*/

    @Test
    public void returnValue(){
        driver.get("https://testerhome.com/");
        driver.manage().window().maximize();
        String js = "return window.innerWidth;";
        System.out.println(((JavascriptExecutor)driver).executeScript(js));
        String js1 = "return document.documentElement.scrollTop;";
        System.out.println(((JavascriptExecutor)driver).executeScript(js1));
    }


}
