package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
            waitClickable(By.linkText("编辑"),5);
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitClickable(By.cssSelector(".ww_checkbox"),5);
        List<WebElement>elements = driver.findElements(By.cssSelector(".ww_checkbox"));
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

    public void importFromFile(){
        findElement(By.partialLinkText("批量导入/导出")).click();
        findElement(By.linkText("文件导入")).click();
        findElement(By.id("js_upload_file_input"),0).sendKeys("/Users/pengsihan/Desktop/通讯录批量导入模板.xlsx");
        findElement(By.id("submit_csv")).click();
    }

    public void list(){

    }

}
