import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public class TakeScreenshotTest {
    WebDriver driver;

    @BeforeClass
    public void before(){
        driver = new ChromeDriver();
    }

    @Test
    public void screenTest(){
        driver.get("https://testerhome.com/");
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("E:\\study\\screenshot.png"));
        }catch (Exception ex){
            throw new SkipException(ex.getMessage());
        }
    }

}
