package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class App extends BasePage {
    public App loginWithCookie(){
        String url="https://work.weixin.qq.com/";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //隐式等待5秒钟，页面没有加载出来，即报错
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("企业登录")).click();
//        System.out.println(driver.manage().getCookies()); //.sout 快捷用法，可直接打印
        driver.manage().addCookie(new Cookie("wwrtx.sid","pFBM-3tNpawbO5Ik6-5yvIv50zNd0errZeifugTnXuYeyM-2_ZXCToggNPShv2n-"));
        driver.navigate().refresh();  //刷新页面
        return this;
    }

    public ContactPage toContact(){
        findElement(By.linkText("通讯录")).click();
        return new ContactPage();
    }

    public ContactPage toMemberAdd(){ //命名：名词在前动词在后 比较清晰
        findElement(By.linkText("添加成员")).click();
        return new ContactPage();
    }

}
