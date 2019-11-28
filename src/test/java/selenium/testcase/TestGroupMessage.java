package selenium.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.page.App;

public class TestGroupMessage {
    public static App app;

    @BeforeClass
    public static void beforeAll(){
        app = new App();
        app.loginWithCookie();
    }

    @Test
    public void send(){
        app.toGroupMessage().send("思晗","EMS","your EMS has been arrived",
                                "EMS arrived","PSH");
    }

    @AfterClass
    public static void afterAll() throws InterruptedException {
        app.quit();
    }
}
