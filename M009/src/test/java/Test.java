import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();

        driver.get("www.youtube.com");


        Thread.sleep(3000);

        driver.close();
    }
}
