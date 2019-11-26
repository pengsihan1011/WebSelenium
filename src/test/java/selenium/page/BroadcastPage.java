package selenium.page;

import org.openqa.selenium.By;

public class BroadcastPage extends BasePage{
    public BroadcastPage send(String range, String title, String body, String summary, String author){
        findElement(By.linkText("选择需要发消息的应用")).click();
        findElement(By.cssSelector(".ww_icon_AppNotice")).click();
        findElement(By.linkText("确定")).click();
        findElement(By.linkText("选择发送范围")).click();
        findElement(By.id("memberSearchInput")).sendKeys(range);
        findElement(By.cssSelector(".ww_searchResult_title_peopleName")).click();
        findElement(By.linkText("确定")).click();
        findElement(By.cssSelector(".ww_editorTitle")).sendKeys(title);
        findElement(By.cssSelector("msg_noticeEditor_frameBody")).sendKeys(body);
        findElement(By.cssSelector(".msg_edit_infoItem_textWord")).sendKeys(summary);
        findElement(By.cssSelector(".js_amrd_sendName")).sendKeys(author);
        findElement(By.linkText("发送")).click();
        return this;
    }
}
