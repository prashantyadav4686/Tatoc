package com.qait.Tatoc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class tatocgame 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "/home/qainfotech/eclipse-workspace/selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.0.1.86/tatoc");
        driver.findElement(By.linkText("Basic Course")).click();
       driver.findElement(By.className("greenbox")).click();
       driver.switchTo().frame("main");
      WebElement el = driver.findElement(By.xpath("//div[@id='answer'][contains(text(),'Box 1')]"));
      String Str = el.getAttribute("className");
        System.out.println(Str);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("main");
        driver.switchTo().frame("child");
        WebElement el1 = driver.findElement(By.xpath("//div[@id='answer'][contains(text(),'Box 2')]"));
        String Str2 = el1.getAttribute("className");
          System.out.println(Str2);
       // driver.findElement(By.linkText("Repaint Box 2")).click();
    }
}
