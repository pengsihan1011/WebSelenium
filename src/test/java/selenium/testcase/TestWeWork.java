package selenium.testcase;

import org.junit.BeforeClass;
import org.junit.Test;
import selenium.page.App;

public class TestWeWork {
    public static App app;

    @BeforeClass
    public static void beforeAll(){
        app = new App();
        app.loginWithCookie();
    }

    @Test
    public void testStart(){
        String phone = "18521552066";
        app.toMemberAdd().add(phone,phone,phone);
    }


}
