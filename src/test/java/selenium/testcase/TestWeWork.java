package selenium.testcase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import selenium.page.App;

public class TestWeWork {
    public static App app;

    @BeforeClass
    public static void beforeAll(){
        app = new App();
        app.loginWithCookie();
        String phone = "18521550001";
        app.toContact().delete(phone);
    }

    @Test
    public void add(){
        String phone = "18521550001";
        app.toMemberAdd().add(phone,phone,phone);
    }

    @Test
    public void delete(){
        String phone = "18521550002";
        app.toMemberAdd().add(phone,phone,phone).delete(phone);

    }

    @Test
    public void deleteCurrentAll(){
        app.toContact().deleteCurrentAll();
    }

    @AfterClass
    public static void afterAll() throws InterruptedException {
        app.quit();
    }



}
