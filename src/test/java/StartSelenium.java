import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wd;

    @BeforeMethod
    public void preCondition(){

<<<<<<< Updated upstream
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/");
=======
       wd = new ChromeDriver();
       wd.get("https://telranedu.web.app/");
>>>>>>> Stashed changes

    }

    @Test
    public void testName(){
        System.out.println("test started");

    }

    @Test
    public void testLogin(){
        System.out.println("test completed");

    }

    @AfterMethod
    public void postCondition(){
<<<<<<< Updated upstream
        // wd.close();
=======
       // wd.close();
>>>>>>> Stashed changes
        wd.quit();

    }
}
