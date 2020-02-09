import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.xml.bind.Element;
import java.sql.Driver;


public class Test1 {


    private static String dropDown_css = "select[id='testingDropdown']";
    private static String textBox_css = "input[id='fname']";
    private static String Submit_css = "button[id='idOfButton']";
    private static String Radio_xpath = "//input [@id=\"male\"]";
    private static String Chekbox_xpath = " //input[@class='Automation']";
    private static String genbtntxt_xpath = "//button[contains(text(),'Generate Alert Box')]";
    private static String dblclick_xpath = "//button[@id='dblClkBtn']";
    private static String iFrame_xpath = "/html[1]/body[1]/a[1]/img[1]";

    @Test
    public void dropDown() {

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\src\\main\\resources\\chromedriver.exe");

        WebDriver ChDriver = new ChromeDriver();
        ChDriver.get("https://www.demo.guru99.com/test/guru99home/");
        ChDriver.manage().window().maximize();


        ChDriver.switchTo().frame("a077aa5e");
        ChDriver.findElement(By.xpath(iFrame_xpath)).click();



        //WebElement ele = ChDriver.findElement(By.cssSelector(dropDown_css));
  //      Select sel = new Select(ele);
//        sel.selectByVisibleText("Performance Testing");
        //       sel.selectByIndex(2);
      //  sel.selectByValue("Automation Testing");
        /*WebElement settxt = ChDriver.findElement(By.cssSelector(textBox_css));
        settxt.sendKeys("testtest");

        ChDriver.findElement(By.cssSelector(Submit_css)).click();
        ChDriver.findElement(By.xpath(Radio_xpath)).click();
ChDriver */


    }
}