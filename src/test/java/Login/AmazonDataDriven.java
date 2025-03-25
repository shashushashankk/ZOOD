package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners(com.zoodel.generic_android.ExtentReport_Android.class)
public class AmazonDataDriven {
    static  WebDriver driver;
    boolean isSetup = true;


    @BeforeMethod
    public void openBrowserAndNavigateToAmazon(ITestResult result) {
        if (isSetup) {
            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--headless");
//            options.addArguments("--allow-file-access-from-files");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://www.amazon.in");
            result.setAttribute("driver", driver);
//            isSetup = false;
        }
    }

    @Test(dataProvider = "Amazon Product Details", dataProviderClass = com.zoodel.utility.DataDrivenData.class)
    public void searchProduct(String product) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement searchTextField = driver.findElement(By.id("twotabsearchtextbox"));
        searchTextField.sendKeys(product);
        wait.until(ExpectedConditions.elementToBeClickable(searchTextField));
        searchTextField.click();
        WebElement searchIcon = driver.findElement(By.id("nav-search-submit-button"));
        wait.until(ExpectedConditions.elementToBeClickable(searchIcon));
        searchIcon.click();
        WebElement resultText = driver.findElement(By.xpath("//h2[text()='Results']"));
        wait.until(ExpectedConditions.visibilityOf(resultText));
        Assert.assertTrue(resultText.isDisplayed());
        driver.findElement(By.id("twotabsearchtextbox")).clear();
    }

        @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}