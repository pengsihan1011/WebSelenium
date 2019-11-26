package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ContactPage extends BasePage{

    public ContactPage add(String username, String userid, String phone){
        findElement(By.name("username")).sendKeys(username);
        findElement(By.name("acctid")).sendKeys(userid);
        findElement(By.name("mobile")).sendKeys(phone);
        findElement(By.linkText("保存")).click();
        return this;
    }

    public ContactPage delete(String keyword){
        findElement(By.id("memberSearchInput")).clear();
        findElement(By.id("memberSearchInput")).sendKeys(keyword);
        try{
            watClickable(By.linkText("编辑"),5);
        }catch (Exception e ){
            System.out.println("not found 编辑");
            return this;
        }
        findElement(By.linkText("删除")).click();
        findElement(By.linkText("确认")).click();
        return this;
    }

    public ContactPage deleteCurrentAll(){
//        findElement(By.cssSelector(".ww_checkbox")).click();
        watClickable(By.cssSelector(".ww_checkbox"),5);
        List<WebElement>elements = driver.findElements(By.cssSelector(".ww_checkbox"));
        //stale element reference:element is not attached to the page document存在动态变化的页面
        for(int i =1; i<elements.size();i++){
            System.out.println(i);
            elements.get(i).click();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        findElement(By.linkText("删除")).click();
        findElement(By.linkText("确认")).click();
        return this;
    }

    public void list(){

    }

}
