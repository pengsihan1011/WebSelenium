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
    public void testAdd(){
        String phone = "18521550001";
        app.toMemberAdd().add(phone,phone,phone);
    }

    @Test
    public void testDelete(){
        String phone = "18521550002";
        app.toMemberAdd().add(phone,phone,phone).delete(phone);

    }



}
