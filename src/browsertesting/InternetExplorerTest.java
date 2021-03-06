package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class InternetExplorerTest {

    public static void main(String[] args) {
        String baseUrl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer2.40.0.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        String Title = driver.getTitle();
        System.out.println(Title);
        driver.quit();

    }
}
