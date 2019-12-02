package selenium.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.page.App;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

public class TestGroupMessage {
    public static App app;

    @BeforeClass
    public static void beforeAll(){
        app = new App();
        app.loginWithCookie();
    }

    @Test
    public void send(){
        String  title = "你的快递到了" + System.currentTimeMillis();
        List<String> sendedMsg = app.toGroupMessage()
                                                    .send("思晗", title,"your EMS has been arrived", "EMS arrived","PSH")
                                                    .getSendedMsg().subList(0,3);
        System.out.println(sendedMsg);
        assertThat(sendedMsg, hasItem(title));
    }

    @AfterClass
    public static void afterAll() throws InterruptedException {
        app.quit();
    }
}
