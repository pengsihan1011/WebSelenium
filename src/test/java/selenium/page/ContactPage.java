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
        findElement(By.id("")).sendKeys(keyword);
        return this;
    }

    public void list(){

    }

}
