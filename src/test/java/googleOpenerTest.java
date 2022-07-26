import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googleOpenerTest {
    @Test
    void openGoogle() {
        System.setProperty("webdriver.chrome.driver", "D:\\Soft\\Software\\Java\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.ru/");
    }
}
