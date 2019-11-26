package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public static WebDriver driver;

    public WebElement findElement(By by){
        return findElement(by,5);
    }

    public WebElement findElement(By by,int timeout){
        System.out.println(by);
        if(timeout > 0){
            waitClickable(by,5);
        }
        return driver.findElement(by);
    }

    public void waitClickable(By by){
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(by));
        new WebDriverWait(driver,3).until(ExpectedConditions.elementToBeClickable(by));
    }

    public void waitClickable(By by, int timeout){
        new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOfElementLocated(by));
        new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(by));
    }

    public void quit() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

}
