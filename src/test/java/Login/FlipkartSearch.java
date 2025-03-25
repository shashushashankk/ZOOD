package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
@Listeners({com.zoodel.generic_android.ExtentReportListner.class})
public class FlipkartSearch {
    WebDriver driver;
    @BeforeClass
    public void navigateToFlipkart(){
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    @Test
    public void searchProduc(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }
}
