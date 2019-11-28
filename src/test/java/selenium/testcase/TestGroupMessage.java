package selenium.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.page.App;

import java.util.List;

import static org.junit.Assert.assertThat;

public class TestGroupMessage {
    public static App app;

    @BeforeClass
    public static void beforeAll(){
        app = new App();
        app.loginWithCookie();
    }

    @Test
    public void send(){
        String  title = "EMS1";
        List<String> sendedMsg = app.toGroupMessage()
                                                    .send("思晗", title,"your EMS has been arrived", "EMS arrived","PSH")
                                                    .getSendedMsg();
        assertThat(sendedMsg, );
    }


    @AfterClass
    public static void afterAll() throws InterruptedException {
        app.quit();
    }
}
