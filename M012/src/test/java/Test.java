import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.sql.Driver;

public class Test {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://practice.cydeo.com/nested_frames");
        WebElement element = driver.findElement(By.id("content"));
        //print MIDDLE
        System.out.println(element.getText());


        Thread.sleep(5000);

        driver.close();





    }
}
