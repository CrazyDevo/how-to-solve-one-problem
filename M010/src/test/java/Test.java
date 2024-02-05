import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/dynamic_loading");

        WebElement element5 = driver.findElement(By.xpath("//a[contains(.,'Example 5')]"));
        element5.click();

        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(3000);

        driver.close();
    }
}
