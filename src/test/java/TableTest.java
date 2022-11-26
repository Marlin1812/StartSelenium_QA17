import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class TableTest {

    WebDriver wd;


    @BeforeMethod
    public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }


    @Test
    public void tableTestCSS() {
        WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child"));
        String text = canada.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Canada");

//        HW4-HW5

//        List<WebElement> row4 = wd.findElements(By.cssSelector("#customers tr:nth-child(4) td"));
        List<WebElement> row4 = wd.findElements(By.xpath("//*[@id='customers']//tr[4]"));
        text = "";
        for(WebElement e : row4) {
            System.out.println(e.getText());
            text = e.getText();
            if(text.contains("Mexico")) System.out.println("Yes!");
        }
        System.out.println(text.contains("Mexico"));

//        List<WebElement> rows = wd.findElements(By.cssSelector("#customers tr"));
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id='customers']//tr"));
        System.out.println(rows.size());

//        List<WebElement> cols = wd.findElements(By.cssSelector("#customers th"));
        List<WebElement> cols = wd.findElements(By.xpath("//*[@id='customers']//th"));
        System.out.println(cols.size());

//        List<WebElement> row3 = wd.findElements(By.cssSelector("#customers tr:nth-child(4)"));
        List<WebElement> row3 = wd.findElements(By.xpath("//*[@id='customers']//tr[4]"));
        for (WebElement e: row3) {
            System.out.println(e.getText());

        }

//        List<WebElement> lastCol = wd.findElements(By.cssSelector("#customers td:last-child"));
        List<WebElement> lastCol = wd.findElements(By.xpath("//*[@id='customers']//td[3]"));
        for (WebElement e: lastCol) {
            System.out.println(e.getText());
        }

//        List<WebElement> tr = wd.findElements(By.cssSelector("#customers tr"));
        List<WebElement> tr = wd.findElements(By.xpath("//*[@id='customers']//tr"));
        for (int i = 0; i < tr.size(); i++) {
            if (tr.get(i).getText().contains("Philip Cramer")){
                System.out.println(i+1);
                return;
            }

        }


    }



        @AfterMethod
        public void tearDown () {
            wd.quit();
        }
    }


