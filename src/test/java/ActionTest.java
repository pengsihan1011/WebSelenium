import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionTest {
    WebDriver driver;

    @BeforeClass
    public void before(){
        driver = new ChromeDriver();
    }

    @Test
    private void actionTest(){
        Actions action = new Actions(driver);
        action.keyDown(Keys.ENTER);
    }

}
