import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class autotests {

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "/Users/maxwell/Мое/Автотесты/ui-autotests/src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver", "/Users/maxwell/Downloads/chromedriver_mac64/chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://cristalblue.ru/");

    }

}
