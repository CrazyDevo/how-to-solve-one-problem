import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://practice.cydeo.com/nested_frames");
        WebElement element = driver.findElement(By.name("frame-left"));
        driver.switchTo().frame(element);
        //print LEFT

        WebElement element1 = driver.findElement(By.xpath("//body"));
        System.out.println(element1.getText());

    }
}
