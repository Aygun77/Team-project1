import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/Users/aygunaliyeva/Desktop/browsers/chromedriver");

            //Open a browser
            WebDriver driver = new ChromeDriver();

            //Navigate to home page
            driver.get("https://www.webstaurantstore.com");

            //Verify that the title is WebstaurantStore
            String actualTitle = driver.getTitle();
            String expectedTitle = "WebstaurantStore";

            if(actualTitle.contains("WebstaurantStore")){
                System.out.println("Pass");
            }else{
                System.out.println("Fail");
            }

            driver.quit();
        }
    }
