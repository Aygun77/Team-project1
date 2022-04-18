import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testNG {

    @Test
    public void testCase1() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.get("https://www.webstaurantstore.com");

        Assert.assertTrue(driver.getTitle().equals("WebstaurantStore"));

        driver.quit();

    }
}
