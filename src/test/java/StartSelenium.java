import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {

    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/");

    }

    @Test
    public void testName(){
        System.out.println("test started");
//      Old strategies
        wd.findElement(By.linkText("HOME"));
//      no cssSelector for that
        wd.findElement(By.xpath("//*[text()='HOME']"));
        wd.findElement(By.xpath("//*[.='HOME']"));
//      wd.findElement(By.partialLinkText("HO"));

        WebElement element = wd.findElement(By.tagName("a"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath("//a"));

        List<WebElement> elements = wd.findElements(By.tagName("div"));
        System.out.println(elements.size());
        List<WebElement> elements2 = wd.findElements(By.cssSelector("div"));
        System.out.println(elements2.size());
        List<WebElement> elements3 = wd.findElements(By.xpath("//div"));
        System.out.println(elements3.size());

        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.xpath("//*[@id='root']"));

        wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.xpath("//*[@href='/login']"));

        wd.findElement(By.cssSelector("[href^='/lo']"));
        wd.findElement(By.xpath("//*[starts-with(@href,'/lo')]"));

        wd.findElement(By.cssSelector("[href*='og']"));
        wd.findElement(By.xpath("//*[contains(@href,'og')]"));

        wd.findElement(By.cssSelector("[href$='gin']"));
//      no xPath for that

//        List<WebElement> buttons = wd.findElements(By.tagName("button"));
//        System.out.println(buttons.size());
//        List<WebElement> buttons2 = wd.findElements(By.cssSelector("button"));
//        System.out.println(buttons2.size());
//        List<WebElement> buttons3 = wd.findElements(By.xpath("//button"));
//        System.out.println(buttons3.size());


    }

    @Test
    public void testLogin(){
        System.out.println("test completed");

    }

    @AfterMethod
    public void postCondition(){

//       wd.close();
       wd.quit();

    }
}
