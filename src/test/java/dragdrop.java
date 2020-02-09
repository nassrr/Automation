import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragdrop {

    private static String Dblclick_xpath = "//button[@id='doubleClickBtn']";
   // private static String checkbox1_xpath = "//label[contains(text(),'2 Double')]";
   // private static String checkbox2_xpath = "//label[contains(text(),'1 Queen')]";


   // private static String drop_xpath = "//div[@id='droppable']";

@Test
    public void drgdrp(){


        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\src\\main\\resources\\chromedriver.exe");

        WebDriver ChDriver = new ChromeDriver();
        ChDriver.get("https://demoqa.com/tooltip-and-double-click/");
        ChDriver.manage().window().maximize();


    Actions action = new Actions(ChDriver);
    WebElement btn = ChDriver.findElement(By.xpath(Dblclick_xpath));
    action.doubleClick(btn).build().perform();


  //      ChDriver.findElement(By.xpath(checkbox_xpath)).click();
  //  ChDriver.findElement(By.xpath(checkbox1_xpath)).click();
   // ChDriver.findElement(By.xpath(checkbox2_xpath)).click();

       // WebElement from = ChDriver.findElement(By.xpath(drag_xpath));
       // WebElement to = ChDriver.findElement(By.xpath(drop_xpath));

       // Actions action = new Actions(ChDriver);

       // action.dragAndDrop(from, to).perform();

    }
}
