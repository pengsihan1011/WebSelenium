package selenium.page;

import org.openqa.selenium.By;

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
//        findElement(By.id("clearMemberSearchInput")).click();
        return this;
    }

    public void list(){

    }

}
