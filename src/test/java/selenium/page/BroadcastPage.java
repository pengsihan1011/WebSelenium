package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class BroadcastPage extends BasePage{
    public BroadcastPage send(String range, String title, String body, String summary, String author){
        findElement(By.linkText("选择需要发消息的应用")).click();
        findElement(By.cssSelector(".ww_icon_AppNotice")).click();
        findElement(By.linkText("确定")).click();
        findElement(By.linkText("选择发送范围")).click();
        findElement(By.id("memberSearchInput")).sendKeys(range);
        findElement(By.cssSelector(".ww_searchResult_title_peopleName")).click();
        findElement(By.linkText("确认")).click();

/*        WebElement element = findElement(By.linkText("存为草稿"));
        String js = "arguments[0].scrollIntoView(true)";
        ((JavascriptExecutor)driver).executeScript(js,element);*/
        ((JavascriptExecutor)driver).executeScript("window.scroll(0,800)");

        findElement(By.cssSelector(".msg_edit_infoItem_textWord")).click();
        findElement(By.cssSelector(".qui_textarea")).sendKeys(summary);

        findElement(By.cssSelector(".js_amrd_sendName")).sendKeys(author);
        findElement(By.cssSelector(".ww_editorTitle")).sendKeys(title);

        System.out.println(driver.getWindowHandles());
        driver.switchTo().frame(0);
        findElement(By.cssSelector(".msg_noticeEditor_frameBody")).sendKeys(body);

        driver.switchTo().parentFrame();
        findElement(By.linkText("发送")).click();
        findElement(By.linkText("确定")).click();
        return this;
    }
}
