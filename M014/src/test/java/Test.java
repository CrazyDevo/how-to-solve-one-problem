import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();

        driver.get("https://practice.cydeo.com/windows");

        driver.findElement(By.xpath("//a[.='Click Here']")).click();

        driver.switchTo().window("New Window");

        WebElement element = driver.findElement(By.xpath("//h3"));

        //print New Window

        System.out.println(element.getText());

        Thread.sleep(5000);

        driver.close();


    }
}
