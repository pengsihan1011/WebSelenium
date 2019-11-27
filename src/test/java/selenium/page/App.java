package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class App extends BasePage {
    public App loginWithCookie(){
        String url="https://work.weixin.qq.com/";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("pageLoadStrategy","none");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //隐式等待5秒钟，页面没有加载出来，即报错
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("企业登录")).click();
//        System.out.println(driver.manage().getCookies()); //.sout 快捷用法，可直接打印
        driver.manage().addCookie(new Cookie("wwrtx.sid","pFBM-3tNpawbO5Ik6-5yvKrsBSo0nS2mxh5M3FTK8miWr8jAlnoyorBZ6S_zVrJ5"));
        driver.navigate().refresh();  //刷新页面
        return this;
    }

    public ContactPage toContact(){
        findElement(By.linkText("通讯录")).click();
        return new ContactPage();
    }

    public ContactPage toMemberAdd(){ //命名：名词在前动词在后 比较清晰
        waitClickable(By.linkText("设置所在部门"),5);
        findElement(By.linkText("添加成员")).click();
        try{
            waitClickable(By.linkText("保存并继续添加"),5);
        }catch (Exception e){
            System.out.println("从通讯录页进入添加成员失败");
        }
        return new ContactPage();
    }

    public BroadcastPage toGroupMessage(){
        findElement(By.linkText("管理工具")).click();
        findElement(By.cssSelector(".ww_icon_AppGroupMessageBig")).click();
        return new BroadcastPage();
    }

}
